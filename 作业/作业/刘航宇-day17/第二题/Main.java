import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    // 使用 Map 统计字符串数组中各元素出现次数
    public static Map<String, Integer> count(String[] arr) {
        Map<String, Integer> freq = new LinkedHashMap<>(); // 保持键的插入顺序
        for (String s : arr) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        String[] input = { "a", "b", "a", "b", "c", "a", "b", "c", "b" };
        Map<String, Integer> result = count(input);
        System.out.println("输入: " + Arrays.toString(input));
        System.out.println("统计结果: " + result); // 期望 {a=3, b=4, c=2}
    }
}