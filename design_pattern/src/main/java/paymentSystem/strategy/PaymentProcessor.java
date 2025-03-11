/*
 * @ {#} PaymentProcessor.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package paymentSystem.strategy;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
public class PaymentProcessor {
    private PaymentStrategy strategy;

    public PaymentProcessor(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(double amount) {
        strategy.pay(amount);
    }
}

