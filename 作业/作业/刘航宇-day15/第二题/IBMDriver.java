public class IBMDriver implements DbDriver {
    @Override
    public void connect() {
        System.out.println("IBM数据库驱动：建立安全连接...");
    }

    @Override
    public void executeQuery() {
        System.out.println("IBM数据库驱动：执行高性能查询操作");
    }

    @Override
    public void disconnect() {
        System.out.println("IBM数据库驱动：安全断开连接");
        System.out.println("------------------------");
    }
}