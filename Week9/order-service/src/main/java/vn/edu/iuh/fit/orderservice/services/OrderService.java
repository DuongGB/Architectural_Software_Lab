/*
 * @ {#} OrderService.java   1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.orderservice.services;

import vn.edu.iuh.fit.orderservice.models.Order;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   4/25/2025
 * @version:    1.0
 */
public interface OrderService {
    public Order createOrder(Order order);

    public Order getOrderById(Long id);
}

