package com.edmund.dao;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.SessionFactory;
import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.edmund.entity.Userinfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * Userinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.edmund.entity.Userinfo
 * @author MyEclipse Persistence Tools
 */
@Repository("userinfoDao")
public class UserinfoDAO {
	private static final Logger log = LoggerFactory
			.getLogger(UserinfoDAO.class);

	@Resource(name="sessionFactory")
	SessionFactory  sessionFactory ;
	
	/*Session session = sessionFactory.getCurrentSession();*/
	public Session getCuSession(){
		return sessionFactory.getCurrentSession();
	}
	

	public void save(Userinfo transientInstance) {
		System.out.println("进入方法");
		log.debug("saving Userinfo instance");
		try {
			getCuSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

/*	public void delete(Userinfo persistentInstance) {
		log.debug("deleting Userinfo instance");
		try {
			getCuSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Userinfo findById(java.lang.Integer id) {
		log.debug("getting Userinfo instance with id: " + id);
		try {
			Userinfo instance = (Userinfo) getCuSession().get(
					"com.edmund.entity.Userinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Userinfo instance) {
		log.debug("finding Userinfo instance by example");
		try {
			List results = session.findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Userinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Userinfo as model where model."
					+ propertyName + "= ?";
			return session.find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}



	public Userinfo merge(Userinfo detachedInstance) {
		log.debug("merging Userinfo instance");
		try {
			Userinfo result = (Userinfo) getCuSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Userinfo instance) {
		log.debug("attaching dirty Userinfo instance");
		try {
			getCuSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Userinfo instance) {
		log.debug("attaching clean Userinfo instance");
		try {
			getCuSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	*/

	public void findAll(){
		Query sqlQuery = getCuSession().createQuery("from Userinfo");
		
		List<Userinfo> list = sqlQuery.list();
		for (Userinfo userinfo : list) {
			System.out.println(userinfo.getUsername());
		}
	}
	
	public void getuserinf(){
		Userinfo  userinfo = (Userinfo) getCuSession().get(Userinfo.class, 1);
		System.out.println(userinfo.getUsername());
	}
	//delete  需要使用openSession(),getCurrentSession()不能删除
	public void delete(){
		  Session session=sessionFactory.openSession();
		Userinfo  userinfo = (Userinfo) session.get(Userinfo.class, 17);
		System.out.println(userinfo.getUsername());
		 session.getTransaction().begin();
		session.delete(userinfo);
		 session.getTransaction().commit();
		 session.close();
	}
	public void delete2(){
	
		Userinfo  userinfo = (Userinfo) getCuSession().get(Userinfo.class, 18);
		System.out.println(userinfo.getUsername());
		getCuSession().delete(userinfo);
	
	}
	
	public void update(){
		
		Userinfo  userinfo = (Userinfo) getCuSession().get(Userinfo.class, 17);
		userinfo.setPassword("jsksdkjasSSJ");
		getCuSession().save(userinfo);
	
	}
	
	/*
	

	public static UserinfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UserinfoDAO) ctx.getBean("UserinfoDAO");
	}*/
}