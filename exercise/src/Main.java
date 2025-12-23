import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNext()) {
            System.out.print("no");
            in.close();
            return;
        }
        int n = Integer.parseInt(in.next());
        if (n <= 0) {
            System.out.print("no");
            in.close();
            return;
        }
        
        Map<String, Integer> cnt = new HashMap<>();
        Map<String, Integer> first = new HashMap<>();
        String best = null;
        int bestCount = 0;
        int bestIdx = Integer.MAX_VALUE;
        int idx = 0;
        while (idx < n && in.hasNext()) {
            String raw = in.next();
            String norm = new BigInteger(raw).toString();
            int c = cnt.getOrDefault(norm, 0) + 1;
            cnt.put(norm, c);
            if (!first.containsKey(norm))
                first.put(norm, idx);
            int fi = first.get(norm);
            if (best == null || c > bestCount || (c == bestCount && fi < bestIdx)) {
                best = norm;
                bestCount = c;
                bestIdx = fi;
            }
            idx++;
        }
        if (best == null)
            System.out.print("no");
        else
            System.out.print(best);
        in.close();
    }
}