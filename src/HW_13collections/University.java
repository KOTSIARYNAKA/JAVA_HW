package HW_13collections;

import java.util.*;
import java.util.stream.Collectors;



public class University {
    public static void main(String[] args) {
        // Создание студентов
        Student student1 = new Student("Ivan", "Ivanov", "01.01.2000", "Minsk", 4.5);
        Student student2 = new Student("Petr", "Petrov", "02.02.2001", "Gomel", 3.8);
        Student student3 = new Student("Anna", "Sidorova", "03.03.2000", "Brest", 4.2);
        Student student4 = new Student("Vladimir", "Kolosov", "04.03.2005", "Vitebsk", 2.2);
        Student student5 = new Student("Vladislav", "Stakanov", "04.03.2005", "Vitebsk", 5.0);
        Student student6 = new Student("Aliaksander", "Voronov", "04.03.2005", "Minsk", 4.6);
        Student student7 = new Student("Olga", "Varnava", "04.03.2005", "Minsk", 3.9);
        Student student8 = new Student("Oksana", "Ghorka", "04.03.2005", "Grodno", 4.1);
        Student student9 = new Student("Elena", "Homova", "04.03.2005", "Mogilev", 4.4);
        Student student10 = new Student("Vera", "Kupalova", "04.03.2005", "Vitebsk", 4.6);
        Student student11 = new Student("Ksenia", "Mikhalova", "04.03.2005", "Vitebsk", 3.9);
        Student student12 = new Student("Olga", "Cukerka", "04.03.2005", "Vitebsk", 4.3);
        Student student13 = new Student("Olga", "Buhala", "04.03.2005", "Vitebsk", 2.3);
        Student student14 = new Student("Zoua", "Cukerka", "04.03.2005", "Vitebsk", 3.4);
        Student student15 = new Student("Diana", "Pupka", "04.03.2005", "Minsk", 4.1);
        Student student16 = new Student("Liza", "Gorohova", "04.03.2005", "Minsk", 4.4);
        Student student17 = new Student("Ursula", "Ugh", "04.03.2005", "Vitebsk", 4.8);
        Student student18 = new Student("Avgusta", "Letovna", "04.03.2005", "Brest", 4.5);
        Student student19 = new Student("Helen", "Chu", "04.03.2005", "Grodno", 4.3);
        Student student20 = new Student("Petr", "Kozlov", "04.03.2005", "Minsk", 4.3);
        Student student21 = new Student("Andrei", "Novik", "04.03.2005", "Minsk", 4.3);
        Student student22 = new Student("Gvansa", "Zukarmishvili", "04.03.2005", "Minsk", 4.7);
        Student student23 = new Student("Ivan", "Ivanov", "04.03.2005", "Vitebsk", 4.5);
        Student student24 = new Student("Grigory", "Gorgidze", "04.03.2005", "Minsk", 4.5);


        Group group1 = new Group("5");
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);
        group1.addStudent(student6);
        group1.addStudent(student7);
        group1.addStudent(student8);
        group1.addStudent(student9);
        group1.addStudent(student10);
        group1.addStudent(student11);
        group1.addStudent(student12);
        group1.addStudent(student13);
        group1.addStudent(student14);
        group1.addStudent(student15);
        group1.addStudent(student16);
        group1.addStudent(student17);
        group1.addStudent(student18);
        group1.addStudent(student19);
        group1.addStudent(student20);
        Group group2 = new Group("6");
        group2.addStudent(student21);
        group2.addStudent(student22);
        group2.addStudent(student23);
        Group group3 = new Group("7");
        group2.addStudent(student24);

        //посчитать среднюю оценку
        System.out.println(group1.averageRating());
        //   group1.showStudentsInfo();
        //   group1.removeBadStudents();
        //   group1.showStudentsInfo();
        Faculty faculty1 = new Faculty("Computer science", Faculty.FacultyStatus.ACTIVE);
        Faculty faculty2 = new Faculty("Computer science", Faculty.FacultyStatus.ACTIVE);
        Faculty faculty3 = new Faculty("Computer science", Faculty.FacultyStatus.ACTIVE);
        faculty1.addGroup(group1);
        faculty1.addGroup(group2);
        faculty1.addGroup(group3);
        faculty1.studentTransfer(group3, group2);
        //group2.showStudentsInfo();
        // group3.showStudentsInfo();
        faculty3.changeStatus(Faculty.FacultyStatus.INACTIVE);
     //   faculty2.checkAndChangeStatus();
        Comparator<Student> compareByRate = Comparator
                .comparing(Student::getAverageScore);

        ArrayList<Student> sorted =
                (ArrayList<Student>) group1.getStudents().stream().sorted(compareByRate).collect(Collectors.toList());

        group1.showStudentsInfo();
        System.out.println("ДАЛЬШЕ ОТСОРТИРОВАННЫЕ");
        sorted.forEach(item->System.out.println(item));

        Comparator<Student> reverseRate = Comparator
                .comparing(Student::getAverageScore).reversed();
        System.out.println("ДАЛЬШЕ ОТСОРТИРОВАННЫЕ В ОБРАТНОМ ПОРЯДКЕ");
        ArrayList<Student> reverseSort =
                (ArrayList<Student>) group1.getStudents().stream().sorted(reverseRate).collect(Collectors.toList());
        reverseSort.forEach(item->System.out.println(item));
    }

}


