package org.jsp.hibernate.Util;

import java.util.Properties;

public class ConnectionPropertiesUtil {
	
	public static Properties getMySQLConnection() {
		Properties properties = new Properties();
		
		properties.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/thari");
		properties.setProperty("hibernate.connection.username", "root");
		properties.setProperty("hibernate.connection.password", "root");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		
		return properties;
	}

}
