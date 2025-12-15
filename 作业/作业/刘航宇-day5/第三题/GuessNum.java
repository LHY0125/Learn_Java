import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("请输入整数(1~100)：");
        int num = in.nextInt();
        
        if (num <= 0 || num >= 100) 
        {
            System.out.print("请重新输入整数：");
        }
        while (true)
        {
            System.out.print("请输入你猜测的数字(1~100):");
            int n = in.nextInt();
            if (n<num)
            {
                System.out.println("小");
            }
            if (n>num)
            {
                System.out.println("大");
            }
            if (n==num)
            {
                System.out.println("正确");
                break;
            }
        }

        in.close();
    }
}
