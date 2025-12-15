import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long ans = 0L;
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toUpperCase(s.charAt(i));
            ans = ans * 26 + (c - 'A' + 1);
        }
        System.out.println(ans);
        in.close();
    }
}