import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().trim();
        String[] p = s.split("-");
        int y = Integer.parseInt(p[0]);
        int m = Integer.parseInt(p[1]);
        int d = Integer.parseInt(p[2]);
        int[] md = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        boolean leap = (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
        if (leap)
            md[1] = 29;
        if (d < md[m - 1]) {
            d++;
        } else {
            d = 1;
            if (m < 12)
                m++;
            else {
                m = 1;
                y++;
            }
        }
        System.out.printf("%04d-%02d-%02d\n", y, m, d);
        in.close();
    }
}