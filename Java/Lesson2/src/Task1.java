import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println((a % 2 == 0) ? "Yes" : "No");
        System.out.println((b % 2 == 0) ? "Yes" : "No");
    }
}
