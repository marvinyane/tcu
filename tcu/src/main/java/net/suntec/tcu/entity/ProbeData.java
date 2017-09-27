package net.suntec.tcu.entity;

import java.sql.Time;

public class ProbeData {
	private static final int ACC_ON = 0;
	private static final int ACC_OFF = 1; 
	
	private Vehicle vehicle;
	private String sVersion;
	private String imei; 
	private int accStatus;
	private Time timeStamp;
	private String gpsInfo;
	private String gsmInfo;
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public String getsVersion() {
		return sVersion;
	}
	public void setsVersion(String sVersion) {
		this.sVersion = sVersion;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public int getAccStatus() {
		return accStatus;
	}
	public void setAccStatus(int accStatus) {
		this.accStatus = accStatus;
	}
	public Time getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Time timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getGpsInfo() {
		return gpsInfo;
	}
	public void setGpsInfo(String gpsInfo) {
		this.gpsInfo = gpsInfo;
	}
	public String getGsmInfo() {
		return gsmInfo;
	}
	public void setGsmInfo(String gsmInfo) {
		this.gsmInfo = gsmInfo;
	}
	public static int getAccOn() {
		return ACC_ON;
	}
	public static int getAccOff() {
		return ACC_OFF;
	}
	
	@Override
	public String toString() {
		return "ProbeData [vehicle=" + vehicle + ", sVersion=" + sVersion
				+ ", imei=" + imei + ", accStatus=" + accStatus
				+ ", timeStamp=" + timeStamp + ", gpsInfo=" + gpsInfo
				+ ", gsmInfo=" + gsmInfo + "]";
	}

}
