import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long cnt = 0;
        for (long x = 13; x <= n; x += 13) {
            if (String.valueOf(x).contains("13")) cnt++;
        }
        System.out.println(cnt);
        in.close();
    }
}