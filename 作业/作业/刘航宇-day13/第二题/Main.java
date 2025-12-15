import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // 创建Employee对象
        Employee employee = new Employee();

        // 输入员工信息
        System.out.print("请输入员工姓名：");
        employee.setName(in.nextLine());

        System.out.print("请输入员工性别：");
        employee.setGender(in.nextLine());

        System.out.print("请输入出生日期（格式：YYYY-MM-DD）：");
        employee.setBirthDate(in.nextLine());

        System.out.print("请输入工资：");
        employee.setSalary(in.nextDouble());

        // 输出空行分隔
        System.out.println();

        // 输出员工信息
        employee.displayInfo();

        in.close();
    }
}