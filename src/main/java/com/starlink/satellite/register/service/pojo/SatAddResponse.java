package com.starlink.satellite.register.service.pojo;

public class SatAddResponse {
	
	private String message;
	private String status;
	private String satellite_name;
	private int norad_id;
	private double latitude;
	private double longitude;
	private String altitude;
	private String speed_km;
	private String speed_mi;
	private String azimuth;
	private double elevation;
	private String right_ascension;
	private String declination;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSatellite_name() {
		return satellite_name;
	}
	public void setSatellite_name(String satellite_name) {
		this.satellite_name = satellite_name;
	}
	public int getNorad_id() {
		return norad_id;
	}
	public void setNorad_id(int norad_id) {
		this.norad_id = norad_id;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getAltitude() {
		return altitude;
	}
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	public String getSpeed_km() {
		return speed_km;
	}
	public void setSpeed_km(String speed_km) {
		this.speed_km = speed_km;
	}
	public String getSpeed_mi() {
		return speed_mi;
	}
	public void setSpeed_mi(String speed_mi) {
		this.speed_mi = speed_mi;
	}
	public String getAzimuth() {
		return azimuth;
	}
	public void setAzimuth(String azimuth) {
		this.azimuth = azimuth;
	}
	public double getElevation() {
		return elevation;
	}
	public void setElevation(double elevation) {
		this.elevation = elevation;
	}
	public String getRight_ascension() {
		return right_ascension;
	}
	public void setRight_ascension(String right_ascension) {
		this.right_ascension = right_ascension;
	}
	public String getDeclination() {
		return declination;
	}
	public void setDeclination(String declination) {
		this.declination = declination;
	}
	
}
