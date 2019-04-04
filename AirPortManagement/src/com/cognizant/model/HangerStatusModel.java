package com.cognizant.model;

public class HangerStatusModel {

	
 private int hangar_Id;
 private String manager_Id;
 private String status;
 private String occuFrom;
 private String occuTill;
 private String availableFrom;
 private String availableTill;
 private int plane_id;
 

public int getPlane_id() {
	return plane_id;
}
public void setPlane_id(int plane_id) {
	this.plane_id = plane_id;
}
public int getHangar_Id() {
	
	 return hangar_Id;
}
public void setHangar_Id(int hangar_Id) {
	this.hangar_Id = hangar_Id;
}
public String getManager_Id() {
	return manager_Id;
}
public void setManager_Id(String manager_Id) {
	this.manager_Id = manager_Id;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getOccuFrom() {
	return occuFrom;
}
public void setOccuFrom(String occuFrom) {
	this.occuFrom = occuFrom;
}
public String getOccuTill() {
	return occuTill;
}
public void setOccuTill(String occuTill) {
	this.occuTill = occuTill;
}
public String getAvailableFrom() {
	return availableFrom;
}
public void setAvailableFrom(String availableFrom) {
	this.availableFrom = availableFrom;
}
public String getAvailableTill() {
	return availableTill;
}
public void setAvailableTill(String availableTill) {
	this.availableTill = availableTill;
}
@Override
public String toString() {
	return "HangerStatusModel [hangar_Id=" + hangar_Id + ", manager_Id=" + manager_Id + ", status=" + status
			+ ", occuFrom=" + occuFrom + ", occuTill=" + occuTill + ", availableFrom=" + availableFrom
			+ ", availableTill=" + availableTill + ", plane_id=" + plane_id + "]";
}



}
