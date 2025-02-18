package aplication;
import java.util.Scanner;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class DataHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 =  Instant.now();

        LocalDate d04 = LocalDate.parse("2024-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-20T02:30:26");
        Instant d06 = Instant.parse("2024-07-20T02:30:26Z");
        Instant d07 = Instant.parse("2024-07-20T02:30:26-03:00");
        LocalDate d08 = LocalDate.parse("22/07/2024");

        System.out.println("d01: "+ d01.toString());
        System.out.println("d02: "+ d02.toString());
        System.out.println("d03: "+ d03.toString());
        System.out.println("d04: "+ d04.toString());
        System.out.println("d05: "+ d05.toString());
        System.out.println("d06: "+ d06.toString());
        System.out.println("d07: "+ d07.toString());
        System.out.println("d08: "+ d08.toString());

        sc.close();
    }
}
