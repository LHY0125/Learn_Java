import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        boolean ok = true;
        if (s.length() == 0) ok = false;
        else if (s.charAt(0) >= '0' && s.charAt(0) <= '9') ok = false;
        else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                boolean allowed = (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '_';
                if (!allowed) { ok = false; break; }
            }
        }
        System.out.println(ok ? "yes" : "no");
        in.close();
    }
}