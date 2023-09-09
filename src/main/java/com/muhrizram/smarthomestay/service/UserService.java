package com.muhrizram.smarthomestay.service;

import java.util.List;
import com.muhrizram.smarthomestay.model.User;

public interface UserService {
    List<User> getUser();

    User saveUser(User user);
}
