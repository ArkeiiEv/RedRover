public class Task3 {
    public static void main(String[] args) {
        printFigure1();
        System.out.println();
        printFigure2();
        System.out.println();
        printFigure3();
    }

    public static void printFigure1() {
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printFigure2() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= 9 - i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void printFigure3() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            for (int k = 10 - i; k >= 0; k--) {
                System.out.print(k + "  ");
            }
            for (int l = 0; l <= 10 - i; l++) {
                System.out.print(l + "  ");
            }
            System.out.println();
        }
    }
}
