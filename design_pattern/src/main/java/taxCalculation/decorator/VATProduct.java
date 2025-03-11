/*
 * @ {#} VATProduct.java   1.0     3/11/2025
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
public class VATProduct extends TaxDecorator {
    public VATProduct(TaxableProduct taxableProduct) {
        super(taxableProduct);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.1; // 10% VAT
    }
}

