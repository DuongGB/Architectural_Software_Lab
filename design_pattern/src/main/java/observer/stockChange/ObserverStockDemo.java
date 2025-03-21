/*
 * @ {#} ObserverStockDemo.java   1.0     3/21/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package observer.stockChange;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/21/2025
 * @version:    1.0
 */
public class ObserverStockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("Stock 1", 100);
        Investor investor1 = new ConcreteInvestor("Investor 1");
        Investor investor2 = new ConcreteInvestor("Investor 2");

        stock.attach(investor1);
        stock.attach(investor2);

        stock.setPrice(200);
        stock.setPrice(300);

        stock.detach(investor1);
        stock.setPrice(400);
    }
}

