package com.czp.service.impl;

import com.czp.dao.UserMapper;
import com.czp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.czp.pojo.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.selectById(id);
	}
}
