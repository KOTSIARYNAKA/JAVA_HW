package HW7;

public class DemoStudent {
    public static void main(String[] args) {
        Student student1 = new Student(4, "Иванов", "Иван", "01.01.2000", "Переводческий", "Иностранные языки. Перевод", "113W");
     //   student1.information();
     //   student1.setSurname("Петров");
     //   student1.setName("Алексей");

        System.out.println("ID " +student1.getId() + ", ФИО "+student1.getSurname()+" " + student1.getName()+", Дата рождения: " + student1.getBirth_date()+", Факультет: " + student1.getFaculty()+", Курс: "+student1.getCourse()+", Группа: "+student1.getGroup());


    }
}
