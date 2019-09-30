package com.xxwshelly.pojos;

import java.io.Serializable;

//Serializable is a MARKER INTERFACE
//A marker interface is an interface with no methods
public class CarsInfo implements Serializable{
	private String carMake;	
	private String color;
	private int modelYear;
	private String vin;
	private double price;
	
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public CarsInfo(String carMake, String color, int modelYear, String vin, double price) {
		super();
		this.carMake = carMake;
		this.color = color;
		this.modelYear = modelYear;
		this.vin = vin;
		this.price = price;
	}
	public CarsInfo() {
		super();
	}
	@Override
	public String toString() {
		return "CarsInfo [carMake=" + carMake + ", color=" + color + ", modelYear=" + modelYear + ", vin=" + vin
				+ ", price=" + price + "]";
	}



/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((carMake == null) ? 0 : carMake.hashCode());
		result = prime * result + modelYear;
		result = prime * result + ((vin == null) ? 0 : vin.hashCode());
//		result = prime * result + price;
		return result;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarsInfo other = (CarsInfo) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (carMake == null) {
			if (other.carMake != null)
				return false;
		} else if (!carMake.equals(other.carMake))
			return false;
		if (modelYear != other.modelYear)
			return false;
		if (vin == null) {
			if (other.vin != null)
				return false;
		} else if (!vin.equals(other.vin))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
*/

}
