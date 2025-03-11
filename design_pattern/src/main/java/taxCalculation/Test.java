/*
 * @ {#} Test.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package taxCalculation;

import taxCalculation.decorator.BasicProduct;
import taxCalculation.decorator.LuxuryProduct;
import taxCalculation.decorator.TaxableProduct;
import taxCalculation.decorator.VATProduct;
import taxCalculation.state.LuxuryTaxState;
import taxCalculation.state.NoTaxState;
import taxCalculation.state.VATState;
import taxCalculation.strategy.ConsumptionTax;
import taxCalculation.strategy.SpecialTax;
import taxCalculation.strategy.TaxCalculator;
import taxCalculation.strategy.VATTax;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("1. Test State Pattern");
        Product product1 = new Product(new NoTaxState(), 100);
        System.out.println("Price with tax: " + product1.getPriceWithTax());
        Product product2 = new Product(new VATState(), 200);
        System.out.println("Price with tax: " + product2.getPriceWithTax());
        Product product3 = new Product(new LuxuryTaxState(), 300);
        System.out.println("Price with tax: " + product3.getPriceWithTax());

        System.out.println("2. Test Strategy Pattern");
        TaxCalculator taxCalculator = new TaxCalculator(new VATTax());
        System.out.println("Giá sau VAT: " + taxCalculator.calculate(100));
        taxCalculator = new TaxCalculator(new SpecialTax());
        System.out.println("Giá sau thuế đặc biệt: " + taxCalculator.calculate(100));
        taxCalculator = new TaxCalculator(new ConsumptionTax());
        System.out.println("Giá sau thuế tiêu thụ: " + taxCalculator.calculate(100));

        System.out.println("3. Test Decorator Pattern");
        TaxableProduct basic = new BasicProduct(100);
        TaxableProduct vatProduct = new VATProduct(basic);
        TaxableProduct luxuryProduct = new LuxuryProduct(basic);
        System.out.println("Giá sản phẩm cơ bản: " + basic.getPrice());
        System.out.println("Giá sản phẩm sau VAT: " + vatProduct.getPrice());
        System.out.println("Giá sản phẩm sau thuế xa xĩ: " + luxuryProduct.getPrice());
    }
}

