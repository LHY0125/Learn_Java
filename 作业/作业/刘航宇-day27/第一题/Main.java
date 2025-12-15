import java.util.Scanner;

public class Main {
    static boolean isPrime(int x) {
        if (x < 2) return false;
        if (x % 2 == 0) return x == 2;
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }

    static boolean isPalin(int x) {
        String s = Integer.toString(x);
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 0;
        for (int i = 11; i <= n; i++) {
            if (isPrime(i) && isPalin(i)) cnt++;
        }
        System.out.println(cnt);
        in.close();
    }
}