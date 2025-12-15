import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] nums = in.nextLine().trim().split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        String left = s.substring(0, a - 1);
        String mid = s.substring(a - 1, b);
        String right = s.substring(b);
        StringBuilder sb = new StringBuilder(mid);
        sb.reverse();
        String res = left + sb.toString() + right;
        System.out.println(res);
        in.close();
    }
}