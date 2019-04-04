package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.DAO.HangerAllocationHibernateDAOImpl;
@Service
public class PlaneDetailsImpl implements PlaneIdDetails {

	
	@Autowired
	HangerAllocationHibernateDAOImpl hangerallocationhibernatedaoimpl;
	
	public List<Number> getPlaneId() {
		// TODO Auto-generated method stub
		
		
		return hangerallocationhibernatedaoimpl.getPlaneDetails();
		//return hangerallocationhibernatedaoimpl.getPlaneDetails();
	}

}
