package com.imooc.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static Session session;
	
	static {
		Configuration config = new Configuration().configure();
		ServiceRegistry service = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		sessionFactory = config.buildSessionFactory(service);
		//session = sessionFactory.getCurrentSession();
		session = sessionFactory.openSession();	
	}
	
	public static SessionFactory getSessionFactory () {
		return sessionFactory;
	}
	
	public static Session getSession () {
		return session;
	}
	
	public static void closeSession(Session session) {
		if(session != null) {
			session.close();
		}
	}
	
	
}
