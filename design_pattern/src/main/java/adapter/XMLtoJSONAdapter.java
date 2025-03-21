/*
 * @ {#} XMLtoJSONAdapter.java   1.0     3/21/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package adapter;

import org.json.JSONObject;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/21/2025
 * @version:    1.0
 */
// Adapter: Chuyển đổi XML thành JSON
public class XMLtoJSONAdapter implements JSONProcessor {
    private XMLProcessor xmlProcessor;

    public XMLtoJSONAdapter(XMLProcessor xmlProcessor) {
        this.xmlProcessor = xmlProcessor;
    }

    @Override
    public void processJSON(String jsonData) {
        JSONObject jsonObject = new JSONObject(jsonData);
        String xmlData = "<root>";
        for (String key : jsonObject.keySet()) {
            xmlData += "<" + key + ">" + jsonObject.get(key) + "</" + key + ">";
        }
        xmlData += "</root>";

        xmlProcessor.processXML(xmlData);

    }
}

