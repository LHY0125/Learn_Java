import java.util.Scanner;

public class EncryptPassword {
    // 对字母和数字进行 +5 的循环位移，加密其它符号保持不变
    private static char shiftChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) ('A' + (ch - 'A' + 5) % 26);
        } else if (ch >= 'a' && ch <= 'z') {
            return (char) ('a' + (ch - 'a' + 5) % 26);
        } else if (ch >= '0' && ch <= '9') {
            return (char) ('0' + (ch - '0' + 5) % 10);
        }
        return ch; // 其它符号不变
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        // 题目要求长度 <= 16
        if (input.length() > 16) {
            input = input.substring(0, 16);
        }

        // 对输入的每个字符进行加密
        StringBuilder sb = new StringBuilder(input.length());
        for (int i = 0; i < input.length(); i++) {
            sb.append(shiftChar(input.charAt(i)));
        }
        System.out.println(sb.toString());

        in.close();
    }
}