import java.util.Scanner;

public class Main {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int number = in.nextInt();
        if (isPrime(number)) {
            System.out.println(number + "是素数");
        } else {
            System.out.println(number + "不是素数");
        }
        
        in.close();
    }
}