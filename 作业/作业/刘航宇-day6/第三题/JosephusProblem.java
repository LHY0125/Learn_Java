import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.close();

        // 初始化参与者列表，编号1~n
        ArrayList<Integer> participants = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            participants.add(i);
        }

        int index = 0; // 记录当前报数的起始位置
        while (participants.size() > 1) {
            // 计算要淘汰的位置
            index = (index + m - 1) % participants.size();
            // 淘汰该位置的参与者
            participants.remove(index);
        }

        // 输出最后胜利者
        System.out.println(participants.get(0));
    }
}
