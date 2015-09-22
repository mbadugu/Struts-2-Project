package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	//code to create a session factory object
	private static SessionFactory sessionFactory;

	static{ //class is loaded only once for the whole app and then the static blocks will execute immediately by default
	Configuration configuration = new Configuration();
	configuration.configure(); //loads the hibernate.cfg.xml file
	StandardServiceRegistryBuilder serviceRegistry=new StandardServiceRegistryBuilder();//NEEDED TO BUILD A SESSION
	ServiceRegistry registry = serviceRegistry.applySettings(configuration.getProperties()).build();
	sessionFactory=configuration.buildSessionFactory(registry);
	
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	

}
