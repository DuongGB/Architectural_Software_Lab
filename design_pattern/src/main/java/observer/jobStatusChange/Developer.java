/*
 * @ {#} Developer.java   1.0     3/21/2025
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
// Concrete Observer
public class Developer implements TeamMember {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void update(String task, String status) {
        System.out.println(name + " được thông báo: Task " + task + " đã thay đổi trạng thái thành " + status);
    }
}

