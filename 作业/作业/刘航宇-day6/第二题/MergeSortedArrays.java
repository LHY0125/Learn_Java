import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 读取数组大小n和m
        System.out.print("请输入第一个已排序数组的大小n和第二个已排序数组的大小m:");
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine(); // 消耗换行符，避免影响后续字符串读取

        // 读取第一个数组（先提示，再读取）
        int[] Ni = new int[n];
        System.out.print("请输入第一个已排序数组的元素(以空格隔开，共" + n + "个):");
        String[] NiStr = in.nextLine().split(" ");
        // 校验输入元素数量是否正确
        if (NiStr.length != n) {
            System.out.println("输入的元素数量与n不匹配！");
            return;
        }
        for (int i = 0; i < n; i++) {
            Ni[i] = Integer.parseInt(NiStr[i]);
        }

        // 读取第二个数组（先提示，再读取）
        int[] Mi = new int[m];
        System.out.print("请输入第二个已排序数组的元素(以空格隔开，共" + m + "个):");
        String[] MiStr = in.nextLine().split(" ");
        // 校验输入元素数量是否正确
        if (MiStr.length != m) {
            System.out.println("输入的元素数量与m不匹配！");
            return;
        }
        for (int i = 0; i < m; i++) {
            Mi[i] = Integer.parseInt(MiStr[i]);
        }

        // 双指针合并数组（核心逻辑不变）
        int[] result = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (Ni[i] <= Mi[j]) {
                result[k++] = Ni[i++];
            } else {
                result[k++] = Mi[j++];
            }
        }
        // 处理剩余元素
        while (i < n) {
            result[k++] = Ni[i++];
        }
        while (j < m) {
            result[k++] = Mi[j++];
        }

        // 输出结果（优化末尾空格）
        System.out.print("合并后的数组为:");
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            sb.append(num).append(" ");
        }
        // 移除最后一个空格（如果有元素）
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        System.out.println(sb);

        in.close();
    }
}
