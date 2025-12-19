import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String broken = in.nextLine();
        boolean[] bad = new boolean[26];
        for (int i = 0; i < broken.length(); i++)
            bad[broken.charAt(i) - 'a'] = true;
        int count = 0;
        boolean inWord = false;
        boolean wordHasBad = false;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (inWord) {
                    if (!wordHasBad)
                        count++;
                    inWord = false;
                    wordHasBad = false;
                }
            } else {
                inWord = true;
                if (bad[ch - 'a'])
                    wordHasBad = true;
            }
        }
        if (inWord && !wordHasBad)
            count++;
        System.out.println(count);
        in.close();
    }
}