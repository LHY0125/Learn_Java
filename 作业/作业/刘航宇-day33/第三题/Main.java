import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = s.length();
        int best = 1;
        for (int i = 0; i < n; i++) {
            int l = i, r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            int len1 = r - l - 1;
            if (len1 > best)
                best = len1;
            l = i;
            r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            int len2 = r - l - 1;
            if (len2 > best)
                best = len2;
        }
        System.out.println(best);
        in.close();
    }
}