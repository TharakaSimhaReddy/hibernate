package org.jsp.hibernate.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jsp.hibernate.entity.UserDetails;

public class SessionPropertiesUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getConnection() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.setProperties(ConnectionPropertiesUtil.getMySQLConnection());
			configuration.addAnnotatedClass(UserDetails.class);
			SessionFactory factory = configuration.buildSessionFactory();
			return factory;
		}
		return sessionFactory;
	}

}
