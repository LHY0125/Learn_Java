import java.util.Scanner;

public class Num {
    private static int min_m(int n, int m) {
        int result = n - (m * (m - 1) / 2);
        // 分子≤0 或 无法被m整除 → 不满足条件
        if (result <= 0 || result % m != 0) {
            return -1;
        }
        // 返回连续序列的首项a（正整数）
        return result / m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入n:");
        int n = in.nextInt();

        // 防止输入错误
        if (n < 1 || n > 10000) {
            System.out.println("无符合条件的连续正整数序列");
            System.out.println("n应该在1-10000之间");
            in.close();
            return;
        }

        boolean found = false;
        int m = 2;
        int firstnum = -1;

        // 从m=2开始寻找，找到第一个满足条件的m就停止
        for (m = 2; m <= 150; m++) {
            int sum_m = m * (m - 1) / 2;
            // 如果n小于等于前m-1个数的和，说明m太大
            if (n <= sum_m) {
                break;
            }

            firstnum = min_m(n, m);
            if (firstnum != -1) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.print(n + "=");
            for (int i = 0; i < m; i++) {
                System.out.print(firstnum + i);
                if (i < m - 1) {
                    System.out.print("+");
                }
            }
        } 
        else {
            System.out.println("无符合条件的连续正整数序列");
        }
        
        in.close();
    }
}
