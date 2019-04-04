package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cognizant.DAO.HangerAllocationHibernateDAO;
import com.cognizant.entity.HangerStatus;
import com.cognizant.model.HangerStatusModel;

@Service
public class HangerAllocationStatusImpl implements HangerAllocationStatus{

	@Autowired@Qualifier("HangerAllocationHibernateDAOImpl")
	HangerAllocationHibernateDAO hangerallocationhibernatedao;
	
	public boolean allocatePlane(HangerStatusModel hsm) {
		System.out.println("in service impl"+hsm.getPlane_id());
		HangerStatus hs = new HangerStatus();
		hs.setPlane_id(hsm.getPlane_id());
		hs.setOccuFrom(hsm.getOccuFrom());
		hs.setOccuTill(hsm.getOccuTill());
		hs.setStatus("O");
		hs.setHangar_Id(hsm.getHangar_Id());
		hs.setManager_Id(hsm.getManager_Id());
		
		return hangerallocationhibernatedao.allocatePlane(hs);
	}

	


}
