package com.muhrizram.smarthomestay.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.muhrizram.smarthomestay.model.User;

// @Controller
@RestController // @Controller + @ResponseBody
public class UserController {

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/version")
    public String getAppDetails() {
        return appName + " - " + appVersion;
    }

    // @RequestMapping(value = "/users", method = RequestMethod.GET)
    @GetMapping("/users")
    public String getUsers() {
        return "Displaying the list of Users";
    }

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable Long id) {
        return "Fetching the user details for the id " + id;
    }

    @PostMapping("/users")
    public String saveUser(@RequestBody User user) {
        return "Saving the user details to the database " + user;
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        System.out.println("Updating the user data for the id " + id);
        return user;
    }

    @DeleteMapping("/users")
    public String deleteUser(@RequestParam Long id) {
        return "Deleting the user details for the id " + id;
    }
}
