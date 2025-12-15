import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 读取整数输入
        System.out.println("请输入两个整数：");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        // 调用重载方法并输出结果
        System.out.println(LHY_Compare.compare(num1, num2));

        // 读取字符输入
        System.out.println("请输入两个字符：");
        char char1 = in.next().charAt(0);
        char char2 = in.next().charAt(0);
        // 调用重载方法并输出结果
        System.out.println(LHY_Compare.compare(char1, char2));

        // 读取字符串输入
        System.out.println("请输入两个字符串：");
        String str1 = in.next();
        String str2 = in.next();
        // 调用重载方法并输出结果
        System.out.println(LHY_Compare.compare(str1, str2));
        
        in.close();
    }
}