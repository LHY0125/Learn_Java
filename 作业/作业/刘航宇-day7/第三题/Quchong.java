import java.util.Scanner;

public class Quchong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入整数个数:");
        int n = in.nextInt();

        System.out.print("请输入一串整数（用空格分隔）:");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        // 去重逻辑修正
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    for (int k = j; k < n - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    n--;
                    j--;
                }
            }
        }

        System.out.println("去重后的整数序列为:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        in.close();
    }
}
