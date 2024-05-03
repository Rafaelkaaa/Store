package ua.com.teamchallenge.store.config.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Component
public class JwtService {

    @Value("${application.security.jwt.secret-key}")
    private String secretKey;

    @Value("${application.security.jwt.secret-key-for-refresh}")
    private String secretKeyForRefreshToken;

    @Value("${application.security.jwt.expiration}")
    private long expiredTime;

    @Value("${application.security.jwt.expiration-for-refresh}")
    private long expiredTimeForRefresh;

    private static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public Mono<String> generateToken(UserDetails userDetails) {
        return generateToken(secretKey, userDetails, expiredTime);
    }

    public Mono<String> generateRefreshToken(UserDetails userDetails) {
        return generateToken(secretKeyForRefreshToken, userDetails, expiredTimeForRefresh);
    }

    private Mono<String> generateToken(String secret, UserDetails userDetails, long tokenLifetime) {
        Map<String, Object> claims = new HashMap<>();
        List<String> roleList = userDetails.getAuthorities()
                .stream()
                .map(GrantedAuthority::getAuthority)
                .toList();
        claims.put("roles", roleList);

        Date issuedDate = new Date();
        Date expiredDate = new Date(issuedDate.getTime() + tokenLifetime);

        return Mono.just(
                Jwts.builder()
                        .setClaims(claims)
                        .setSubject(userDetails.getUsername())
                        .setIssuedAt(issuedDate)
                        .setExpiration(expiredDate)
                        .signWith(key)
                        .compact()
        );
    }

    private Claims extractAllClaims(String token) {
        return Jwts
                .parserBuilder()
                .setSigningKey(getSigningKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private <T> T extractClaim(String token, Function<Claims, T> claimsTFunction) {
        final Claims claims = extractAllClaims(token);
        return claimsTFunction.apply(claims);
    }

    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    public Boolean isNotExpiredToken(String token) {
        Date expiration = extractClaim(token, Claims::getExpiration);
        return expiration.after(new Date());
    }


    public List<String> getRoles(String token) {
        return extractAllClaims(token).get("roles", List.class);
    }


    private Key getSigningKey() {
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretKey));
    }
}
