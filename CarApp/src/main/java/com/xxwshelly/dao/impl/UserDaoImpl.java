package com.xxwshelly.dao.impl;

import java.util.ArrayList;
import java.util.List;
import com.xxwshelly.dao.UserDao;
import com.xxwshelly.pojos.User;

public class UserDaoImpl implements UserDao {

	private static List<User> list = new ArrayList<User>();
	
	
	static {
		for(int i = 0; i< 31; i++) {
			list.add(new User(1000+i, "u00" +i,"500"+i));
		}
	}

	
	public void addUser(User user) {
		// TODO Auto-generated method stub
		if(user != null) {
			for (int i =0; i<list.size(); i++) {
				if (list.get(i).getId()==user.getId()) {
					System.out.println("User already exist, please login!");
					return;
				}
			}
		}
		list.add(user);
		System.out.println("user added!");
	}

	public boolean deteleUser(int id) {
		// TODO Auto-generated method stub
		for (int i =0; i<list.size(); i++) {
			
			if(list.get(i).getId() == id) {
				list.remove(i);
				System.out.println("User deleted.");
				return true;
			}
		}
		return false;
	}


	public void show() {
		// TODO Auto-generated method stub
		
		for(int i =0; i<list.size(); i++) {
			System.out.println("User Data: "+list.get(i));
		}

	}

/*	public boolean isLogin(String user, String password) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for(User ) {
			if(user.contentEquals(user1.getName())&& password.equals(User.getPassWord())) {
				flag = true;
				break;
			}
		
		return false;
		
	}
*/
	
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

public boolean isLogin(String user, String password) {
	// TODO Auto-generated method stub
	return false;
}


 
}
