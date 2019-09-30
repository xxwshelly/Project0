package com.xxwshelly.dao;

import com.xxwshelly.pojos.CarsInfo;

public interface CarDao {
	
	//add
	public void addUser(CarsInfo car);
	
	//delete
	boolean deteleUser(int carId);
	
	//read/search
	void show();


}
