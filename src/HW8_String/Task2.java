package HW8_String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String text = "Да1та выпуска 8 декабря 1998 года[12]. Кодовое имя Playground. В данном случае встречается путаница. Выпускались книги, например, Beginning Java 2 by Ivor Horton (Mar 1999), фактически по J2SE 1.2 (бывшее название — Java 2). Вместе с тем по сей день такие книги публикуются, например: Х. М. Дейтел, П. Дж. Дейтел, С. И. Сантри. Технологии программирования на Java 2. Распределённые приложения (2011). В то время, когда, как известно, Java 2 была исторически заменена следующими релизами, подобные названия книг дезориентируют в понимании, о какой же версии Java они написаны на самом деле. Если J2SE 1.2 принято считать за Java 2, а авторы книг за Java 2 принимают JDK 7, это приводит к полной путанице. ";
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я\\s]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.print(text.substring(matcher.start(), matcher.end()));
        }
    }
}
