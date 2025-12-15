import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 5x5
        int Shuzu[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Shuzu[i][j] = in.nextInt();
            }
        }

        // m n
        int m, n;
        m = in.nextInt();
        n = in.nextInt();

        //
        int temp[]=new int[5];
        for (int j = 0; j < 5; j++) {
            temp[j] = Shuzu[m][j];
            Shuzu[m][j] = Shuzu[n][j];
            Shuzu[n][j] = temp[j];
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(Shuzu[i][j] + " ");
            }
            System.out.println();
        }

        in.close();
    }
}