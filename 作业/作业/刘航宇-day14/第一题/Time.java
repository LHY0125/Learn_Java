public class Time {
    private int h;
    private int m;
    private int s;

    // 构造方法
    public Time() {
        this.h = 0;
        this.m = 0;
        this.s = 0;
    }

    // 带参构造方法
    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    // 将时间转换为总秒数
    public void Set(int t) {
        this.h = t / 3600;
        this.m = (t % 3600) / 60;
        this.s = t % 60;
    }

    // 显示时间，格式为hh:mm:ss
    public void Display() {
        // 使用String.format确保每位数字占两位，不足补零
        System.out.printf("%02d:%02d:%02d\n", h, m, s);
    }
}
