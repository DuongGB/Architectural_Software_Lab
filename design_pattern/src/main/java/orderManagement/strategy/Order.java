/*
 * @ {#} Order.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package orderManagement.strategy;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
public class Order {
    private OrderProcessingStrategy strategy;

    public Order(OrderProcessingStrategy strategy) {
        this.strategy = strategy;
    }

    public void processOrder() {
        strategy.processOrder();
    }
}

