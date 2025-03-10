/*
 * @ {#} TestSingleton.java   1.0     3/10/2025
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
public class TestSingleton {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        Thread thread3 = new Thread(new Thread3());
        Thread thread4 = new Thread(new Thread4());
        Thread thread5 = new Thread(new Thread5());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance("11111");
            System.out.println(instance.hashCode()+"-------"+instance.value);
        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance("22222");
            System.out.println(instance.hashCode()+"-------"+instance.value);
        }
    }

    static class Thread3 implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance("33333");
            System.out.println(instance.hashCode()+"-------"+instance.value);
        }
    }

    static class Thread4 implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance("44444");
            System.out.println(instance.hashCode()+"-------"+instance.value);
        }
    }

    static class Thread5 implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance("55555");
            System.out.println(instance.hashCode()+"-------"+instance.value);
        }
    }
}

