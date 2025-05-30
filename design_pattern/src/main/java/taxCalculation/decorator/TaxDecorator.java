/*
 * @ {#} TaxDecorator.java   1.0     3/11/2025
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
public class TaxDecorator implements TaxableProduct {
    protected TaxableProduct taxableProduct;

    public TaxDecorator(TaxableProduct taxableProduct) {
        this.taxableProduct = taxableProduct;
    }

    @Override
    public double getPrice() {
        return taxableProduct.getPrice();
    }
}

