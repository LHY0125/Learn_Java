import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.nextLine().trim());
        int q = Integer.parseInt(in.nextLine().trim());
        for (int i = 0; i < q; i++) {
            String line = in.nextLine().trim();
            String[] parts = line.split(" ");
            int p = Integer.parseInt(parts[0]);
            long t = Long.parseLong(parts[1]);
            double ans;
            if (p == 1) {
                ans = t * (60.0 - x);
            } else if (p == 2) {
                ans = 3600.0 * t / (60.0 - x);
            } else {
                ans = (12.0 * 3600.0 * 60.0 * t) / x;
            }
            System.out.printf("%.2f\n", ans);
        }
        in.close();
    }
}