/*
 * @ {#} OrderRepository.java   1.0     4/25/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package vn.edu.iuh.fit.orderservice.repositories;

import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   4/25/2025
 * @version:    1.0
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}

