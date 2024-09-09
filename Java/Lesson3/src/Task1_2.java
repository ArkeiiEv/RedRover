import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        }
        else {
            System.out.println("some variable is odd");
        }
    }
}
