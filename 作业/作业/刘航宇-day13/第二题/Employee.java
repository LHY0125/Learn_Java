public class Employee {
    private String name;
    private String gender;
    private String birthDate;
    private double salary;

    // 无参构造方法
    public Employee() {}

    // 带参构造方法
    public Employee(String name, String gender, String birthDate, double salary) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 显示员工信息的方法
    public void displayInfo() {
        System.out.println("员工信息：");
        System.out.println("姓名：" + name);
        System.out.println("性别：" + gender);
        System.out.println("出生日期：" + birthDate);
        System.out.printf("工资：%.2f元\n", salary);
    }
}