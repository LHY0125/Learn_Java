import java.util.Scanner;

public class ca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = 0;
        r= in.nextDouble();
        double S_fang = r * r;
        double S_yuan = 3.14 * (r * r)/4;
        double S_ca = S_fang - S_yuan;
        System.out.println("面积差是：" + S_ca);
        in.close();
    }
}
