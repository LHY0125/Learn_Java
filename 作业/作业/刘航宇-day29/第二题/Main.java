import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next().trim();
        int n = s.length();
        BigInteger x = new BigInteger(s);
        String ss = s + s;
        boolean ok = true;
        for (int k = 1; k <= n; k++) {
            String p = x.multiply(BigInteger.valueOf(k)).toString();
            if (p.length() > n) { ok = false; break; }
            if (p.length() < n) {
                StringBuilder pad = new StringBuilder(n);
                for (int i = p.length(); i < n; i++) pad.append('0');
                pad.append(p);
                p = pad.toString();
            }
            if (ss.indexOf(p) == -1) { ok = false; break; }
        }
        System.out.println(ok ? 1 : 0);
        in.close();
    }
}