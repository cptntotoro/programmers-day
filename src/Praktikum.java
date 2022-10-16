import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("12.09." + year);
        } else {
            System.out.println("13.09." + year);
        }

//            Решение через SimpleDateFormat
//            GregorianCalendar grCal = new GregorianCalendar(year, Calendar.SEPTEMBER,1);
//            if (isLeapYear(year)) {
//                grCal.set(Calendar.DAY_OF_MONTH, 12);
//            } else {
//                grCal.set(Calendar.DAY_OF_MONTH, 13);
//            }
//            DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
//            System.out.println(df.format(grCal.getTime()));
    }

    public static boolean isLeapYear(int year) {
//          здесь нужно определить, является ли переданный год високосным

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;

//              Решение через java.util.Calendar
//              GregorianCalendar calendar = new GregorianCalendar(year, Calendar.JANUARY,1);
//              return calendar.isLeapYear(calendar.get(GregorianCalendar.YEAR));

    }
}

