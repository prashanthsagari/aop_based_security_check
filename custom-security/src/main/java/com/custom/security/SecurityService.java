package com.custom.security;

import org.springframework.stereotype.Service;

@Service
public class SecurityService {

    public void checkRole(String requiredRole) {
//        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    	System.out.println("hey acces");
        boolean hasRole = false;
        if (!hasRole) {
            throw new SecurityException("Access Denied: Insufficient permissions for " + requiredRole);
        }
    }
}
