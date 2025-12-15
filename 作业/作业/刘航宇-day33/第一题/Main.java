import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        HashSet<Character> set = new HashSet<>();
        boolean dup = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.add(c)) { dup = true; break; }
        }
        System.out.println(dup ? 1 : 0);
        in.close();
    }
}