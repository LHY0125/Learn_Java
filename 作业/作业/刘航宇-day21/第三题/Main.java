import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        long res = 1L;
        for (int i = 2; i <= n; i++) {
            res *= i;
            while (res % 10 == 0) {
                res /= 10; // 去除产生的0
            }
            res %= 10000000L; // 保留足够位数避免溢出
        }

        System.out.println(res % 10);
    }
}