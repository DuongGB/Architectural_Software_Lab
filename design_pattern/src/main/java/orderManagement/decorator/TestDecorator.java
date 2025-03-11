/*
 * @ {#} TestDecorator.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package orderManagement.decorator;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
public class TestDecorator {
    public static void main(String[] args) {
        Order giftWrappedOrder = new GiftWrappedOrder(new BasicOrder());
        giftWrappedOrder.display();
        System.out.println();
        Order basicOrder = new BasicOrder();
        basicOrder.display();
    }
}

