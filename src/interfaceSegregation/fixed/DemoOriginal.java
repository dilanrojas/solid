package interfaceSegregation.fixed;

public class DemoOriginal {
  public static void main(String[] args) {
    EmployeeOriginal employee = new EmployeeOriginal();
    employee.work();
    employee.eat();
    employee.sleep();
  }
}
