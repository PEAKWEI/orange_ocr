package com.dgw.orangeserver.service;

import org.springframework.security.core.Authentication;

public interface AuthenticationService {
    Authentication getAuthentication();
}