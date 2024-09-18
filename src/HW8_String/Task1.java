package HW8_String;

public class Task1 {
    public static void main(String[] args) {

        teststring("I like Java!!!");

    }

    public static void teststring(String text){
        System.out.println(text);
        System.out.println("Последний символ строки: " + text.charAt(text.length()-1));

    }

}
