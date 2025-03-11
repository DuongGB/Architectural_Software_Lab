/*
 * @ {#} Product.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package taxCalculation;

import taxCalculation.state.TaxState;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
public class Product {
    private TaxState taxState;
    private double price;

    public Product(TaxState taxState, double price) {
        this.taxState = taxState;
        this.price = price;
    }

    public double getPriceWithTax() {
        return price + taxState.calculateTax(price);
    }
}

