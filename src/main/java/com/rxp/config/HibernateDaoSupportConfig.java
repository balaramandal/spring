package com.rxp.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

@Configuration
public class HibernateDaoSupportConfig extends HibernateDaoSupport {
	
	//@Autowired SessionFactory sessionFactory;
	
	@Bean
	@Autowired
	public HibernateTemplate createHibernateTemplate(SessionFactory sessionFactory){
		HibernateTemplate hibernateTemplate = super.createHibernateTemplate(sessionFactory);
		return hibernateTemplate;
	}
	
	@Bean
	@Autowired
	public Session getSession(HibernateTemplate hibernateTemplate){
		return hibernateTemplate.getSessionFactory().getCurrentSession(); //2758.4
	}
}
