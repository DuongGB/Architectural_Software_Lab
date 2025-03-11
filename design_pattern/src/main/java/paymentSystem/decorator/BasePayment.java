/*
 * @ {#} BasePayment.java   1.0     3/11/2025
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
public class BasePayment implements Payment {
    private double amount;

    public BasePayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}

