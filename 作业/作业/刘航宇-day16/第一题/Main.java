import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine(); // 读取一行输入
        int count = 0;
        
        // 遍历字符串中的每个字符
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                // 检查字符是否为数字
                count++;
            }
        }
        
        // 输出数字字符个数
        System.out.println(count); 

        in.close();
    }
}