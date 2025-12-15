import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n - 1; i++) {
            char c = (char) (s.charAt(i) + s.charAt(i + 1));
            sb.append(c);
        }
        char last = (char) (s.charAt(n - 1) + s.charAt(0));
        sb.append(last);
        System.out.println(sb.toString());
        in.close();
    }
}