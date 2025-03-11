/*
 * @ {#} PaymentContext.java   1.0     3/11/2025
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
public class PaymentContext {
    private PaymentState state;

    public void setState(PaymentState state) {
        this.state = state;
    }

    public void processPayment() {
        state.processPayment(this);
    }
}

