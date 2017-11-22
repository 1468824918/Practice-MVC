package com.lanou.domain;

import java.util.List;
import java.util.Map;

/**
 * Created by dllo on 17/11/22.
 */
public class UserCustom {
    private User user;
    private List<User> userList;
    private Map<String,Object> map;

    public UserCustom() {
    }

    public UserCustom(User user, List<User> userList, Map<String, Object> map) {
        this.user = user;
        this.userList = userList;
        this.map = map;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "UserCustom{" +
                "user=" + user +
                ", userList=" + userList +
                ", map=" + map +
                '}';
    }
}
