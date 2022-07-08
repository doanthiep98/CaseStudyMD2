package model;

public class Account {
    private String accountname;
    private String password;
    private String role;

    public Account() {
    }

    public Account(String accountname, String password, String role) {
        this.accountname = accountname;
        this.password = password;
        this.role = role;
    }

    public String getAccountname() {
        return accountname;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String write1(){
        return accountname + "," + password + "," + role;
    }

    @Override
    public String toString() {
        return "{" +
                "account='" + accountname + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
