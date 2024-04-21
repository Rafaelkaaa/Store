package ua.com.teamchallenge.store.config.security;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;
import ua.com.teamchallenge.store.util.SecurityUtil;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter implements WebFilter {

    private final JwtService jwtService;
    private final ReactiveUserDetailsService userDetailsService;

    @NonNull
    @Override
    public Mono<Void> filter(ServerWebExchange exchange,
                             @NonNull WebFilterChain chain) {
        String ipAddress = Objects.requireNonNull(exchange.getRequest().getRemoteAddress()).getAddress().getHostAddress();
        String userAgent = exchange.getRequest().getHeaders().getFirst("User-Agent");
        String path = exchange.getRequest().getPath().value();

        if (path.contains("/api/open") || path.contains("/api/auth")) {
            return chain.filter(exchange);
        }

        String authHeader = exchange.getRequest().getHeaders().getFirst("Authorization");
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            return chain.filter(exchange);
        }

        String jwt = authHeader.substring(7);
        List<String> roles = jwtService.getRoles(jwt);
        String login = jwtService.extractUsername(jwt);

        if (StringUtils.isNotBlank(login) && !SecurityUtil.isAuthenticated()) {
            return userDetailsService.findByUsername(login)
                    .flatMap(userDetails -> {
                        if (jwtService.isNotExpiredToken(jwt)) {
                            var authToken =
                                    new UsernamePasswordAuthenticationToken(
                                            userDetails, null, roles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
                            authToken.setDetails(new WebAuthenticationDetails(ipAddress, userAgent));
                            SecurityUtil.setAuthentication(authToken);
                            return chain.filter(exchange);
                        } else {
                            return Mono.error(new RuntimeException("Token has expired"));
                        }
                    })
                    .switchIfEmpty(Mono.defer(() -> chain.filter(exchange)));
        } else {
            return chain.filter(exchange);
        }
    }
}
