package com.muhrizram.smarthomestay.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.muhrizram.smarthomestay.model.User;

// @Controller
@RestController // @Controller + @ResponseBody
public class UserController {

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

    @DeleteMapping("/users")
    public String deleteUser(@RequestParam Long id) {
        return "Deleting the user details for the id " + id;
    }
}
