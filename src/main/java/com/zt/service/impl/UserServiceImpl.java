package com.zt.service.impl;

import com.zt.entity.User;
import com.zt.service.UserService;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

@WebService(targetNamespace = "http://service.zt.com/", endpointInterface = "com.zt.service.UserService")
public class UserServiceImpl implements UserService {
    private Map<String, User> userMap = new HashMap<String, User>();

    public UserServiceImpl() {
        System.out.println("向实体类插入数据");
        User user1 = new User("001", "哈哈", "12");
        User user2 = new User("002", "嘻嘻", "1");
        User user3 = new User("003", "乐乐", "3");
        User user4 = new User("004", "呜呜", "4");
        User user5 = new User("005", "琪琪", "8");
        userMap.put(user1.getUserId(), user1);
        userMap.put(user2.getUserId(), user2);
        userMap.put(user3.getUserId(), user3);
        userMap.put(user4.getUserId(), user4);
        userMap.put(user5.getUserId(), user5);
    }

    @Override
    public String getName(String userId) {
        return "liyd-" + userId;
    }

    @Override
    public User getUser(String userId) {
        System.out.println("userMap是:" + userMap);
        return userMap.get(userId);
    }
}
