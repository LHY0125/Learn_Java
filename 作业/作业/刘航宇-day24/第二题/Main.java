import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int N = in.nextInt();
            if (N == 0) break;
            int[] req = new int[N];
            for (int i = 0; i < N; i++) {
                int voters = in.nextInt();
                req[i] = voters / 2 + 1;
            }
            Arrays.sort(req);
            int need = N / 2 + 1;
            int sum = 0;
            for (int i = 0; i < need; i++) sum += req[i];
            System.out.println(sum);
        }
        in.close();
    }
}