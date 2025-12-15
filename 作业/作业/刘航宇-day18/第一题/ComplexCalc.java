import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComplexCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine().trim();
        in.close();

        // 支持三种输入：
        // 1) "3 2 + 5 4"  -> (3+2i) op (5+4i)
        // 2) "32 + 54"    -> (3+2i) op (5+4i)
        // 3) "3+2i + 5+4i" -> 常见复数格式（运算符两侧有空格）

        ParseResult pr = parse(line);
        if (pr == null) {
            System.out.println("输入格式不正确");
            return;
        }

        Complex a = pr.left;
        Complex b = pr.right;
        Complex res = pr.op == '+' ? a.add(b) : a.sub(b);
        System.out.println(res.toString());
    }

    static class ParseResult {
        Complex left;
        Complex right;
        char op; // '+' or '-'
        ParseResult(Complex l, Complex r, char o) { left = l; right = r; op = o; }
    }

    private static ParseResult parse(String line) {
        // 尝试格式1：a b op c d
        String[] tokens = line.split("\\s+");
        if (tokens.length == 5 && isSign(tokens[2])) {
            try {
                int r1 = Integer.parseInt(tokens[0]);
                int i1 = Integer.parseInt(tokens[1]);
                int r2 = Integer.parseInt(tokens[3]);
                int i2 = Integer.parseInt(tokens[4]);
                return new ParseResult(new Complex(r1, i1), new Complex(r2, i2), tokens[2].charAt(0));
            } catch (NumberFormatException ignored) {}
        }

        // 尝试格式2：ab op cd（各为两个数字）
        if (tokens.length == 3 && isSign(tokens[1]) && tokens[0].matches("\\d{2}") && tokens[2].matches("\\d{2}")) {
            int r1 = tokens[0].charAt(0) - '0';
            int i1 = tokens[0].charAt(1) - '0';
            int r2 = tokens[2].charAt(0) - '0';
            int i2 = tokens[2].charAt(1) - '0';
            return new ParseResult(new Complex(r1, i1), new Complex(r2, i2), tokens[1].charAt(0));
        }

        // 尝试格式3：a+bi op c+di（运算符两侧必须有空格）
        if (line.contains(" + ") || line.contains(" - ")) {
            char op = line.contains(" + ") ? '+' : '-';
            String[] parts = line.split("\\s+[+\\-]\\s+");
            if (parts.length == 2) {
                Complex left = parseAPlusBi(parts[0]);
                Complex right = parseAPlusBi(parts[1]);
                if (left != null && right != null) {
                    return new ParseResult(left, right, op);
                }
            }
        }
        return null;
    }

    private static boolean isSign(String s) {
        return s.length() == 1 && (s.charAt(0) == '+' || s.charAt(0) == '-');
    }

    private static Complex parseAPlusBi(String s) {
        s = s.trim();
        Matcher m = Pattern.compile("^([+-]?\\d+)\\s*([+\\-])\\s*([+-]?\\d+)i$").matcher(s);
        if (m.matches()) {
            int r = Integer.parseInt(m.group(1));
            int sign = m.group(2).charAt(0) == '-' ? -1 : 1;
            int i = sign * Integer.parseInt(m.group(3));
            return new Complex(r, i);
        }
        return null;
    }
}