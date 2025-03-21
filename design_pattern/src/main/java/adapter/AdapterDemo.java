/*
 * @ {#} AdapterDemo.java   1.0     3/21/2025
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
public class AdapterDemo {
    public static void main(String[] args) {
        JSONProcessor jsonProcessor = new JSONService();
        XMLProcessor xmlProcessor = new XMLService();

        // Chuyển JSON sang XML qua Adapter
        JSONProcessor adapter = new XMLtoJSONAdapter(xmlProcessor);
        String jsonData = "{\"name\": \"John\", \"age\": 30}";
        adapter.processJSON(jsonData);
    }
}

