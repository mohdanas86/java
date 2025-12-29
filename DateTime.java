// DATE AND TIME: Modern Java Date/Time API (Java 8+)
// WHAT IS THIS: Demonstrates LocalTime, LocalDate, LocalDateTime, and formatting
// WHY USE:
//   1. Thread-safe - no synchronization issues
//   2. Immutable - objects cannot be modified after creation
//   3. Intuitive - clear separation of date, time, and datetime
//   4. Better API - replaces confusing old Date/Calendar classes
//   5. Time zones - built-in timezone support
// WHEN USE: Any application needing date/time operations

// IMPORTS: Modern date/time classes from java.time package
import java.time.LocalTime;        // For time-only operations (HH:mm:ss)
import java.time.LocalDate;        // For date-only operations (yyyy-MM-dd)
import java.time.LocalDateTime;    // For combined date and time
import java.time.format.DateTimeFormatter; // For custom formatting

public class DateTime {

    public static void main(String[] args) {
        System.out.println("=== MODERN JAVA DATE/TIME API DEMONSTRATION ===\n");

        // ===== LOCAL TIME =====
        // CLASS: LocalTime - represents time without date or timezone
        // WHAT: Hours, minutes, seconds, nanoseconds
        // WHEN USE: When you only need time (alarms, schedules, timestamps)
        LocalTime time = LocalTime.now(); // Gets current system time
        System.out.println("Current Time: " + time);

        // Time components
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());

        // ===== LOCAL DATE =====
        // CLASS: LocalDate - represents date without time or timezone
        // WHAT: Year, month, day
        // WHEN USE: Birthdays, anniversaries, deadlines, age calculations
        LocalDate date = LocalDate.now(); // Gets current system date
        System.out.println("\nCurrent Date: " + date);

        // Date components
        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonth() + " (" + date.getMonthValue() + ")");
        System.out.println("Day: " + date.getDayOfMonth());
        System.out.println("Day of Week: " + date.getDayOfWeek());
        System.out.println("Day of Year: " + date.getDayOfYear());

        // ===== LOCAL DATE TIME =====
        // CLASS: LocalDateTime - represents both date and time without timezone
        // WHAT: Complete timestamp (date + time)
        // WHEN USE: Logging, events, scheduling, timestamps
        LocalDateTime dateTime = LocalDateTime.now(); // Gets current date and time
        System.out.println("\nCurrent Date and Time: " + dateTime);

        // ===== CUSTOM FORMATTING =====
        // CLASS: DateTimeFormatter - formats date/time objects to strings
        // WHAT: Converts date/time objects to human-readable strings
        // WHY: Default format might not be user-friendly
        // WHEN USE: Displaying dates/times to users, logging, data export

        System.out.println("\n=== DATE/TIME FORMATTING EXAMPLES ===");

        // COMMON FORMAT PATTERNS:
        // yyyy - 4-digit year, yy - 2-digit year
        // MM - month number, MMM - month name abbreviation, MMMM - full month name
        // dd - day of month
        // HH - hour (24-hour), hh - hour (12-hour)
        // mm - minutes, ss - seconds
        // a - AM/PM marker

        // Example 1: dd-MM-yyyy HH:mm:ss (European style)
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("European Format: " + dateTime.format(formatter1));

        // Example 2: yyyy/MM/dd hh:mm:ss a (US style with AM/PM)
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
        System.out.println("US Format: " + dateTime.format(formatter2));

        // Example 3: EEEE, MMMM dd, yyyy 'at' hh:mm a (Full descriptive)
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy 'at' hh:mm a");
        System.out.println("Descriptive Format: " + dateTime.format(formatter3));

        // ===== PARSING STRINGS TO DATE/TIME =====
        // WHAT: Convert string representations back to date/time objects
        // WHY: Reading dates from files, user input, databases
        // WHEN USE: Processing date/time data from external sources

        System.out.println("\n=== PARSING STRINGS TO DATE/TIME ===");

        String dateString = "2025-12-25"; // ISO format
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println("Parsed Date: " + parsedDate);

        String dateTimeString = "2025-12-25T10:30:00"; // ISO format with T
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString);
        System.out.println("Parsed DateTime: " + parsedDateTime);

        // Custom format parsing
        String customDateString = "25/12/2025";
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate customParsedDate = LocalDate.parse(customDateString, customFormatter);
        System.out.println("Custom Parsed Date: " + customParsedDate);

        // ===== DATE/TIME OPERATIONS =====
        System.out.println("\n=== DATE/TIME OPERATIONS ===");

        // Adding/subtracting time
        LocalDate tomorrow = date.plusDays(1);
        LocalDate lastWeek = date.minusWeeks(1);
        System.out.println("Tomorrow: " + tomorrow);
        System.out.println("Last Week: " + lastWeek);

        LocalTime inTwoHours = time.plusHours(2);
        System.out.println("In 2 hours: " + inTwoHours);

        // Comparisons
        LocalDate birthday = LocalDate.of(1990, 5, 15);
        boolean isBefore = birthday.isBefore(date);
        boolean isAfter = birthday.isAfter(date);
        System.out.println("Birthday " + birthday + " is before today: " + isBefore);
        System.out.println("Birthday " + birthday + " is after today: " + isAfter);

        System.out.println("\n=== WHY USE MODERN API INSTEAD OF OLD Date/Calendar? ===");
        System.out.println("✓ Thread-safe (no synchronization needed)");
        System.out.println("✓ Immutable (cannot be accidentally modified)");
        System.out.println("✓ Clear method names (plusDays() vs add())");
        System.out.println("✓ Better timezone support");
        System.out.println("✓ No deprecated methods or confusing behavior");
        System.out.println("✓ More intuitive and less error-prone");
    }
}
