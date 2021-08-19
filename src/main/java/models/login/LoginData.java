package models.login;

public class LoginData {

    private String user;
    private String password;

    public LoginData(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public LoginData(){

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
