import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "A1B2C3D4E5F6G7H8";

        int[] nums = extractInts(s);
        String[] letters = extractLetters(s);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(letters));
    }

    // 提取数字到 int[]
    public static int[] extractInts(String s) {
        List<Integer> list = new ArrayList<>();
        // 遍历字符串，提取数字字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                list.add(c - '0');
            }
        }
        // 将 List<Integer> 转换为 int[]
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
        return arr;
    }

    // 提取字母到 String[]
    public static String[] extractLetters(String s) {
        List<String> list = new ArrayList<>();
        // 遍历字符串，提取字母字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                list.add(String.valueOf(c).toUpperCase());
            }
        }
        return list.toArray(new String[0]);
    }
}