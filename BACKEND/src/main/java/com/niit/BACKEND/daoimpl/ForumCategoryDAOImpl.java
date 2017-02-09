package com.niit.BACKEND.daoimpl;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.BACKEND.dao.ForumCategoryDAO;
import com.niit.BACKEND.model.ForumCategory;


@EnableTransactionManagement
@Repository("forumCategoryDao")
public class ForumCategoryDAOImpl implements ForumCategoryDAO {

	private static final Logger log = LoggerFactory.getLogger(ForumCategoryDAOImpl.class);

	
	@Autowired
	private SessionFactory sessionFactory;

	public ForumCategoryDAOImpl() {

	}

	public ForumCategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")

	@Transactional
	public List<ForumCategory> getAllForumCategory() {
		List<ForumCategory> allFrmCat = null;
		try {

			log.debug("Method => getAllForumCategory() execution is starting");
			allFrmCat = sessionFactory.getCurrentSession().createQuery("FROM ForumCategory").list();
			if (allFrmCat == null || allFrmCat.isEmpty()) {
				log.debug("Record not found in UserType table");
			}
		} catch (HibernateException ex) {
			log.debug("Fetch Error :" + ex.getMessage());
			ex.printStackTrace();
		}
		return allFrmCat;
	}

	@Transactional
	public boolean forumCategoryUpdate(ForumCategory forumcategory) {
		try {
			log.debug("Method => forumCategoryUpdate() execution is starting");
			sessionFactory.getCurrentSession().saveOrUpdate(forumcategory);
			return true;
		} catch (HibernateException ex) {
			log.debug("Data Save Error :" + ex.getMessage());
			ex.printStackTrace();
			return false;
		}
	}

	@Transactional
	public ForumCategory getForumCategoryByID(int fcid) {
		try {
			log.debug("Method => getForumCategoryByID() execution is starting");
			return (ForumCategory) sessionFactory.getCurrentSession().get(ForumCategory.class, fcid);
		} catch (HibernateException ex) {
			log.debug("Data Save Error :" + ex.getMessage());
			ex.printStackTrace();
			return null;
		}
	}
}
