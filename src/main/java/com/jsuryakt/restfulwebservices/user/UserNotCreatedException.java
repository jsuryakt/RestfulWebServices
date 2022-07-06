package com.jsuryakt.restfulwebservices.user;

public class UserNotCreatedException extends RuntimeException {
    public UserNotCreatedException(String msg) {
        super(msg);
    }
}
