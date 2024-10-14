package HW_13collections;

import java.util.Arrays;
import java.util.List;

public class University {
    public static void main(String[] args) {
        // Создание студентов
        Student student1 = new Student("Ivan", "Ivanov", "01.01.2000", "Minsk", 4.5);
        Student student2 = new Student("Petr", "Petrov", "02.02.2001", "Gomel", 3.8);
        Student student3 = new Student("Anna", "Sidorova", "03.03.2000", "Brest", 4.2);
        Student student4 = new Student("Vladimir", "Kolosov", "04.03.2005", "Vitebsk", 2.2);


        Group group1 = new Group("5");
        group1.addStudent(student1);
        group1.addStudent(student2);

        //посчитать среднюю оценку
      System.out.println(group1.averageRating());
     //   group1.showStudentsInfo();
     //   group1.removeBadStudents();
     //   group1.showStudentsInfo();
    }
}


