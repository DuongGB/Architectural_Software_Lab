/*
 * @ {#} LuxuryProduct.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package taxCalculation.decorator;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
public class LuxuryProduct extends TaxDecorator {
    public LuxuryProduct(TaxableProduct taxableProduct) {
        super(taxableProduct);
    }

    public double getPrice() {
        return super.getPrice() * 1.3; // 30% luxury tax
    }
}

