package exceptions.task1;

public class User {
    String login;
    String password;
    String email;
    int age;

    public User(String login, String email, String password, int age) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}