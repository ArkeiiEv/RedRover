import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = Input();
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Sum: " + ArraySum(array));
        MaxOfArray(array);
        MinOfArray(array);
        AverageOfArray(array);
        SumOfMatrix();
        MaxOfMatrix();
        QunOfElements();

    }
    public static int ArraySum(int[] array){
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    public static void MaxOfArray(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public static void MinOfArray(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public static void AverageOfArray(int[] array){
        double res = (double) ArraySum(array) / array.length;
        System.out.println(res);
    }

    public static void SumOfMatrix(){
        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;  // Инициализируем сумму как 0
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                sum += ints[j];  // Добавляем каждый элемент к сумме
            }
        }
        System.out.println(sum);
    }

    public static void MaxOfMatrix(){
        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        System.out.println(max);
    }
    public static void QunOfElements(){
        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                count++;
            }
        }
        System.out.println(count);
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