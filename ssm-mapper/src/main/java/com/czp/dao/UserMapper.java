package com.czp.dao;

import com.czp.pojo.User;

import java.util.List;

public interface UserMapper {

	public abstract User selectById(Integer id);
}