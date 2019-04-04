package com.cognizant.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hangar_status")
public class HangerStatus implements Serializable {
	
	@Id
	@Column(name = "hangar_id")
	 private int hangar_Id;
	 
	@Column(name = "manager_id")
	 private String manager_Id;
	 
	@Column(name ="status")
	 private String status;
	 
	@Column(name="occupancy_from_date")
	 private String occuFrom;
	 
	@Column(name="occupancy_till_date")
	 private String occuTill;
	 
	/*@Column(name="available_from_date")
	 private String availableFrom;
	 
	 @Column(name ="available_till_date")
	 private String availableTill;*/
	 
	 
	@Column(name="plane_id")	
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
	/*public String getAvailableFrom() {
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
	}*/


}
