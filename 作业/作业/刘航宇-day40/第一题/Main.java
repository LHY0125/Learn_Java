import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] words = s.split(" ");
        String best = "";
        int max = -1;
        for (String w : words) {
            int end = w.length();
            while (end > 0 && !Character.isLetter(w.charAt(end - 1))) end--;
            String t = w.substring(0, end);
            if (t.length() > max) {
                max = t.length();
                best = t;
            }
        }
        System.out.println(best);
        in.close();
    }
}