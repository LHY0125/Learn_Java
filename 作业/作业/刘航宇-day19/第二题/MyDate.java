public class MyDate {
    private int year;
    private int month;
    private int day;

    public void set(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void print() {
        System.out.println("输出重置后的时间：");
        System.out.println(year + ":" + month + ":" + day);
    }
}