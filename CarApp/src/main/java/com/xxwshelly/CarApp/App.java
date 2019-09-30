package com.xxwshelly.CarApp;

import java.util.Scanner;

import com.xxwshelly.dao.UserDao;
import com.xxwshelly.dao.impl.UserDaoImpl;
import com.xxwshelly.pojos.User;
import com.xxwshelly.serivce.Register;

public class App 
{
	private static UserDao ud = new UserDaoImpl();
    public static void main(String[] args) {
//  	ud.addUser(new User(999, "laowang", "9001"));
//    	ud.show();
 
    	while(true) {
    		System.out.println("Please choose: 1.Register, 2.Deleted User, "
    				+ "3. Update Password, 4. View all account");
    		Scanner sc = new Scanner(System.in);
    		Register.show(sc.nextInt());
    	}
    	
    	
    }
	
}
