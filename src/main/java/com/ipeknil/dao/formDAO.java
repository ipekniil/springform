package com.ipeknil.dao;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ipeknil.entity.Form;

@Repository
public class formDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	//CRUD
	
	public Long insert(Form form) {
		return (Long) sessionFactory.getCurrentSession().save(form);
		
	}
	
	public ArrayList<Form> getAll(){
		Query query =sessionFactory.getCurrentSession().createQuery("FROM form");
		return (ArrayList<Form>) query.getResultList();
	}
}
