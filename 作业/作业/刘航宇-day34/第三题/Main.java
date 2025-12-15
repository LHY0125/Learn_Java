import java.util.Scanner;

public class Main {
    static boolean isPrime(int x) {
        if (x < 2)
            return false;
        if (x % 2 == 0)
            return x == 2;
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    static boolean noZero(String s) {
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '0')
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next().trim();
        boolean left = false, right = false;
        if (noZero(s)) {
            boolean ok = true;
            for (int i = 0; i < s.length(); i++) {
                int v = Integer.parseInt(s.substring(i));
                if (!isPrime(v)) {
                    ok = false;
                    break;
                }
            }
            left = ok;
        }
        if (noZero(s)) {
            boolean ok = true;
            for (int i = s.length(); i >= 1; i--) {
                int v = Integer.parseInt(s.substring(0, i));
                if (!isPrime(v)) {
                    ok = false;
                    break;
                }
            }
            right = ok;
        }
        if (left && right)
            System.out.println("both");
        else if (left)
            System.out.println("left");
        else if (right)
            System.out.println("right");
        else
            System.out.println("false");
        in.close();
    }
}