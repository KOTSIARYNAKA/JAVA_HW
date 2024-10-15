package HW_13collections;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String name;
    ArrayList<Group> groups;
    FacultyStatus status;

    enum FacultyStatus {ACTIVE, INACTIVE}

    public Faculty(String name, FacultyStatus status) {
        this.name = name;
        this.status = status;
    }

    public void addGroup(Group group) {
        this.groups = new ArrayList<>();
        groups.add(group);


    }

    public void studentTransfer(Group group1, Group group2) {
        if (group1.getStudents().size() < 2) {
            for (int i = 0; i < group1.getStudents().size(); i++) {
                Student st = group1.getStudents().get(i);
                group2.addStudent(st);
                group1.getStudents().remove(i);
            }
        }

    }

    public void changeStatus(FacultyStatus newStatus) {
        this.status = newStatus;
    }
    public void checkAndChangeStatus() {
         long totalStudents = groups.stream().mapToLong(group -> group.getStudents().size()).sum();
     }

    //  if (totalStudents <) {
    //      this.status = FacultyStatus.INACTIVE;
    // }
    @Override
    public String toString() {
        return "Faculty " + name + " (" + status + "): " + groups;
    }

}
