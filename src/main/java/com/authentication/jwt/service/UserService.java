package com.authentication.jwt.service;

import com.authentication.jwt.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(), "Bishnnu", "bishnu@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Priya", "priya@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Prusty", "prusty@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
