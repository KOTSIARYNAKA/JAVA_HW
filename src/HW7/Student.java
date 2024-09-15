//Определить два конструктора (со всеми параметрами и без параметров).
//Определить  методы getters, setters.
//Определить метод, который будет выдавать информацию по всем полям (назвать его information).
//Student: id, Фамилия, Имя, Дата рождения, Факультет, Курс, Группа

package HW7;

import java.util.Calendar;

public class Student {          //Переменные
    private int id;
    private String surname;
    private String name;
    private String birth_date;
    private String faculty;
    private String course;
    private String group;

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

    public int getId(){
        return id;
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getBirth_date() {
        return birth_date;
    }
    public String getFaculty() {
        return faculty;
    }
    public String getCourse(){
        return course;
    }
    public String getGroup(){
        return group;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBirth_date(String birth_date){
        this.birth_date = birth_date;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void setGroup(String group){
        this.group = group;
    }










    public static void main(String[] args) {
        Student student1 = new Student(1052, "Max", "Bush", "12 september 2000", "Historical", "History of RB", "AA-001");
    }
}
