/*
 * @ {#} StandardProcessingStrategy.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package orderManagement.strategy;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
public class StandardProcessingStrategy implements OrderProcessingStrategy {
    @Override
    public void processOrder() {
        System.out.println("Xử lý đơn hàng theo phương thức tiêu chuẩn.");
    }
}

