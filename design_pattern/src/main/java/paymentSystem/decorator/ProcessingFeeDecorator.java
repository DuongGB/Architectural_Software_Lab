/*
 * @ {#} ProcessingFeeDecorator.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package paymentSystem.decorator;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
public class ProcessingFeeDecorator implements Payment {
    private Payment payment;

    public ProcessingFeeDecorator(Payment payment) {
        this.payment = payment;
    }

    @Override
    public double getAmount() {
        return payment.getAmount() + 50;
    }
}

