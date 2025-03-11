/*
 * @ {#} TestStrategy.java   1.0     3/11/2025
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
public class TestStrategy {
    public static void main(String[] args) {
        Order order1 =  new Order(new StandardProcessingStrategy());
        order1.processOrder();

        Order order2 =  new Order(new ExpressProcessingStrategy());
        order2.processOrder();
    }
}

