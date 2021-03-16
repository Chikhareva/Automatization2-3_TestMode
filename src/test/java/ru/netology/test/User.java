package ru.netology.test;

import lombok.Data;

@Data
public class User  {

    private String login = "Radmila Kanitonova";
    private String password = "Romashka123";
    private String status;


    public User() {

    }

    public User(String login, String password, String status) {
        this.login = login;
        this.password = password;
        this.status = status;
    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

}
