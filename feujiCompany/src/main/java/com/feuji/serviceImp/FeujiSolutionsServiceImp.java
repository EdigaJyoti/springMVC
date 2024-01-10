package com.feuji.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feuji.bean.FeujiSolutions;
import com.feuji.entity.FeujiCompany;
import com.feuji.repository.FeujiRepository;
import com.feuji.service.FeujiSolutionsService;

@Service
public class FeujiSolutionsServiceImp implements FeujiSolutionsService{

	@Autowired
	private FeujiRepository feujiRepository;
	
	@Override
	public void save(FeujiSolutions feujiSolutions) {
		FeujiCompany feujiCompany = new FeujiCompany();
		feujiCompany.setCompanyName(feujiSolutions.getCompanyName());
		feujiCompany.setCountOfEmployees(feujiSolutions.getCountOfEmployees());
		feujiCompany.setLocation(feujiSolutions.getLocation());
		 feujiRepository.save(feujiCompany);
	}

}
