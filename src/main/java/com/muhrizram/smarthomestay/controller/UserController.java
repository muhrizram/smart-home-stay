package com.muhrizram.smarthomestay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.muhrizram.smarthomestay.model.User;
import com.muhrizram.smarthomestay.service.UserService;

// @Controller
@RestController // @Controller + @ResponseBody
public class UserController {

    @Autowired
    private UserService uService;

    // @RequestMapping(value = "/users", method = RequestMethod.GET)
    @GetMapping("/users")
    public List<User> getUsers() {
        return uService.getUser();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        return uService.getUserDetail(id);
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        return uService.saveUser(user);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return uService.updateUser(user);
    }

    @DeleteMapping("/users")
    public void deleteUser(@RequestParam Long id) {
        uService.deleteUser(id);
    }
}
