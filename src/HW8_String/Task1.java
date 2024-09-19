//1. Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”(эту строку использовать в последющих заданиях).
//2. Распечатать последний символ строки. Используем метод String.charAt().
//3. Проверить, заканчивается ли ваша строка подстрокой “java!”. Используем метод String.endsWith().
//4. Проверить, начинается ли ваша строка подстрокой “Добро пож”. Используем метод String.startsWith().
//5. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//6. Найти позицию подстроки “Java” в строке “I like Java!!!”.
//7. Заменить все символы “а” на “о”.
//8. Преобразуйте строку к верхнему регистру.
//9. Преобразуйте строку к нижнему регистру.
//10. Вырезать строку Java c помощью метода String.substring().

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
        if (text.indexOf("Java", 0) !=-1) {
            System.out.println("Позиция подстроки \"Java\" в строке: " + text.indexOf("Java", 0));
        }
        else {
            System.out.println( "В строке отсутствует подстрока \"Java\"");
        }
        System.out.println(text.replace('a', 'o'));   //Замена а на о
        System.out.println(text.toUpperCase());                      //К верхнему регистру
        System.out.println(text.toLowerCase());                      //К нижнему регистру
        if (text.indexOf("Java", 0) != -1) {
            System.out.println(text.substring(0, text.indexOf("Java")) + text.substring(text.indexOf("Java") + 4));
        }
        else {
            System.out.println("В тексте отсутствует слово \"Java\"");
        }
    }
}