package org.jsp.hibernate.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jsp.hibernate.Util.SessionPropertiesUtil;
import org.jsp.hibernate.dto.UserDTO;
import org.jsp.hibernate.entity.UserDetails;

public class UserRepo {

	public void SaveOrUpdate(UserDetails userDetails) {
		SessionFactory sessionFactory = SessionPropertiesUtil.getConnection();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(userDetails);
		transaction.commit();
	}

	public UserDetails findId(int id) {
		SessionFactory sessionFactory = SessionPropertiesUtil.getConnection();
		Session session = sessionFactory.openSession();
		UserDetails userDetails = session.get(UserDetails.class, id);
		return userDetails;
	}

	public void update(UserDTO dto) {
		UserDetails findId = findId(dto.getId());
		if (findId != null) {
			findId.setName(dto.getName());
			findId.setEmail(dto.getEmail());
			SaveOrUpdate(findId);
		}
	}
	public void delete(int id) {
		UserDetails id2 = findId(id);
		SessionFactory sessionFactory = SessionPropertiesUtil.getConnection();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(id2);
		transaction.commit();
	}

}
