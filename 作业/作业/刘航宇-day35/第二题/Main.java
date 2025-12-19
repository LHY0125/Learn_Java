import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine().trim());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextLine();
        if (n == 0) {
            System.out.println("");
            in.close();
            return;
        }
        String first = arr[0];
        boolean[] used = new boolean[65536];
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            int idx = c;
            if (used[idx])
                continue;
            boolean ok = true;
            for (int k = 1; k < n; k++) {
                if (arr[k].indexOf(c) == -1) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                out.append(c);
                used[idx] = true;
            }
        }
        System.out.println(out.toString());
        in.close();
    }
}