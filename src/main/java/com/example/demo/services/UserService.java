package com.example.demo.services;

import com.example.demo.data.DAO.User;
import com.example.demo.data.DTO.UserDTO;
import com.example.demo.data.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service("IUserService")
@AllArgsConstructor
public class UserService implements IUserService{
    private UserRepository userRepository;

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserDTO> users = new ArrayList<UserDTO>();
        Iterable<User> all = userRepository.findAll();
        all.forEach(u -> users.add(new UserDTO(u)));

        return users;
    }

    @Override
    public String getEmailAddress(String emailAddress) {
        Optional<User> users = userRepository.findByEmailAddress(emailAddress);
        return users.get().getEmailAddress();
    }

    @Override
    public void insertUser(String emailAddress, String password, String username) {
        User u = User.builder().emailAddress(emailAddress)
                .password(password).name(username).build();
        u = userRepository.save(u);
    }
}
