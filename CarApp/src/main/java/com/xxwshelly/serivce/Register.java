package com.xxwshelly.serivce;

import java.util.Scanner;

import com.xxwshelly.dao.UserDao;
import com.xxwshelly.dao.impl.UserDaoImpl;
import com.xxwshelly.pojos.User;

public class Register {
	
	private static UserDao userDao = new UserDaoImpl();
	
	public static void show(int number) {
		switch (number) {
		case 1: userDao.addUser(getUser());
			
			break;
		case 2: userDao.isLogin(getUser(),getPassWord());
			
			break;
		case 3: userDao.show();
			break;
			
			default: System.exit(0);
				break;
		}
	}
	

	//data insert
	public static User getUser() {
		System.out.println("Please start:");
		
		System.out.println("id");
		Scanner sc = new Scanner(System.in);
		int ID =sc.nextInt();
		
		System.out.println("name");
		Scanner scname = new Scanner(System.in);
		String Name =scname.next();
		
		System.out.println("password");
		Scanner scpassw = new Scanner(System.in);
		String Password = scpassw.next();
		
		return new User(ID, Name, Password);
	}

	public static int getID() {
		System.out.println("deleted the thing you want");
		Scanner sc = new Scanner(System.in);
		int nextInt = sc.nextInt();
		return nextInt;
	}
	
}
