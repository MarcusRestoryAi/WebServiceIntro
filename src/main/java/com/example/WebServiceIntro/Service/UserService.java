package com.example.WebServiceIntro.Service;

import com.example.WebServiceIntro.Entity.User;
import com.example.WebServiceIntro.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        //Verifiering

        User newUser = userRepository.save(user);

        return newUser;
    }

    public List<User> loadUser() {
        List<User> users = userRepository.findAll();
        return users;
    }

    public User loadOneUser(Long id) {
        try {
            Optional<User> user = userRepository.findById(id);

            return user.get();
        } catch (NoSuchElementException e) {
            return new User();
        }

    }
}
