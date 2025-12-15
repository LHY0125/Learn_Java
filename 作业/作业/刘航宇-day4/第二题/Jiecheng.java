import java.util.Scanner;

public class Jiecheng {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入n和a:");
        int n, a;
        n = in.nextInt();
        a = in.nextInt();
        int Sn = 0;
        int Ji = a;
        for (int i = 0; i < n; i++)
        {
            Sn += Ji;
            Ji = (Ji * 10)+a;
        }
        System.out.println(Sn);
        in.close();
    }
    
}
