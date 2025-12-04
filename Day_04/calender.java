import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year : ");
        int year = sc.nextInt();

        System.out.print("Enter Month (1-12): ");
        int month = sc.nextInt();

        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate firstDay = yearMonth.atDay(1);

        int daysInMonth = yearMonth.lengthOfMonth();
        DayOfWeek firstDayOfWeek = firstDay.getDayOfWeek();

        System.out.println("\nSun Mon Tue Wed Thu Fri Sat");

        int startDay = firstDayOfWeek.getValue();
        startDay = startDay % 7;

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
