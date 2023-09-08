package com.muhrizram.smarthomestay.service;

import java.util.List;
import com.muhrizram.smarthomestay.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    private static List<User> list = new ArrayList<>();
    static {
        User u = new User();
        u.setName("Iis");
        u.setAge(46L);
        u.setEmail("iiskarwati7@gmail.com");
        u.setLocation("Jakarta");
        u.setGender('p');
        list.add(u);

        u = new User();
        u.setName("Andy");
        u.setAge(53L);
        u.setEmail("andymarwandy@gmail.com");
        u.setLocation("Yogyakarta");
        u.setGender('l');
        list.add(u);
    }

    @Override
    public List<User> getUser() {
        return list;
    }
}
