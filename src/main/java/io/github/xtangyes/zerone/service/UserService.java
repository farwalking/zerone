package io.github.xtangyes.zerone.service;

import io.github.xtangyes.zerone.dao.UserDao;
import io.github.xtangyes.zerone.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xTang
 * @Date 2021/5/8 9:55 上午
 * @Slogan 傻狗爱编程
 */

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<User> getUsers(){
        return userDao.getUsers();
    }
}
