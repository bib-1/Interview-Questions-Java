package Others;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        //Get the current DateTime
        LocalDateTime lDate = LocalDateTime.now();
        //Initialize DateTimeFormatter
        DateTimeFormatter date = DateTimeFormatter.ofPattern("YYYY-MM-DD");
        //Print the DateTimeFormatter
        System.out.println(date.format(lDate)); // 2023-06-179
    }
}
