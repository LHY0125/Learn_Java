import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n1 = in.nextLong();
        long n2 = in.nextLong();
        long l = Math.min(n1, n2), r = Math.max(n1, n2);
        int[] perfects = {6, 28, 496, 8128, 33550336};
        int cnt = 0;
        for (int x : perfects) if (x >= l && x <= r) cnt++;
        System.out.println(cnt);
        in.close();
    }
}