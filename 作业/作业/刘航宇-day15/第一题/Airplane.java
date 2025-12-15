public class Airplane extends Vehicle {
    private double flightHeight;

    public Airplane(String name, double flightHeight) {
        super(name);
        this.flightHeight = flightHeight;
    }

    @Override
    public void travelInfo() {
        System.out.println("交通工具：飞机（" + name + "）");
        System.out.println("乘坐信息：飞行高度" + flightHeight + "米，适合长途旅行");
        System.out.println("特点：速度快，效率高");
        System.out.println("------------------------");
    }
}