/*
 * @ {#} TaxCalculator.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package taxCalculation.strategy;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
public class TaxCalculator {
    private TaxStrategy taxStrategy;

    public TaxCalculator(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculate(double price) {
        return price + taxStrategy.applyTax(price);
    }
}

