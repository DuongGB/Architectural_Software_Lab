/*
 * @ {#} BasicProduct.java   1.0     3/11/2025
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
public class BasicProduct implements TaxableProduct {
    private double price;

    public BasicProduct(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

