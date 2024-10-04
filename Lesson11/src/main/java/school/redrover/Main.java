package school.redrover;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {

        System.out.println(abbrevitations("Привет всем кто живет на луне", 10));
        int a = 5;
        int b = 10;
        int key = a < b ? a : b;

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

    public static String abbrevitations(String str, int maxWidth){
        return StringUtils.abbreviate(str, maxWidth);
    }
}