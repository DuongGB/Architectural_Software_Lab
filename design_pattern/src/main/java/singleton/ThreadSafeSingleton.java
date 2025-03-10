/*
 * @ {#} ThreadSaleSingleton.java   1.0     3/10/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package singleton;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/10/2025
 * @version:    1.0
 */
public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;
    public String value;

    private ThreadSafeSingleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static synchronized ThreadSafeSingleton getInstance(String value) {
        if (instance == null) {
            instance = new ThreadSafeSingleton(value);
        }
        return instance;
    }
}

