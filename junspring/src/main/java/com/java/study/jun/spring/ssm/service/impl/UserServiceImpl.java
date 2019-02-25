package com.java.study.jun.spring.ssm.service.impl;



import com.java.study.jun.spring.ssm.dao.UserDao;
import com.java.study.jun.spring.ssm.entity.User;
import com.java.study.jun.spring.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User login(User user) {
		return userDao.login(user);
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public void addBatchUser(List<User> list) {
		userDao.addBatchUser(list);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public void updateBatchUser(List<User> list) {
		userDao.updateBatchUser(list);
	}

	@Override
	public void deleteUser(Integer id) {
		userDao.deleteUser(id);
	}

	@Override
	public void deleteBatchUser(List<Integer> list) {
		userDao.deleteBatchUser(list);
	}

}
