import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println(n);
            in.close();
            return;
        }
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int v = a[i][j];
                boolean ok = true;
                if (i > 0 && a[i - 1][j] >= v)
                    ok = false;
                if (i < n - 1 && a[i + 1][j] >= v)
                    ok = false;
                if (j > 0 && a[i][j - 1] >= v)
                    ok = false;
                if (j < n - 1 && a[i][j + 1] >= v)
                    ok = false;
                if (ok) {
                    if (out.length() > 0)
                        out.append(' ');
                    out.append(v);
                }
            }
        }
        System.out.println(out.toString());
        in.close();
    }
}