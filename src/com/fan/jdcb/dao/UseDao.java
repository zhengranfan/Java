package com.fan.jdcb.dao;

import com.fan.jdcb.domain.User;

public interface UseDao {	
	public void addUser(User user);

	public User getUser(int userId);

	public User findUser(String loginName, String password);

	public void update(User user);

	public void delete(User user);
	
}
