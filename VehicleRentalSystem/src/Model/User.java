package Model;

public class User {
    int user_id;
    String userName;
    String address;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(int user_id, String userName, String address) {
        this.user_id = user_id;
        this.userName = userName;
        this.address = address;
    }
}
