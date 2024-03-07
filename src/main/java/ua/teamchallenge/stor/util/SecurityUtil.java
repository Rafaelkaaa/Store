package ua.teamchallenge.stor.util;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public final class SecurityUtil {

    public SecurityUtil() { }

    public static Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public static String getUsername() {
        return getAuthentication().getName();
    }

    public static boolean isAuthenticated() {
        return getAuthentication() != null;
    }

    public static void setAuthentication(UsernamePasswordAuthenticationToken authenticationToken) {
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
    }
}
