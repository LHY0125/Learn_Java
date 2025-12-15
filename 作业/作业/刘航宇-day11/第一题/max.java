import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入三个整数，以空格分隔: ");
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        int result;
        if (a != max && a != min) {
            result = a;
        } else if (b != max && b != min) {
            result = b;
        } else {
            result = c;
        }

        System.out.println("第二小值是: " + result);
        in.close();
    }
}
