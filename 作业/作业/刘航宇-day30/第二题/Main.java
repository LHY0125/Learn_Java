import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger num = BigInteger.ZERO;
        BigInteger den = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            String t = in.next();
            int idx = t.indexOf('/');
            BigInteger p = new BigInteger(t.substring(0, idx));
            BigInteger q = new BigInteger(t.substring(idx + 1));
            num = num.multiply(q).add(p.multiply(den));
            den = den.multiply(q);
            BigInteger g = num.gcd(den);
            num = num.divide(g);
            den = den.divide(g);
        }
        if (den.equals(BigInteger.ONE)) {
            System.out.println(num.toString());
        } else {
            System.out.println(num.toString() + "/" + den.toString());
        }
        in.close();
    }
}