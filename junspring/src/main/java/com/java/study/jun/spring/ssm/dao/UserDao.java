package com.java.study.jun.spring.ssm.dao;


import com.java.study.jun.spring.ssm.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

	public User login(User user);

    void addUser(User user);

    void addBatchUser(List<User> list);

    void updateUser(User user);

    void updateBatchUser(List<User> list);

    void deleteUser(Integer id);

    void deleteBatchUser(List<Integer> list);
}
