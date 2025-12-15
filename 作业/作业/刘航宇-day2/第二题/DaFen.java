import java.util.Scanner;

public class DaFen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int score = 0;
        if (n<0 || n>40)
        {
            System.out.println("做对题目数量有误");
        }
        else {
            if (n <= 10) {
                score = n * 6;
                System.out.println("score=" + score);
            }
            if (n > 10 && n <= 20) {
                score = 60 + (n - 10) * 2;
                System.out.println("score=" + score);
            }
            if (n > 20) {
                score = 80 + (n - 20);
                System.out.println("score=" + score);
            }
        }
        in.close();
    }
    
}
