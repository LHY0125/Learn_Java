import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        int idx = s1.indexOf(s2);
        String ans;
        if (idx == -1) {
            ans = s1;
        } else {
            ans = s1.substring(0, idx) + s1.substring(idx + s2.length());
        }
        if (ans.length() == 0) System.out.println("null");
        else System.out.println(ans);
        in.close();
    }
}