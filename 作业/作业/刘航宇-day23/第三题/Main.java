import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        String s = in.next();
        BigInteger[][] dp = new BigInteger[N + 1][K + 2];
        for (int i = 1; i <= N; i++) {
            dp[i][1] = new BigInteger(s.substring(0, i));
        }
        for (int p = 2; p <= K + 1; p++) {
            for (int i = p; i <= N; i++) {
                BigInteger best = null;
                for (int j = p - 1; j <= i - 1; j++) {
                    if (dp[j][p - 1] == null)
                        continue;
                    BigInteger seg = new BigInteger(s.substring(j, i));
                    BigInteger cand = dp[j][p - 1].multiply(seg);
                    if (best == null || cand.compareTo(best) > 0)
                        best = cand;
                }
                dp[i][p] = best;
            }
        }
        BigInteger ans = dp[N][K + 1];
        System.out.println(ans == null ? "0" : ans.toString());
        in.close();
    }
}