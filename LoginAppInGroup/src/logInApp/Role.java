package logInApp;

import java.util.ArrayList;

public class Role {
    private String name;
    private long id;
    private ArrayList<User> user;

    public Role() {
        user = new ArrayList<>();
    }

    public Role(String name, long id, ArrayList<User> user) {
        this.name = name;
        this.id = id;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }
}
