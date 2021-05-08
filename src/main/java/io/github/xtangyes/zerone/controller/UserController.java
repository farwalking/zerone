package io.github.xtangyes.zerone.controller;

import io.github.xtangyes.zerone.entity.User;
import io.github.xtangyes.zerone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author xTang
 * @Date 2021/5/8 9:53 上午
 * @Slogan 傻狗爱编程
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> list(){
        return userService.getUsers();
    }
}
