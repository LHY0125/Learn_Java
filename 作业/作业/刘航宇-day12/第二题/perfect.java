import java.util.Scanner;

public class perfect {
    private static boolean isPerfect(int n) {
        if (n <= 1) {
            return false;
        }

        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                int other = n / i;
                if (other != i && other != n) {
                    sum += other;
                }
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个数字: ");
        int n = in.nextInt();

        for (int i = 2; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
        
        in.close();
    }
}