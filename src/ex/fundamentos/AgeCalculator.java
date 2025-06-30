package ex.fundamentos;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        var scanner= new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String name = scanner.next();

        System.out.println("Informe o ano de nascimento:");
        int year = scanner.nextInt();

        int currentAge = calculateAge(year);
        System.out.printf("Olá %s você tem %s anos! \n", name, currentAge);

    }

    static int calculateAge(int year){
        var baseYear = OffsetDateTime.now().getYear();
        int currentAge = baseYear - year;

        return currentAge;
    }


}
