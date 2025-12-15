import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine().trim(); // 形如 2020-10-10
        in.close();

        String[] parts = line.split("-");
        int y = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int d = Integer.parseInt(parts[2]);

        MyDate date = new MyDate();
        date.set(y, m, d);
        date.print();
    }
}