/*
 * @ {#} Test.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package orderManagement;

import orderManagement.decorator.BasicOrder;
import orderManagement.decorator.GiftWrappedOrder;
import orderManagement.state.*;
import orderManagement.strategy.ExpressProcessingStrategy;
import orderManagement.strategy.Order;
import orderManagement.strategy.StandardProcessingStrategy;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
public class Test {
    public static void main(String[] args) {
        // Test State Pattern
        System.out.println("1. Test State Pattern");
        OrderContext orderContext = new OrderContext();
        State processingOrderState = new ProcessingOrderState();
        State deliveredOrderState = new DeliveredOrderState();
        State cancelOrderState = new CanceledOrderState();

        orderContext.setState(processingOrderState);
        orderContext.handleOrder();

        orderContext.setState(deliveredOrderState);
        orderContext.handleOrder();

        orderContext.setState(cancelOrderState);
        orderContext.handleOrder();
        // Test Strategy Pattern
        System.out.println("2. Test Strategy Pattern");
        Order order1 = new Order(new StandardProcessingStrategy());
        order1.processOrder();

        Order order2 = new Order(new ExpressProcessingStrategy());
        order2.processOrder();
        // Test Decorator Pattern
        System.out.println("3. Test Decorator Pattern");
        orderManagement.decorator.Order giftWrappedOrder = new GiftWrappedOrder(new BasicOrder());
        giftWrappedOrder.display();
        System.out.println();
        orderManagement.decorator.Order basicOrder = new BasicOrder();
        basicOrder.display();
    }
}

