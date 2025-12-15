import java.util.Scanner;

public class Mima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入密码: ");
        String password = scanner.nextLine();

        boolean isSafe = check(password);
        System.out.println(isSafe);

        scanner.close();
    }

    public static boolean check(String password) {
        // 条件1: 检查长度 (8-16个字符)
        if (password.length() < 8 || password.length() > 16) {
            return false;
        }

        // 条件2: 检查首字母是否大写
        if (!Character.isUpperCase(password.charAt(0))) {
            return false;
        }

        // 初始化标志变量
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        String specialChars = "~!@#$%*";

        // 遍历密码检查其他条件
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (specialChars.indexOf(ch) != -1) {
                hasSpecialChar = true;
            }
        }

        // 所有条件必须同时满足
        return hasLowerCase && hasDigit && hasSpecialChar;
    }
}