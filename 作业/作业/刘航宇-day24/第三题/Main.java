import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean found = false;
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    if (2 * a + 2 * b + c == n) {
                        int x = a * 10000 + b * 1000 + c * 100 + b * 10 + a;
                        System.out.println(x);
                        found = true;
                    }
                }
            }
        }
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    if (2 * (a + b + c) == n) {
                        int y = a * 100000 + b * 10000 + c * 1000 + c * 100 + b * 10 + a;
                        System.out.println(y);
                        found = true;
                    }
                }
            }
        }
        if (!found) System.out.println(-1);
        in.close();
    }
}