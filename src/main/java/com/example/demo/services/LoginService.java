package com.example.demo.services;

import com.example.demo.data.DAO.User;
import com.example.demo.data.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("ILoginService")
public class LoginService {
    private UserRepository userRepository;

    @Autowired
    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User u = userRepository.findByEmailAddress(s).orElseThrow(() -> new UsernameNotFoundException(s));
        return new CustomUserDetails(u);
    }

}
