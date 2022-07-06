package com.jsuryakt.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

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
    public EntityModel<User> retrieveUser(@Valid @PathVariable int id) {
        User user = service.find(id);
        if(user == null)
            throw new UserNotFoundException("id-"+id);

        EntityModel<User> model = EntityModel.of(user);
        WebMvcLinkBuilder linkToUsers = linkTo(methodOn(this.getClass()).retrieveAllUsers());
        model.add(linkToUsers.withRel("all-users"));

        return model;
    }

    @PostMapping(path="/users")
    public ResponseEntity<Object> save(@Valid @RequestBody User user) {
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

    @DeleteMapping(path="/users/{id}")
    public User deleteUser(@Valid @PathVariable int id) {
        User user = service.find(id);
        if(user == null)
            throw new UserNotFoundException("id-"+id);
        return user;
    }
}
