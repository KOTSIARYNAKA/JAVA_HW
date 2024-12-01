package HW_20;


public class AcademyMethods {

        @AcademyInfo(year = 2024)
    public void annMethod(){
        System.out.println("Метод содержит аннотацию");
    }
    public void withoutAnnMethod(){
        System.out.println("Без аннотации");
    }
}
