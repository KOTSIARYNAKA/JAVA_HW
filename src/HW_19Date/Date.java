//1. Вывести текущую дату в формате (пример):  1 апреля 2023
//2. Вывести текущую дату в формате (пример):  1 апреля 2023, 10:59:20 PM
//3. Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию:
//4. Вывести текущую дату в формате (пример): понедельник 20 марта 2023 время: 06.06.06 PM
package HW_19Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String text = dtf.format( LocalDateTime.now() );
        System.out.println(text);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd MMMM yyyy, hh:mm:ss a");
        String text2 = dtf2.format( LocalDateTime.now() );
        System.out.println(text2);

        //
        String d = "2023-03-19 : 10:12:24 AM";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a");
        LocalDateTime localDateTime = LocalDateTime.parse(d, formatter);
        System.out.println(localDateTime);


        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("eeee dd MMMM yyyy время: hh.mm.ss a");
        String text3 = dtf3.format( LocalDateTime.now() );
        System.out.println(text3);

        LocalDate date = LocalDate.now();
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("eeee dd MMMM yyyy");
        LocalTime now = LocalTime.now();
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("hh.mm.ss a");
        String text4 = dtf4.format( date );
        String text5 = dtf5.format( now );
        System.out.println(text4 + " время: " + text5);
    }
}
