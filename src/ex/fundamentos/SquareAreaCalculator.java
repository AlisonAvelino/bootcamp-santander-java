package ex.fundamentos;

import java.util.Scanner;

public class SquareAreaCalculator {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado do quadrado:");
        double sideLength = scanner.nextDouble();

        double area = calculateArea(sideLength);
        System.out.printf("A área do quadrado é %.2f\n", area, area);
    }

    private static double calculateArea(double sideLength) {
        double area = Math.pow(sideLength, 2);
        return area;
    }
}

