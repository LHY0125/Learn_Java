public interface DbDriver {
    void connect(); // 连接数据库方法
    void executeQuery(); // 执行查询方法
    void disconnect(); // 断开连接方法
}