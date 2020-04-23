package com.example.demo.data.DTO;

import com.example.demo.data.DAO.User;
import lombok.Getter;

@Getter
public class UserDTO {
    private int user_id;
    private String emailAddress;
    private String name;
    private String password;

    public UserDTO (User u) {
        this.user_id = u.getUser_id();
        this.name = u.getName();
        this.emailAddress = u.getEmailAddress();
        this.password = u.getPassword();
    }
}
