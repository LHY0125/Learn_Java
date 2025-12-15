import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = 5, cols = 5; // 可灵活调整矩阵大小
        int[][] matrix = new int[rows][cols];

        System.out.println("请输入" + rows + "×" + cols + "二维数组的元素：");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        findSaddlePoints(matrix);
        in.close();
    }

    public static void findSaddlePoints(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean found = false;

        // 预计算每行的最大值
        int[] rowMaxs = new int[rows];
        for (int i = 0; i < rows; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            rowMaxs[i] = max;
        }

        // 预计算每列的最小值
        int[] colMins = new int[cols];
        for (int j = 0; j < cols; j++) {
            int min = matrix[0][j];
            for (int i = 1; i < rows; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            colMins[j] = min;
        }

        // 查找鞍点：行最大值且列最小值
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == rowMaxs[i] && matrix[i][j] == colMins[j]) {
                    System.out.println("鞍点位置: (" + i + ", " + j + "), 值: " + matrix[i][j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("未找到鞍点");
        }
    }
}