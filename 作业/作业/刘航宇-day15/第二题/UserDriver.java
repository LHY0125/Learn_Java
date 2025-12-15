public class UserDriver {
    private DbDriver driver;

    // 设置使用的驱动
    public void setDriver(DbDriver driver) {
        this.driver = driver;
    }

    // 使用驱动执行操作
    public void useDriver() {
        if (driver != null) {
            driver.connect();
            driver.executeQuery();
            driver.disconnect();
        } else {
            System.out.println("未设置数据库驱动！");
        }
    }
}