public class Car extends Vehicle {
    private int maxSpeed;

    public Car(String name, int maxSpeed) {
        super(name);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void travelInfo() {
        System.out.println("交通工具：汽车（" + name + "）");
        System.out.println("乘坐信息：最高时速" + maxSpeed + "km/h，适合短途旅行");
        System.out.println("特点：灵活方便，点对点运输");
        System.out.println("------------------------");
    }
}