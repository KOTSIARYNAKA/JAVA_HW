//Определить два конструктора (со всеми параметрами и без параметров).
//Определить  методы getters, setters.
//Определить метод, который будет выдавать информацию по всем полям (назвать его information).
//Student: id, Фамилия, Имя, Дата рождения, Факультет, Курс, Группа

package HW7;

import java.util.Calendar;

public class Student {          //Переменные
    int id;
    String surname;
    String name;
    String birth_date;
    String faculty;
    String course;
    String group;

                                 //Конструктор с параметрами


    public Student(int id, String surname, String name, String birth_date, String faculty, String course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.birth_date = birth_date;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student() {       //конструктор без параметров
    }

    public static void main(String[] args) {
        Student student1 = new Student(1052, "Max", "Bush", "12 september 2000", "Historical", "History of RB", "AA-001");
    }
}
