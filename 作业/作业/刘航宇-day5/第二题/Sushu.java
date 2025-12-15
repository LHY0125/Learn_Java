import java.util.Scanner;

public class Sushu {
    public boolean isPrime(int num) {
        if (num <= 1) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sushu sushu = new Sushu();
        System.out.print("请输入N:");
        int n = in.nextInt();
        int m=2;
        while(m<=n)
        {
            if (sushu.isPrime(m))
            {
                System.out.println(m);
            }
            m++;
        }
        in.close();
    }
}
