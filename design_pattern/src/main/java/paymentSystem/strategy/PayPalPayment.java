/*
 * @ {#} PayPalPayment.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package paymentSystem.strategy;

import paymentSystem.state.CompletedState;
import paymentSystem.state.PaymentContext;
import paymentSystem.state.PaymentState;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng PayPal");
        PaymentContext context = new PaymentContext();
        PaymentState state = new CompletedState();
        context.setState(state);
        context.processPayment();
    }
}

