/*
 * @ {#} OrderContext.java   1.0     3/11/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package orderManagement.state;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/11/2025
 * @version:    1.0
 */
// Lớp OrderContext chứa trạng thái của đơn hàng
public class OrderContext {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void handleOrder() {
        state.handleOrder(this);
    }
}

