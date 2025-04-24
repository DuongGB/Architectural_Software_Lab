/*
 * @ {#} SignInResponse.java   1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.identityservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   4/25/2025
 * @version:    1.0
 */
@Data
@AllArgsConstructor
public class SignInResponse {
    private String token;
}
