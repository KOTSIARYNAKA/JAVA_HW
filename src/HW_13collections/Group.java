package HW_13collections;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String groupNumber;
    private ArrayList<Student> students;

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public double averageRating() {
        double sum = 0;
        for (int i = 0; i < students.size(); i++) {
            sum = sum + students.get(i).getAverageScore();

        }
        double v = sum / students.size();
        return v;
    }

    public void showStudentsInfo() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());
        }


    }

    public void removeBadStudents() {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).averageScore < 4)
                students.remove(i);
        }
    }


    public Group(String groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }



    //   public void expelLowGradeStudents() {
    //              students.removeIf(student -> student.averageScore < 4.0);

    //        }
    ////  public double calculateAverageScore() {
    //             return students.stream().mapToDouble(student -> student.averageScore).average().orElse(0.0);
    //         }
    //  public double calculateAverageGrade() {
    //             return students.stream().mapToDouble(student -> student.averageScore).average().orElse(0.0);
    //         }

    //  public void transferStudents(Group targetGroup) {
    //              if (students.size() < 2) { targetGroup.students.addAll(students);
    //                  students.clear();
    //              }

    //  }
    //  @Override public String toString() {
    //             return "Group " + groupNumber + ": " + students.;
    //         }


}


