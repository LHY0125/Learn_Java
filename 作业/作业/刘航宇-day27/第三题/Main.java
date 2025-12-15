import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[10];
        for (int i = 0; i < 10; i++) h[i] = in.nextInt();
        int reach = in.nextInt();
        int limit = reach + 30;
        int count = 0;
        for (int i = 0; i < 10; i++) if (h[i] <= limit) count++;
        System.out.println(count);
        in.close();
    }
}