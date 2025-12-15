import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 存储26个字母的出现次数
        int[] frequency = new int[26];
        int maxFrequency = 0;

        // 读取4行文本并统计频率
        for (int i = 0; i < 4; i++) {
            String line = scanner.nextLine().toUpperCase();
            for (char c : line.toCharArray()) {
                if (c >= 'A' && c <= 'Z') {
                    int index = c - 'A';
                    frequency[index]++;
                    if (frequency[index] > maxFrequency) {
                        maxFrequency = frequency[index];
                    }
                }
            }
        }

        // 绘制垂直直方图
        for (int row = maxFrequency; row > 0; row--) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (frequency[i] >= row) {
                    line.append("* ");
                } else {
                    line.append("  ");
                }
            }
            // 去除行尾空格后输出
            System.out.println(line.toString().replaceAll("\\s+$", ""));
        }

        // 输出字母行
        StringBuilder alphabetLine = new StringBuilder();
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabetLine.append(c).append(" ");
        }
        System.out.println(alphabetLine.toString().trim());

        scanner.close();
    }
}