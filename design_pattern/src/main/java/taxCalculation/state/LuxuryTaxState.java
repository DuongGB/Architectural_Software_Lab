/*
 * @ {#} LuxuryTaxState.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package taxCalculation.state;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
public class LuxuryTaxState implements TaxState {
    @Override
    public double calculateTax(double price) {
        return price * 0.2; // 20% luxury tax
    }
}

