package com.custom.security;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {

	private final SecurityService securityService;

	public SecurityAspect(SecurityService securityService) {
		this.securityService = securityService;
	}

	@Before("@annotation(com.custom.security.annotations.AdminAccess)")
	public void enforceAdminAccess() {
		System.out.println("ADMIN ACCESS");
		securityService.checkRole("ROLE_ADMIN");
	}

	@Before("@annotation(com.custom.security.annotations.WriteAccess)")
	public void enforceWriteAccess() {
		System.out.println("ROLE_WRITE ACCESS");
		securityService.checkRole("ROLE_WRITE");
	}

	@Before("@annotation(com.custom.security.annotations.ReadAccess)")
	public void enforceReadAccess() {
		System.out.println("ROLE_READ ACCESS");
		securityService.checkRole("ROLE_READ");
	}
}
