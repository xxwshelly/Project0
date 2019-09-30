package com.xxwshelly.dao;

import com.xxwshelly.pojos.User;

public interface UserDao {
	

	public boolean isLogin(String user, String password);
	
	//add
	public void addUser(User user);
	//delete
	boolean deteleUser(int id);
	//update
	boolean updateUser(User user);
	
	//read/search
	void show();


}
