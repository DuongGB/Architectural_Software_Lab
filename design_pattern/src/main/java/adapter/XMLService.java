/*
 * @ {#} XMLService.java   1.0     3/21/2025
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
// Concrete XMLProcessor
public class XMLService implements XMLProcessor{
    @Override
    public void processXML(String xmlData) {
        System.out.println("Processing XML data: " + xmlData);
    }
}
