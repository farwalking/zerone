package io.github.xtangyes.zerone.dao;

import io.github.xtangyes.zerone.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author xTang
 * @Date 2021/5/8 9:56 上午
 * @Slogan 傻狗爱编程
 */

@Mapper
@Repository
public interface UserDao {
    @Select("select * from user;")
    List<User> getUsers();
}
