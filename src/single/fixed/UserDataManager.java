package single.fixed;

public class UserDataManager {
  private String username;
  private String password;

  public UserDataManager() {
    this.username = null;
    this.password = null;
  }

  public UserDataManager(String username, String password) {
    this.username = username;
    this.password = password;
    System.out.println("User data saved");
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
