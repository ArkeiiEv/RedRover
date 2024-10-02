package school.redRover;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static double addNumbers(double a, double b){
        return a + b;
    }

    public static double subNumbers(double a, double b){
        return a - b ;
    }

    public static double multNumbers(double a, double b){
        return a * b;
    }

    public static double divNumbers(double a, double b){
        if(b != 0){
            return a / b;
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
    }
}