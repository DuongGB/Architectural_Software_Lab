/*
 * @ {#} SpecialTax.java   1.0     3/11/2025
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
public class SpecialTax implements TaxStrategy {
    @Override
    public double applyTax(double price) {
        return price * 0.15; // 15% Special Tax
    }
}

