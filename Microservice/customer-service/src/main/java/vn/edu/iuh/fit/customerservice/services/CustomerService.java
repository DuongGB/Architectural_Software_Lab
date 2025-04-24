/*
 * @ {#} CustomerService.java   1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.customerservice.services;

import vn.edu.iuh.fit.customerservice.entities.Customer;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   4/25/2025
 * @version:    1.0
 */
public interface CustomerService {
    public Customer save(Customer customer);
    public Customer findById(long id);
}
