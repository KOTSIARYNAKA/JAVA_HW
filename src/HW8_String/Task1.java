package HW8_String;

public class Task1 {
    public static void main(String[] args) {

        test("I like Java!!!");

    }

    public static void test(String text) {
        System.out.println(text);
        System.out.println("Последний символ строки: " + text.charAt(text.length() - 1));
        String s = text.endsWith("java!") ? "Строка заканчивается на \"java!\"" : "Строка не заканчивается на \"java!\"";
        System.out.println(s);
        if (text.startsWith("Добро пож")) {
            System.out.println("Строка начинается на \"Добро пож\"");
        } else {
            System.out.println("Строка не начинается на \"Добро пож\"");
        }
        if (text.contains("Java")){
            System.out.println("Строка содержит подстроку \"Java\"");
        }
        else {
            System.out.println("Строка не содержит подстроку \"Java\"");
        }
      // text.indexOf(String "Java")


    }
}