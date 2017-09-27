package net.suntec.tcu.entity;

import java.sql.Date;


public class Vehicle {
	private int serialNumber;
	private String productTime;
	
	public String getProductTime() {
		return productTime;
	}
	public void setProductTime(String productTime) {
		this.productTime = productTime;
	}
	public int getSerialNumner() {
		return serialNumber;
	}
	public void setSerialNumner(int serialNumner) {
		this.serialNumber = serialNumner;
	}

	
	@Override
	public String toString() {
		return "Vehicle [serialNumber=" + serialNumber + ", productTime="
				+ productTime + "]";
	}
}
