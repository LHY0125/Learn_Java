import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine().trim());
        StringBuilder out = new StringBuilder();
        StringBuilder line = new StringBuilder();
        int count = 0;
        while (count < n && in.hasNext()) {
            String w = in.next();
            count++;
            if (line.length() == 0) {
                line.append(w);
            } else if (line.length() + 1 + w.length() <= 80) {
                line.append(' ').append(w);
            } else {
                out.append(line).append('\n');
                line.setLength(0);
                line.append(w);
            }
        }
        if (line.length() > 0) out.append(line);
        System.out.print(out.toString());
        in.close();
    }
}