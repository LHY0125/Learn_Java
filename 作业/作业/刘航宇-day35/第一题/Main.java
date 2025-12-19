import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int[] cnt = new int[10];
        for (int i = 0; i < s.length(); i++)
            cnt[s.charAt(i) - '0']++;
        StringBuilder out = new StringBuilder(s.length());
        for (int d = 1; d <= 9; d++) {
            for (int k = 0; k < cnt[d]; k++)
                out.append((char) ('0' + d));
        }
        for (int k = 0; k < cnt[0]; k++)
            out.append('0');
        System.out.println(out.toString());
        in.close();
    }
}