/*
 * @ {#} PendingState.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package paymentSystem.state;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
public class PendingState implements PaymentState{
    @Override
    public void processPayment(PaymentContext context) {
        System.out.println("Thanh toán đang chờ xử lý");
        context.setState(new CompletedState());
    }
}

