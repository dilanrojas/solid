package single.fixed;

class UserRegister {
  public boolean register(String username, String password) {
    if (CredentialsValidator.validateUsername(username) && CredentialsValidator.validatePassword(password)) {
      System.out.println("User registered successfully.");
      return true;
    } else {
      System.out.println("Invalid username or password.");
      return false;
    }
  }
}
