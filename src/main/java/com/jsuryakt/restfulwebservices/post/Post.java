package com.jsuryakt.restfulwebservices.post;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jsuryakt.restfulwebservices.user.User;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Integer postId;

    // will not get details of user unless we call post.getUser
    private String title;
    private String description;
    private String image;
    private Date timeStamp;
    @ManyToOne(fetch= FetchType.LAZY)
    @JsonIgnore
    private User user;

    public Post() {
    }

    public Post(Integer postId, User user, String title, String description, String image, Date timeStamp) {
        this.postId = postId;
        this.user = user;
        this.title = title;
        this.description = description;
        this.image = image;
        this.timeStamp = timeStamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }
}
