package com.morange.dao;

import com.morange.bean.User;
import org.springframework.stereotype.Repository;

@Repository()
public class UserDao extends BaseDao<User> {
    @Override
    public void save() {
        System.out.println("userdao在保存用户");
    }
}
