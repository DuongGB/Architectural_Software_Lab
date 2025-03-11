/*
 * @ {#} BasicOrder.java   1.0     3/11/2025
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
public class BasicOrder implements Order {

    @Override
    public void display() {
        System.out.print("Đơn hàng cơ bản.");
    }
}

