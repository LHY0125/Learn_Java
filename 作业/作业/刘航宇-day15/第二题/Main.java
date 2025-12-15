import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 使用接口的多态：同一调用输出不同内容
        UserDriver userDriver = new UserDriver();

        // 使用接口类型声明变量
        IBMDriver IBMDriver = new IBMDriver();
        GoogleDriver GoogleDriver = new GoogleDriver();

        // 使用IBM驱动
        System.out.println("=== 测试IBM数据库驱动 ===");
        userDriver.setDriver(IBMDriver);
        userDriver.useDriver();

        // 使用Google驱动
        System.out.println("=== 测试Google数据库驱动 ===");
        userDriver.setDriver(GoogleDriver);
        userDriver.useDriver();

        // 演示多态特性
        System.out.println("=== 多态特性演示 ===");
        DbDriver[] drivers = {
            new IBMDriver(),
            new GoogleDriver()
        };
        for (DbDriver driver : drivers) {
            userDriver.setDriver(driver);
            userDriver.useDriver();
        }

        in.close();
    }
}