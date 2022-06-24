package com.jsuryakt.restfulwebservices.post;

import com.jsuryakt.restfulwebservices.user.User;

import java.util.Date;

public class Post {
    private Integer postId;
    private Integer userId;
    private String title;
    private String description;
    private String image;
    private Date timeStamp;

    public Post(Integer postId, Integer userId, String title, String description, String image, Date timeStamp) {
        this.postId = postId;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.image = image;
        this.timeStamp = timeStamp;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
