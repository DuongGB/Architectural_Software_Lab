/*
 * @ {#} AuthService.java   1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.identityservice.services;

import org.springframework.http.ResponseEntity;
import vn.edu.iuh.fit.identityservice.dtos.SignInRequest;
import vn.edu.iuh.fit.identityservice.dtos.SignUpRequest;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   4/25/2025
 * @version:    1.0
 */
public interface AuthService {
    ResponseEntity<?> signIn(SignInRequest signInRequest);

    ResponseEntity<?> signUp(SignUpRequest signUpRequest);
}
