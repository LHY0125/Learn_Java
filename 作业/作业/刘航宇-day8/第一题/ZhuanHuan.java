import java.util.Scanner;

public class ZhuanHuan 
{
    public static String Zhuan(String str) {
        if (str == null)
            return null;

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch >= 'A' && ch <= 'Z') 
            {
                chars[i] = (char) (ch + 32); // 大写转小写
            } 
            else if (ch >= 'a' && ch <= 'z') 
            {
                chars[i] = (char) (ch - 32); // 小写转大写
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String input = in.nextLine();
        String output = Zhuan(input);
        System.out.println("转换后的字符串为：" + output);

        in.close();
    }
}