package single.fixed;

class Main {
  public static void main(String[] args) {
    UserRegister userRegister = new UserRegister();
    UserLogin userLogin = new UserLogin();
    UserDataManager userManager = new UserDataManager();

    if (userRegister.register("john_doe", "Password123")) {
      userManager.setUsername("john_doe");
      userManager.setPassword("Password123");
      System.out.println("Register successful");
    } else {
      System.out.println("Register failed");
    }

    if (userLogin.login(userManager.getUsername(), userManager.getPassword())) {
      System.out.println("Login successful");
    } else {
      System.out.println("Login failed");
    }
  }
}
