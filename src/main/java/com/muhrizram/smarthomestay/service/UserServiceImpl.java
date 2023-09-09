package com.muhrizram.smarthomestay.service;

import java.util.List;
import java.util.Optional;

import com.muhrizram.smarthomestay.model.User;
import com.muhrizram.smarthomestay.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository uRepository;

    @Override
    public List<User> getUser() {
        return uRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return uRepository.save(user);
    }

    @Override
    public User getUserDetail(Long id) {
        Optional<User> user = uRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }
        throw new RuntimeException("User is not found for the id " + id);
    }

    public void deleteUser(Long id) {
        uRepository.deleteById(id);
    }
}
