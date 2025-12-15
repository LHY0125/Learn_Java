import java.util.Scanner;

public class Xuanzhuan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入旋转矩阵的边长：");
        int n = in.nextInt();
        int[][] xuanzhuan = new int[n][n];
        System.out.println("请输入矩阵元素：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                xuanzhuan[i][j] = in.nextInt();
            }
        }

        int[][] newxuanzhuan = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newxuanzhuan[j][n - 1 - i] = xuanzhuan[i][j];
            }
        }

        System.out.println("旋转后的矩阵为：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(newxuanzhuan[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
