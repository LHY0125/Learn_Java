import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        double ans = (double) a / b;
        System.out.printf("%.9f\n", ans);
        in.close();
    }
}