/*
 * @ {#} TestState.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package state;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
public class TestState {
    public static void main(String[] args) {
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

    }
}

