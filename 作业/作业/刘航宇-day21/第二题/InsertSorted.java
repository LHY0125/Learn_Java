import java.util.Scanner;

public class InsertSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10]; // 容纳插入后的10个元素
        for (int i = 0; i < 9; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        int x = sc.nextInt(); // 待插入的数字
        sc.close();

        int pos = 9; // 默认插到末尾
        for (int i = 0; i < 9; i++) {
            if (x <= arr[i]) {
                pos = i;
                break;
            }
        }

        for (int i = 9; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = x;

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}