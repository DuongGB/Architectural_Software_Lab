/*
 * @ {#} OrderServiceImpl.java   1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.orderservice.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.orderservice.entities.Order;
import vn.edu.iuh.fit.orderservice.repositories.OrderRepository;
import vn.edu.iuh.fit.orderservice.services.OrderService;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   4/25/2025
 * @version:    1.0
 */
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order findById(long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }
}

