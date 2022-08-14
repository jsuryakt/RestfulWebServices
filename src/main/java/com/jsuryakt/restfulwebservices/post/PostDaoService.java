//package com.jsuryakt.restfulwebservices.post;
//
//import com.jsuryakt.restfulwebservices.user.User;
//import com.jsuryakt.restfulwebservices.user.UserDaoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//@Component
//public class PostDaoService {
//
//    @Autowired
//    UserDaoService usrSrvc;
//    private static List<Post> posts = new ArrayList<Post>();
//    private static int postIdCount;
//
//    static {
//        posts.add(new Post(1, 1, "Test post 1", "Test 1", "abcd", new Date()));
//        posts.add(new Post(2, 2, "Test post 2", "Test 2", "abcd", new Date()));
//        posts.add(new Post(3, 3, "Test post 3", "Test 3", "abcd", new Date()));
//        postIdCount = posts.size();
//    }
//
//    public List<Post> findAllPostsForUser(User user){
//        List<Post> postsofUser = new ArrayList<>();
//        for(Post post: posts) {
//            if(post.getUser() == user) {
//                postsofUser.add(post);
//            }
//        }
//        return postsofUser;
//    }
//
//    public Post findPost(int postId) {
//        for(Post p: posts) {
//            if(p.getPostId() == postId) {
//                return p;
//            }
//        }
//        return null;
//    }
//
//    public Post createPostForUser(Post post) {
//        if(post.getPostId() == null) {
//            post.setPostId(++postIdCount);
//        }
//        posts.add(post);
//        return post;
//    }
//}
