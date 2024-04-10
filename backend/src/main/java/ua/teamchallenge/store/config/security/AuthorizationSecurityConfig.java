package ua.teamchallenge.store.config.security;

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

import static ua.teamchallenge.store.persistence.type.PermissionType.*;
import static ua.teamchallenge.store.persistence.type.RoleType.ADMIN;
import static ua.teamchallenge.store.persistence.type.RoleType.PERSONAL;
import static org.springframework.http.HttpMethod.*;

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
                        .pathMatchers("/api/admin/**").hasRole(ADMIN.name())
                        .pathMatchers(GET, "/api/personal/**").hasAuthority(PERSONAL_READ.name())
                        .pathMatchers(POST, "/api/personal/**").hasAuthority(PERSONAL_CREATE.name())
                        .pathMatchers(PUT, "/api/personal/**").hasAuthority(PERSONAL_UPDATE.name())
                        .pathMatchers(DELETE, "/api/personal/**").hasAuthority(PERSONAL_DELETE.name())
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
