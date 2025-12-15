import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入圆的半径: ");
        String line = in.nextLine();

        // 兼容终端管道可能插入的不可见字符，保留数字和符号
        line = line.replaceAll("[^0-9.+-]", "");
        double radius = Double.parseDouble(line);
        
        // 创建一个半径可输入的圆对象
        Circle circle = new Circle(radius);

        // 输出圆的面积和周长
        System.out.printf("圆的面积: %.2f\n", circle.GetArea());
        System.out.printf("圆的周长: %.2f\n", circle.GetPerimeter());

        in.close();
    }
}