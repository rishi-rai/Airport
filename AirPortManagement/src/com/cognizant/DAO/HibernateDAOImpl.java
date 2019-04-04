package com.cognizant.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.entity.Planes;

@Repository("HibernateDAOImpl")
public class HibernateDAOImpl implements HibernateDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public boolean persistPlanesDetails(Planes planes) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(planes);
		
		transaction.commit();
		session.close();
		return true;
	}
	

}
