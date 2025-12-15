import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int n = line.length();
        StringBuilder cur = new StringBuilder();
        String ans = "";
        int maxLen = -1;
        for (int i = 0; i < n; i++) {
            char c = line.charAt(i);
            if (c == ' ' || c == '.') {
                if (cur.length() > 0) {
                    if (cur.length() > maxLen) {
                        maxLen = cur.length();
                        ans = cur.toString();
                    }
                    cur.setLength(0);
                }
            } else {
                cur.append(c);
            }
        }
        if (cur.length() > 0 && maxLen < cur.length()) ans = cur.toString();
        System.out.println(ans);
        in.close();
    }
}