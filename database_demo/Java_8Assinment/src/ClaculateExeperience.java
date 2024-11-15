import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class ClaculateExeperience {
    public static void main(String[] args) {

     // System.out.print("Enter your start date (yyyy-MM-dd): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String startDateInput = "2024-06-25";
        LocalDate start = LocalDate.parse(startDateInput, formatter);

        LocalDate end = LocalDate.now();
        Period experience = Period.between(start, end);

        System.out.println("Your experience is: " + experience.getYears() + " years, " +
                experience.getMonths() + " months, and " +
                experience.getDays() + " days.");
    }
}
