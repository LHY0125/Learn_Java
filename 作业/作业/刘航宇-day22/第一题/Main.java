import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int s = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            while (s > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > c) {
                sb.deleteCharAt(sb.length() - 1);
                s--;
            }
            sb.append(c);
        }
        if (s > 0) {
            int newLen = Math.max(0, sb.length() - s);
            sb.setLength(newLen);
        }
        int idx = 0;
        while (idx < sb.length() && sb.charAt(idx) == '0') idx++;
        String res = idx == sb.length() ? "0" : sb.substring(idx);
        System.out.println(res);
        in.close();
    }
}