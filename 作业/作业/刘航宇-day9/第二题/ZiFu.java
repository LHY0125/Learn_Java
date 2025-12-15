import java.util.Scanner;

public class ZiFu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 输入三行：原文 S、子串 A、子串 B
        String S = sc.nextLine();
        String A = sc.nextLine();
        String B = sc.nextLine();
        // A 为空则不作替换
        if (A.length() == 0) {
            System.out.println(S);
        } else {
            // 使用字符串的字面替换（非正则），满足题意的“用 B 替换 S 中的 A”
            String result = S.replace(A, B);
            System.out.println(result);
        }
        sc.close();
    }
}