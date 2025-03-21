/*
 * @ {#} JSONService.java   1.0     3/21/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package adapter;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/21/2025
 * @version:    1.0
 */
// Concrete JSONProcessor
public class JSONService implements JSONProcessor {
    @Override
    public void processJSON(String jsonData) {
        System.out.println("Processing JSON data: " + jsonData);
    }
}

