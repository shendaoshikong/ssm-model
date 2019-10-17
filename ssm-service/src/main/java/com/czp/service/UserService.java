package com.czp.service;

import com.czp.pojo.User;

/**
 * Demo class
 *
 * @author czp
 */
public interface UserService {
	/**
	 *
	 * @param id Integer id
	 */
	User selectById(Integer id);

}