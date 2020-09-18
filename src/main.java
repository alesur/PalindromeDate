import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class main {
    public static void main(String[] args) {

        printBonusDatesBetween(1980, 2045);
    }

    static void printBonusDatesBetween(int fromYear, int toYear) {

        LocalDate startYear = LocalDate.of(fromYear, 1, 1);
        LocalDate endYear = LocalDate.of(toYear, 1, 1);
        StringBuilder input = new StringBuilder();
        for (; startYear.isBefore(endYear); startYear = startYear.plusDays(1)) {
            DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyyMMdd");
            String formattedDate = startYear.format(formatDate);
            input.append(formattedDate);
            input = input.reverse();
            if (formattedDate.equals(input.toString())) {
                System.out.println(startYear.toString());
            }
            input.setLength(0);

        }


    }
}
