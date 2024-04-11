package ua.com.teamchallenge.store.config.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.SecurityWebFiltersOrder;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.util.matcher.PathPatternParserServerWebExchangeMatcher;

import static org.springframework.http.HttpMethod.*;
import static ua.com.teamchallenge.store.persistence.type.PermissionType.*;
import static ua.com.teamchallenge.store.persistence.type.RoleType.PERSONAL;

@Configuration
@EnableMethodSecurity
@EnableWebFluxSecurity
@RequiredArgsConstructor
public class AuthorizationSecurityConfig {

    private final ReactiveAuthenticationManager reactiveAuthenticationManager;
    private final JwtAuthenticationFilter jwtAuthenticationFilter;

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
        return http
                .csrf(ServerHttpSecurity.CsrfSpec::disable)
                .securityMatcher(new PathPatternParserServerWebExchangeMatcher("/api/**"))
                .authorizeExchange((authorize) -> authorize
                        .pathMatchers("/api/open/**", "/api/auth/**", "/swagger-ui.html").permitAll()
                        .pathMatchers("/api/personal/**").hasAnyRole(PERSONAL.name())
                        .pathMatchers(GET, "/api/personal/**").hasAuthority(PERSON_READ.name())
                        .pathMatchers(POST, "/api/personal/**").hasAuthority(PERSON_CREATE.name())
                        .pathMatchers(PUT, "/api/personal/**").hasAuthority(PERSON_UPDATE.name())
                        .pathMatchers(DELETE, "/api/personal/**").hasAuthority(PERSON_DELETE.name())
                        .pathMatchers(GET, "/api/admin/**").hasAuthority(ADMIN_READ.name())
                        .pathMatchers(POST, "/api/admin/**").hasAuthority(ADMIN_CREATE.name())
                        .pathMatchers(PUT, "/api/admin/**").hasAuthority(ADMIN_UPDATE.name())
                        .pathMatchers(DELETE, "/api/admin/**").hasAuthority(ADMIN_DELETE.name())
                        .anyExchange().authenticated()
                )
                .authenticationManager(reactiveAuthenticationManager)
                .addFilterBefore(jwtAuthenticationFilter, SecurityWebFiltersOrder.AUTHENTICATION)
                .build();
    }
}
