import java.util.Scanner;

public class NumberC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个正整数的长度为n的数字环:");
        int n = in.nextInt();
        int[] Ni = new int[n];
        int count=0;
        while (count < n)
        {
            System.out.print("请输入数字环中的" + n + "个数字(每个数字以空格隔开):");
            Ni[count] = in.nextInt();
            count++;
        }

        System.out.print("请输入一个正整数m(1<=m<=n),表示每个元素需要往后移动m位:");
        int m = in.nextInt();
        int[] newNi = new int[n];
        for (int i = 0; i < n; i++) {
            newNi[(i + m) % n] = Ni[i];
        }

        System.out.print("数字环移动后的结果为:");
        for (int i = 0; i < n; i++) {
            System.out.print(newNi[i] + " ");
        }

        in.close();
    }
    
}
