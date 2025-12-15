import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 处理多组测试数据
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] numbers = new int[n];

            // 读取n个整数
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            // 对数组进行排序
            Arrays.sort(numbers);

            // 输出排序结果
            for (int i = 0; i < n; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println(); // 换行
        }

        scanner.close();
    }
}