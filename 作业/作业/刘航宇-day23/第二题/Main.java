import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        final double PI = 3.1415;
        for (int i = 0; i < n; i++) {
            double r = in.nextDouble();
            double area = PI * r * r;
            System.out.printf("%.6f\n", area);
        }
        in.close();
    }
}