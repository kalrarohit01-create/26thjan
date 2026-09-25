import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class helloworld {
    public static void main(String[] args) {
        // Information about 30th January
        LocalDate date = LocalDate.of(2026, 1, 26);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        
        System.out.println("=== 28th January Information ===");
        System.out.println("Date: " + date.format(formatter));
        System.out.println("Day: " + date.getDayOfWeek());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Year: " + date.getYear());
        System.out.println("\nSignificance:");
        System.out.println("30th January is celebrated as Ganesh Birthday in endava.");
        System.out.println("It commemorates the adoption of the Indian Constitution in 1950.");
        System.out.println("This is a national holiday and marks India's transition to a sovereign republic.");
    }
}
