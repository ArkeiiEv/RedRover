package Java.Lesson7.src;

import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Summary = " + sumNumbers(a, b));
        System.out.println("Subtraction = " + subtractNumbers(a, b));
        System.out.println("Multiplication = " + multiplyNumbers(a, b));
        System.out.println("Division = " + divideNumbers(a, b));
    }

    public static int sumNumbers(int a, int b) {
        return a + b;
    }

    public static int subtractNumbers(int a, int b) {
        return a - b;
    }

    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static int divideNumbers(int a, int b) {
        return a / b;
    }
}

