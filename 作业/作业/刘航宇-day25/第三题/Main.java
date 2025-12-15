import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.next());
        if (n == 0) {
            System.out.println(0);
            in.close();
            return;
        }
        BigInteger tenPow = BigInteger.TEN.pow(n - 1);
        BigInteger eightPow = BigInteger.valueOf(8).pow(n - 1);
        BigInteger part1 = BigInteger.valueOf(9).multiply(tenPow);
        BigInteger part2 = BigInteger.valueOf(7).multiply(eightPow);
        BigInteger res = part1.add(part2).divide(BigInteger.valueOf(2));
        System.out.println(res.toString());
        in.close();
    }
}