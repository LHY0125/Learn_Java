import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Vehicle car = new Car("特斯拉Model S", 250);
        Vehicle train = new Train("复兴号高铁", 16);
        Vehicle airplane = new Airplane("波音747", 12500);

        // 调用各交通工具的方法
        System.out.println("=== 交通工具乘坐信息 ===");
        System.out.println();

        car.start();
        car.travelInfo();

        train.start();
        train.travelInfo();

        airplane.start();
        airplane.travelInfo();
        
        in.close();
    }
}