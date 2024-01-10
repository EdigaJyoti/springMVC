package com.feuji.repository;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.feuji.entity.FeujiCompany;

@Repository
@Transactional
public class FeujiRepository {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void save(FeujiCompany feujiCompany) {
		 hibernateTemplate.save(feujiCompany);
	}

}
