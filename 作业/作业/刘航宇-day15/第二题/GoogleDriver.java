public class GoogleDriver implements DbDriver {
    @Override
    public void connect() {
        System.out.println("Google云数据库驱动：建立云端连接...");
    }

    @Override
    public void executeQuery() {
        System.out.println("Google云数据库驱动：执行分布式查询");
    }

    @Override
    public void disconnect() {
        System.out.println("Google云数据库驱动：关闭云连接");
        System.out.println("------------------------");
    }
}