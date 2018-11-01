package logInApp;

import java.util.ArrayList;

public class User {
    private String userName;
    private long userId;
    private  String password;
    private ArrayList<Role> role;

    public User() {
        role = new ArrayList<>();
    }

    public User(String userName, long userId, String password, ArrayList<Role> role) {
        this.userName = userName;
        this.userId = userId;
        this.password = password;
        this.role = role;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Role> getRole() {
        return role;
    }

    public void setRole(ArrayList<Role> role) {
        this.role = role;
    }
}
