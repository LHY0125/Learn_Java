import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f = 0;
        for (int i = 2; i <= n; i++) {
            f = (f + 3) % i;
        }
        System.out.println(f + 1);
        in.close();
    }
}