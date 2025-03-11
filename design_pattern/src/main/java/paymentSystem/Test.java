/*
 * @ {#} Test.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package paymentSystem;

import com.sun.tools.javac.Main;
import paymentSystem.decorator.BasePayment;
import paymentSystem.decorator.DiscountDecorator;
import paymentSystem.decorator.Payment;
import paymentSystem.decorator.ProcessingFeeDecorator;
import paymentSystem.state.*;
import paymentSystem.strategy.CreditCardPayment;
import paymentSystem.strategy.PayPalPayment;
import paymentSystem.strategy.PaymentProcessor;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
public class Test {
    public static void main(String[] args) {
        // 1. Test State Pattern
        System.out.println("1. Test State Pattern");
        PaymentContext context = new PaymentContext();
        PaymentState state1 = new PendingState();
        PaymentState state2 = new CompletedState();
        PaymentState state3 = new FailedState();
        context.setState(state1);
        context.processPayment();
        context.setState(state2);
        context.processPayment();
        context.setState(state3);
        context.processPayment();

        // 2. Test Strategy Pattern
        System.out.println("2. Test Strategy Pattern");
        CreditCardPayment creditCardPayment = new CreditCardPayment("123456789", "Nguyen Van A", "12/25");
        PaymentProcessor creditCard = new PaymentProcessor(creditCardPayment);
        PayPalPayment payPalPayment = new PayPalPayment("duong@gmail.com", "123456");
        PaymentProcessor payPal = new PaymentProcessor(payPalPayment);
        creditCard.pay(100);
        System.out.println();
        payPal.pay(200);
        // 3. Test Decorator Pattern
        System.out.println("3. Test Decorator Pattern");
        Payment basePayment = new BasePayment(1000);
        Payment feePayment = new ProcessingFeeDecorator(basePayment);
        Payment discountPayment = new DiscountDecorator(basePayment);
        System.out.println("Số tiền sau trả basePayment: " + basePayment.getAmount());
        System.out.println("Số tiền sau trả feePayment: " + feePayment.getAmount());
        System.out.println("Số tiền áp dụng discountPayment: " + discountPayment.getAmount());

    }
}

