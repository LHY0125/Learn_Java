import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String n = in.next();
        int b = in.nextInt();
        long value = 0L;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            int v;
            if (ch >= '0' && ch <= '9') v = ch - '0';
            else if (ch >= 'a' && ch <= 'f') v = ch - 'a' + 10;
            else if (ch >= 'A' && ch <= 'F') v = ch - 'A' + 10;
            else v = 0;
            value = value * a + v;
        }
        if (value == 0) {
            System.out.println("0");
            in.close();
            return;
        }
        ArrayList<Character> digits = new ArrayList<>();
        while (value > 0) {
            int r = (int)(value % b);
            char d = (char)(r < 10 ? ('0' + r) : ('A' + (r - 10)));
            digits.add(d);
            value /= b;
        }
        StringBuilder out = new StringBuilder();
        for (int i = digits.size() - 1; i >= 0; i--) out.append(digits.get(i));
        System.out.println(out.toString());
        in.close();
    }
}