package com.starlink.satellite.register.service.pojo;


public class SatAddRequest {
	private String satellite_name = ""; 
	private int norad_id = 44587;
	private double latitude = -60.77;
	private double longitude = 120.47;
	private String altitude = 380.45 + "[km]";
	private String speed_km = 6.24 + " [km/s]";
	private double elevation = -32.1;
	private String declination = "-80° 24' 07''";
	
	
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
	public double getElevation() {
		return elevation;
	}
	public void setElevation(double elevation) {
		this.elevation = elevation;
	}
	public String getDeclination() {
		return declination;
	}
	public void setDeclination(String declination) {
		this.declination = declination;
	}
}
