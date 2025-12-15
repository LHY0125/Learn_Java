import java.util.Scanner;

public class DivideNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("请输入一个非负三位整数：");
        num = in.nextInt();
        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int units = num % 10;
        System.out.println(hundreds);
        System.out.println(tens);
        System.out.println(units);
        
        in.close();
    }
}
