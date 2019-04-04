package com.cognizant.DAO;

import java.util.List;

import com.cognizant.entity.HangerStatus;
import com.cognizant.model.HangerStatusModel;

public interface HangerAllocationHibernateDAO {

	
	public boolean allocatePlane(HangerStatus hs);
	
	public List<Number> getPlaneDetails();

}
