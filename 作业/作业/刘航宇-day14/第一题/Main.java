import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个整数（表示秒数）：");
        int t = in.nextInt();
        Time time = new Time();
        time.Set(t);
        System.out.print("转换后的时间是：");
        time.Display();
        
        in.close();
    }
}