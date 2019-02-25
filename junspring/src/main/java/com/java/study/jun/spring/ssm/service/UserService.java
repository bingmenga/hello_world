package com.java.study.jun.spring.ssm.service;


import com.java.study.jun.spring.ssm.entity.User;

import java.util.List;

public interface UserService {

	public User login(User user);

	void addUser(User user);

	void addBatchUser(List<User> list);

	void updateUser(User user);

	void updateBatchUser(List<User> list);

	void deleteUser(Integer id);

	void deleteBatchUser(List<Integer> list);
}
