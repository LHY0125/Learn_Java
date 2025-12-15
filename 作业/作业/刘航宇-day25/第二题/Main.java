import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long s1 = 0, s2 = 0, s3 = 0;
        String bestId = "";
        String bestName = "";
        int ba = 0, bb = 0, bc = 0;
        int best = -1;
        for (int i = 0; i < n; i++) {
            String id = in.next();
            String name = in.next();
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            s1 += a;
            s2 += b;
            s3 += c;
            int tot = a + b + c;
            if (tot > best) {
                best = tot;
                bestId = id;
                bestName = name;
                ba = a;
                bb = b;
                bc = c;
            }
        }
        int avg1 = (int) (s1 / n);
        int avg2 = (int) (s2 / n);
        int avg3 = (int) (s3 / n);
        System.out.println(avg1 + " " + avg2 + " " + avg3);
        System.out.println(bestId + " " + bestName + " " + ba + " " + bb + " " + bc);
        in.close();
    }
}