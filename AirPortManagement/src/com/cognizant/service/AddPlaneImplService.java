package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cognizant.DAO.HibernateDAO;
import com.cognizant.entity.Planes;
import com.cognizant.model.PlaneModel;

@Service("AddPlaneImplService")
public class AddPlaneImplService implements AddPlaneService{

	@Autowired@Qualifier("HibernateDAOImpl")
	HibernateDAO dao;
	
	
	public boolean addPlaneDetails(PlaneModel plane) {
		
		Planes planes=new Planes();
		// TODO Auto-generated method stub
		planes.setPlane_id(plane.getPlane_id());
		planes.setPlane_type(plane.getPlane_type());
		planes.setPlane_capacity(plane.getPlane_capacity());
		planes.setOwner_first_name(plane.getOwner_first_name());
		planes.setOwner_last_name(plane.getOwner_last_name());
		planes.setOwner_id(plane.getOwner_id());
		planes.setOwner_contact_no(plane.getOwner_contact_no());
		planes.setOwner_email(plane.getOwner_email());
		
		
		dao.persistPlanesDetails(planes);
		
		return false;
	}

}
