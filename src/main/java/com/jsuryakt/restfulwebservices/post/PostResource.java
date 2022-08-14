//package com.jsuryakt.restfulwebservices.post;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class PostResource {
//
//    @Autowired
//    PostDaoService postSrvc;
//
//    @GetMapping(path = "/users/{userId}/posts")
//    public List<Post> retrievePostsOfUser(@PathVariable int userId) {
//        List<Post> allPostsForUser = postSrvc.findAllPostsForUser(userId);
//        if(allPostsForUser == null) {
//            throw new RuntimeException("Not found");
//        }
//        return allPostsForUser;
//    }
//
//    @GetMapping(path = "users/posts/{postId}")
//    public Post retrievePost(@PathVariable int postId) {
//        Post post = postSrvc.findPost(postId);
//        if(post == null) {
//            throw new RuntimeException("Not Found");
//        }
//        return post;
//    }
//
//    @PostMapping(path = "users/posts")
//    public Post savePost(@RequestBody Post post) {
//        Post postForUser = postSrvc.createPostForUser(post);
//        if(postForUser == null) {
//            throw new RuntimeException("Failed to create");
//        }
//        return postForUser;
//    }
//
//}
