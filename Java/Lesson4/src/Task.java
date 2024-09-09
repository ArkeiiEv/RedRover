import java.util.Arrays;
import java.util.Scanner;

public class Task {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = Input();
        Task1(array);
        System.out.println();
        Task2(array);
        System.out.println();
        Task3(array);
        System.out.println();
        Task4(array);
    }

    public static void Task1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void Task2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void Task3(int[] array) {
        for (int i : array) {
            System.out.print((i + 15) + " ");
        }
    }

    public static void Task4(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];  // Сохраняем текущий элемент
            array[i] = array[array.length - 1 - i];  // Меняем его на противоположный
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static int[] Input() {
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }
}