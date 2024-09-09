public class Task2_2 {
    public static void main(String[] args) {
        int five = 5;
        int i = 0;
        int result = 1;
        while (result < 10000) {
            System.out.println("5^" + i + " = " + result);
            i++;
            result *= five;  // Умножаем результат на 5, чтобы получить следующую степень
        }
    }
}
