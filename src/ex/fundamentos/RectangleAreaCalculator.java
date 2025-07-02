package ex.fundamentos;

import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho da base do retângulo:");
        double base = scanner.nextDouble();

        System.out.println("Informe o tamanho da altura do retângulo:");
        double height = scanner.nextDouble();

        double area = calculateRectangleArea(base, height);
        System.out.printf("A área do retângulo é %.2f\n", area);

        scanner.close();
    }

    private static double calculateRectangleArea(double base, double height) {
        double area = base * height;
        return area;
    }
}

