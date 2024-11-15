import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateAndTime {
    public static void main(String[] args) {


        LocalDate l = LocalDate.now();
        int m = l.getMonthValue();
        System.out.println(m+1);
        m=m+1;
        LocalDate nextMonthDate = LocalDate.now().withMonth(m).withDayOfMonth(1);


        LocalDate firstSunday = nextMonthDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        LocalDate secondSunday = firstSunday.plusWeeks(1);
        System.out.println(secondSunday);


    }
}
