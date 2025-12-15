public class Train extends Vehicle {
    private int carriageCount;

    public Train(String name, int carriageCount) {
        super(name);
        this.carriageCount = carriageCount;
    }

    @Override
    public void travelInfo() {
        System.out.println("交通工具：火车（" + name + "）");
        System.out.println("乘坐信息：" + carriageCount + "节车厢，适合中长途旅行");
        System.out.println("特点：运量大，准时可靠");
        System.out.println("------------------------");
    }

}