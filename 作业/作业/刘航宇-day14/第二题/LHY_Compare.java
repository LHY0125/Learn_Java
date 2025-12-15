import java.util.Scanner;

public class LHY_Compare {
    // 重载的compare方法示例
    public static int compare() {
        return 0;
    }

    // 比较两个整数，返回较大的值
    public static int compare(int a, int b) {
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        } else {
            return 0; // 相等时返回0
        }
    }
    
    // 比较两个字符，返回ASCII码差值的绝对值
    public static int compare(char a, char b) {
        return Math.abs(a - b);
    }

    // 比较两个字符串，返回较大的字符串（按字典序）
    public static String compare(String a, String b) {
        return (a.compareTo(b) > 0) ? a : b;
    }

}