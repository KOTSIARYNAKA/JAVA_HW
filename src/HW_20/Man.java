package HW_20;

import java.lang.reflect.Field;

public class Man {
    private String name;
    private int age;
    private String surname;

    private void print(){
        System.out.println(age + name);
    }

    public Man() {

    }

    public Man(String name, int age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                '}';
    }

    public void classInf (){
        Field[] fields = this.getClass().getDeclaredFields();
        System.out.println("Class name: " + this.getClass());
        for (Field field:fields){
            System.out.println("Field name: " + field.getName() +" type: " + field.getType());
        }
    }
}
