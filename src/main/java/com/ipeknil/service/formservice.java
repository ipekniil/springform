package com.ipeknil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ipeknil.dao.formDAO;
import com.ipeknil.entity.Form;

@Service
@Transactional
public class formservice {
    
	@Autowired
	private formDAO formDAO;

	public Long createform(Form form) {
		return formDAO.insert(form);
		
	}
}
