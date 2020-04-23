package com.example.demo.data.DAO;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "user")
@NoArgsConstructor
public class User {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
    private String emailAddress;
    private String password;
    private String name;

    @OneToMany(mappedBy = "user")
    private List<Discussion> discussions;

    @Builder
    private User(Integer user_id, String emailAddress, String name,String password){
        this.user_id = user_id;
        this.emailAddress = emailAddress;
        this.name = name;
        this.password = password;
    }
}
