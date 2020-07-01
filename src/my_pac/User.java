package my_pac;

public class User {
    private String username;
    private String password;

    //Shift+Enter     不用到行尾换行
    //Ctr+shift+A   命令行
    //Alt+鼠标        列编辑

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
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

    public static void main(String[] args) {
        User a = new User("ljh","123456");
        System.out.println(a.toString());
    }
}