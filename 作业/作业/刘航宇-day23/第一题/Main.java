import java.util.Scanner;

public class Main {
    static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    static long lcm(int a, int b) {
        if (a == 0 || b == 0) return 0L;
        int g = gcd(a, b);
        long x = (long) a / g;
        long y = (long) b;
        long res = x * y;
        if (res < 0) res = -res;
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int g = gcd(a, b);
        long l = lcm(a, b);
        System.out.println(g + " " + l);
        in.close();
    }
}