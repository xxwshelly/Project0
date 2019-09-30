package com.xxwshelly.pojos;

public class Offer {
	
	private int id;
	private String offer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOffer() {
		return offer;
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}
	public Offer(int id, String offer) {
		super();
		this.id = id;
		this.offer = offer;
	}
	public Offer() {
		super();
	}
	
	

}
