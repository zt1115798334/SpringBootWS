package com.zt.entity;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -5939599230753662529L;
    private String userId;
    private String username;
    private String age;

    public User() {
    }

    public User(String userId, String username, String age) {
        this.userId = userId;
        this.username = username;
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
