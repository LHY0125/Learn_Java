public class Circle {
    private double r;

    // ! 构造方法，用于初始化半径
    public Circle(double r) {
        this.r = r;
    }

    // ! 计算圆的面积
    public double GetArea() {
        return Math.PI * r * r;
    }

    // ! 计算圆的周长
    public double GetPerimeter() {
        return 2 * Math.PI * r;
    }

    // ! 获取圆的半径
    public double GetRadius() {
        return r;
    }

    // ! 设置圆的半径
    public void SetRadius(double r) {
        this.r = r;
    }
}