/*
 * @ {#} TaskManger.java   1.0     3/21/2025
 *
 * Copyright (c) 2025 IUH. All rights reserved.
 */

package observer.jobStatusChange;

import java.util.ArrayList;
import java.util.List;

/*
 * @description:
 * @author: Nguyen Tan Thai Duong
 * @date:   3/21/2025
 * @version:    1.0
 */
// Subject
public class TaskManger {
    private String task;
    private String status;
    private List<TeamMember> teamMembers = new ArrayList<>();

    public TaskManger(String task) {
        this.task = task;
        this.status = "Chưa bắt đầu";
    }

    public void attach(TeamMember teamMember) {
        teamMembers.add(teamMember);
    }

    public void detach(TeamMember teamMember) {
        teamMembers.remove(teamMember);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyTeamMembers();
    }

    private void notifyTeamMembers() {
        for (TeamMember teamMember : teamMembers) {
            teamMember.update(task, status);
        }
    }
}

