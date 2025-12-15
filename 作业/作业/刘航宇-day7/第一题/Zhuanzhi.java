import java.util.Scanner;

public class Zhuanzhi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入转置矩阵的边长：");
        int n = in.nextInt();
        int[][] jvzhen = new int[n][n];
        System.out.println("请输入矩阵元素：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                jvzhen[i][j] = in.nextInt();
            }
        }

        int[][] newjvzhen = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newjvzhen[j][i] = jvzhen[i][j];
            }
        }

        System.out.println("转置后的矩阵为：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(newjvzhen[i][j] + " ");
            }
            System.out.println();
        }
        
        in.close();
    }
}
