package org.jsp.hibernate.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.jsp.hibernate.Util.SessionPropertiesUtil;
import org.jsp.hibernate.entity.UserDetails;

public class UserHQLRepo {
	
	public List<UserDetails> findAll() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("from UserDetails");
		SessionFactory sessionFactory = SessionPropertiesUtil.getConnection();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(stringBuffer.toString());
		return query.getResultList();
	}
	
	public List<UserDetails> findByName(String name){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("from UserDetails where name=:n");
		SessionFactory sessionFactory = SessionPropertiesUtil.getConnection();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(stringBuffer.toString());
		query.setParameter("n",name);
		return query.getResultList();
	}
	
	public void updatePhoneNumByEmail(String phoneNumber, String email){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("update UserDetails set phoneNumber=:p where email=:e");
		SessionFactory sessionFactory = SessionPropertiesUtil.getConnection();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(stringBuffer.toString());
		query.setParameter("p", phoneNumber);
		query.setParameter("e", email);
		query.executeUpdate();
		transaction.commit();
	}
	
	public void deleteById(int id) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("delete from UserDetails where id=:id");
		SessionFactory sessionFactory = SessionPropertiesUtil.getConnection();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(stringBuffer.toString());
		query.setParameter("id", id);
		query.executeUpdate();
		transaction.commit();
		
	}

}
