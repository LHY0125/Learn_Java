import java.util.Scanner;

public class shiyi {
    private static int f(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return 2*f(n-2)+f(n-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个整数n：");
        int n = in.nextInt();
        int result = f(n);
        System.out.println(result);

        in.close();
    }
}
