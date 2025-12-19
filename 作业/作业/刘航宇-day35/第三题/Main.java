import java.util.Scanner;

public class Main {
    static long phi(long n) {
        long res = n;
        long x = n;
        for (long p = 2; p * p <= x; p++) {
            if (x % p == 0) {
                while (x % p == 0)
                    x /= p;
                res = res / p * (p - 1);
            }
        }
        if (x > 1)
            res = res / x * (x - 1);
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long ans = 0;
        if (n > 1) {
            long ph = phi(n);
            ans = (n - 1) - ph;
        }
        System.out.println(ans);
        in.close();
    }
}