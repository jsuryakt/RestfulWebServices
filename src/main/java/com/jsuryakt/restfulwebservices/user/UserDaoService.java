package com.jsuryakt.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<User>();

    private static int userCount;

    static {
        users.add(new User(1, "Jaya", new Date()));
        users.add(new User(2, "Surya", new Date()));
        users.add(new User(3, "Kotian", new Date()));
        userCount = users.size();
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if(user.getId()==null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User find(int id) {
        for(User user:users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }


}
