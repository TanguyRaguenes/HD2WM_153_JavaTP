package eni.tp.app.eni_app.bo;

public class User {

    public String email;
    public String password;

    public User(){
        super();
    }

    public User (String email, String password) {
        this.email = email;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String name) {
        this.email = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
