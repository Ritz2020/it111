import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;

public class MyTimesDates {

    public static void main(String[] args){
//        keep it simple let's display the current dates
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        Month currentMonth = LocalDate.now().getMonth();
        System.out.println(currentMonth);

        DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
        System.out.println(currentDay);

//        the year would have to be an integer

        int currentYear = LocalDate.now().getYear();
        System.out.println(currentYear);

//        we would like to kown the number od day if today is the 8th of the month 8

        int currentDayNumber = LocalDate.now().getDayOfMonth();
        System.out.println(currentDayNumber);

        System.out.println("Today is " +currentDay+ ", " +currentMonth+ " " +currentDayNumber+ "th, " +currentYear+ ".");
    }
}
