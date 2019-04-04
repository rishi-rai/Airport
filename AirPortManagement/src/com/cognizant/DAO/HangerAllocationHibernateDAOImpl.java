package com.cognizant.DAO;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;

import com.cognizant.entity.HangerStatus;
import com.cognizant.model.HangerStatusModel;

@Repository("HangerAllocationHibernateDAOImpl")
public class HangerAllocationHibernateDAOImpl implements HangerAllocationHibernateDAO {


	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean allocatePlane(HangerStatus hs) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(hs);
		
		transaction.commit();
		session.close();
		return true;
		
		
	}

	public List<Number> getPlaneDetails(){
		
		Session session = sessionFactory.openSession();
		
	      SQLQuery query = 
	    		  session.createSQLQuery("select p.plane_id from planes p , HANGAR_STATUS hs  where  p.plane_id!=hs.PLANE_ID ");
		
		List<Number> planeId = query.list();
		return planeId;
		
	}
}
