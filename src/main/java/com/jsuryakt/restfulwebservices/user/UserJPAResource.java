package com.jsuryakt.restfulwebservices.user;

import com.jsuryakt.restfulwebservices.post.Post;
import com.jsuryakt.restfulwebservices.post.PostNotCreatedException;
import com.jsuryakt.restfulwebservices.post.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class UserJPAResource {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;
    @GetMapping(path = "/jpa/users")
    public List<User> retrieveAllUsers() {
        List<User> users = userRepository.findAll();
        if (users == null) {
            throw new UserNotFoundException("No data found");
        }
        return users;
    }

    @GetMapping(path = "/jpa/users/{id}/posts")
    public List<Post> retrieveAllUserPosts(@Valid @PathVariable int id) {
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent()) {
            throw new UserNotFoundException("No data found");
        }
        return user.get().getPosts();
    }

    @GetMapping(path = "/jpa/users/{id}")
    public EntityModel<User> retrieveUser(@Valid @PathVariable int id) {
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent())
            throw new UserNotFoundException("id-" + id);

        EntityModel<User> model = EntityModel.of(user.get());
        WebMvcLinkBuilder linkToUsers = linkTo(methodOn(this.getClass()).retrieveAllUsers());
        model.add(linkToUsers.withRel("all-users"));
        return model;
    }

    @PostMapping(path = "/jpa/users")
    public ResponseEntity<Object> save(@Valid @RequestBody User user) {
        User savedUser = userRepository.save(user);
        if (savedUser == null) {
            throw new UserNotCreatedException("Failed to create user.");
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(path = "/jpa/users/{id}")
    public User deleteUser(@Valid @PathVariable int id) {
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent())
            throw new UserNotFoundException("id-" + id);
        userRepository.deleteById(id);
        return user.get();
    }

    @PostMapping(path="/jpa/users/{id}/posts")
    public ResponseEntity<Object> createPostForUser(@Valid @PathVariable int id, @Valid @RequestBody Post post) {
        Optional<User> optionalUser = userRepository.findById(id);
        if(!optionalUser.isPresent()) {
            throw new UserNotFoundException("id-"+id);
        }
        User user = optionalUser.get();
        post.setUser(user);
        Post createdPost = postRepository.save(post);
        if (createdPost == null) {
            throw new PostNotCreatedException("Failed to create post.");
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdPost.getPostId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
