import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth date(format: 01.12.1900):");
        String date = sc.nextLine();

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthDate = LocalDate.parse(date, dateFormat);
        int yearDifference = LocalDate.now().getYear() - birthDate.getYear();
        birthDate = birthDate.plusYears(yearDifference + 1);

        Duration days = Duration.between(LocalDate.now().atStartOfDay(), birthDate.atStartOfDay());

        System.out.println("Narodeniny budes mat o " + days.toDays() + " dni.");

    }
}