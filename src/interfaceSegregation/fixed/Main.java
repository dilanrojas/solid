package interfaceSegregation.fixed;

class Main {
  public static void main(String[] args) {
    EmployeeOriginal employee = new EmployeeOriginal();
    employee.work();
    employee.eat();
    employee.sleep();

    RobotOriginal employeeRobot = new RobotOriginal();
    employeeRobot.work();
  }
}
