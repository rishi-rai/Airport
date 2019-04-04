package com.cognizant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Planes")
public class Planes {

	@Id
	@Column(name="plane_id")
	private int plane_id;
	
	@Column(name="owner_id")
	private int owner_id;
	
	@Column(name="owner_first_name")
	private String owner_first_name;
	
	@Column(name ="owner_last_name")
	private String owner_last_name;
	
	@Column(name ="owner_contact_no")
	private int owner_contact_no;
	
	@Column(name ="owner_email")
	private String owner_email;

	@Column(name ="plane_type")
	private String plane_type;
	
	@Column(name ="plane_capacity")
	private int plane_capacity;
	
	public int getPlane_id() {
		return plane_id;
	}
	public void setPlane_id(int plane_id) {
		this.plane_id = plane_id;
	}
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	public String getOwner_first_name() {
		return owner_first_name;
	}
	public void setOwner_first_name(String owner_first_name) {
		this.owner_first_name = owner_first_name;
	}
	public String getOwner_last_name() {
		return owner_last_name;
	}
	public void setOwner_last_name(String owner_last_name) {
		this.owner_last_name = owner_last_name;
	}
	public int getOwner_contact_no() {
		return owner_contact_no;
	}
	public void setOwner_contact_no(int owner_contact_no) {
		this.owner_contact_no = owner_contact_no;
	}
	public String getOwner_email() {
		return owner_email;
	}
	public void setOwner_email(String owner_email) {
		this.owner_email = owner_email;
	}
	public String getPlane_type() {
		return plane_type;
	}
	public void setPlane_type(String plane_type) {
		this.plane_type = plane_type;
	}
	public int getPlane_capacity() {
		return plane_capacity;
	}
	public void setPlane_capacity(int plane_capacity) {
		this.plane_capacity = plane_capacity;
	}
	
	
	
	
}
