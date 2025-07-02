package ex.fundamentos;

import java.util.Scanner;

public class AgeDifferenceCalculator {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String[] names = new String[2];
        int[] ages = new int[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe o nome da pessoa " + (i + 1) + ":");
            names[i] = scanner.next();

            System.out.println("Informe a idade de " + names[i] + ":");
            ages[i] = scanner.nextInt();
        }

        int ageDifferenceResult = calculateAgeDifference(ages[0], ages[1]);

        System.out.printf("A diferença de idade entre %s e %s é de %d anos.\n", names[0], names[1], ageDifferenceResult);
    }

    private static int calculateAgeDifference(int age1, int age2) {
        return Math.abs(age1 - age2);
    }
}
