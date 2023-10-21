package com.mydependancies.deps.users;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoService {
    @Autowired
    public User user;

    public UserDaoService() {
    }
    public List<Users> users(){
    
        return null;
        
    }
}
