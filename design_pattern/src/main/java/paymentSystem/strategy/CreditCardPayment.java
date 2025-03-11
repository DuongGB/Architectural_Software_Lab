/*
 * @ {#} CreditCardPayment.java   1.0     3/11/2025
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
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardPayment(String cardNumber, String cvv, String dateOfExpiry) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }


    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán bằng thẻ tín dụng");
        PaymentContext context = new PaymentContext();
        PaymentState state = new CompletedState();
        context.setState(state);
        context.processPayment();
    }
}

