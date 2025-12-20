import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long ans = n * (n + 1) * (n + 2) / 6;
        System.out.println(ans);
        in.close();
    }
}