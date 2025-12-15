public abstract class Vehicle {
    public String name;

    public Vehicle(String name) {
        this.name = name;
    }

    // 抽象方法，子类必须实现
    public abstract void travelInfo();

    // 具体方法，子类可以继承
    public void start() {
        System.out.println(name + "开始启动...");
    }
}