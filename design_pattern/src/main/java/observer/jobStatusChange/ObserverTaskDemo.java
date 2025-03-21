/*
 * @ {#} ObserverTaskDemo.java   1.0     3/21/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package observer.jobStatusChange;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/21/2025
 * @version:    1.0
 */
public class ObserverTaskDemo {
    public static void main(String[] args) {
        TaskManger task1 = new TaskManger("Task 1");
        TeamMember member1 = new Developer("Developer 1");
        TeamMember member2 = new Developer("Developer 2");
        task1.attach(member1);
        task1.attach(member2);

        task1.setStatus("Đang thực hiện");
        task1.setStatus("Đã hoàn thành");
    }
}

