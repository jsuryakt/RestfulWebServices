package com.jsuryakt.restfulwebservices.user;

import com.jsuryakt.restfulwebservices.exception.UserNotCreatedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    @GetMapping(path = "/users")
    public List<User> retrieveAllUsers() {
        List<User> users = service.findAll();
        if(users == null) {
            throw new UserNotFoundException("No data found");
        }
        return users;
    }

    @GetMapping(path="/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        User user = service.find(id);
        if(user == null)
            throw new UserNotFoundException("id-"+id);
        return user;
    }

    @PostMapping(path="/users")
    public ResponseEntity<Object> save(@RequestBody User user) {
        User savedUser = service.save(user);
        if(savedUser == null) {
            throw new UserNotCreatedException("Failed to create user.");
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
