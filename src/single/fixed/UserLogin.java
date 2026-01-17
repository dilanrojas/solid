package single.fixed;

class UserLogin {
  public boolean login(String username, String password) {
    if (CredentialsValidator.validateUsername(username) && CredentialsValidator.validatePassword(password)) {
      System.out.println("User logged in successfully.");
      return true;
    } else {
      System.out.println("Invalid username or password.");
      return false;
    }
  }
}
