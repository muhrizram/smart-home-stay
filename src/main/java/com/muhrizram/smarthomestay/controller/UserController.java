package com.muhrizram.smarthomestay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import jakarta.validation.Valid;

// @Controller
@RestController // @Controller + @ResponseBody
public class UserController {

    @Autowired
    private UserService uService;

    // @RequestMapping(value = "/users", method = RequestMethod.GET)
    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<List<User>>(uService.getUser(), HttpStatus.OK);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        return new ResponseEntity<User>(uService.getUserDetail(id), HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<User> saveUser(@Valid @RequestBody User user) {
        return new ResponseEntity<User>(uService.saveUser(user), HttpStatus.CREATED) ;
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return new ResponseEntity<User>(uService.updateUser(user), HttpStatus.OK);
    }

    @DeleteMapping("/users")
    public ResponseEntity<HttpStatus> deleteUser(@RequestParam Long id) {
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
}
