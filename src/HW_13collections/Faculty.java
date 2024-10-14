package HW_13collections;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String name;
    ArrayList<Group> groups;
    FacultyStatus status;
    enum FacultyStatus { ACTIVE, INACTIVE }

    public Faculty(String name, List<Group> groups, FacultyStatus status) {
        this.name = name;
    //    this.groups = groups;
        this.status = status;
    }

    public void addGroup(Group group) {
        groups.add(group);

    }

    public void changeStatus(FacultyStatus newStatus) {
        this.status = newStatus;
    }
    public void checkAndChangeStatus() {
        long totalStudents = groups.stream().mapToLong(group -> group.students.size()).sum();
    }

  //  if (totalStudents <) {
  //      this.status = FacultyStatus.INACTIVE;
   // }
  @Override
  public String toString() {
        return "Faculty " + name + " (" + status + "): " + groups;
     }

}
