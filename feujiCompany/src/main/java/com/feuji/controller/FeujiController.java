package com.feuji.controller;


import javax.validation.Valid;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.feuji.bean.FeujiSolutions;
import com.feuji.serviceImp.FeujiSolutionsServiceImp;

@Controller
public class FeujiController {
	
	@Autowired
	private FeujiSolutionsServiceImp feujiSolutionsServiceImp;
	
	
	private static Logger log = LoggerFactory
			.getLogger(FeujiController.class.getSimpleName());
	
	@RequestMapping(path = "/company", method = RequestMethod.GET)
	public ModelAndView companyDetails() {
//		return new ModelAndView("company");
		FeujiSolutions feujiSolutions=new FeujiSolutions();
		feujiSolutions.setCompanyName("tcs");
		return new ModelAndView("company","feujiSolutions",feujiSolutions);
		
	}

	@RequestMapping(path = "/company1",method = RequestMethod.POST)
	public ModelAndView companyVerification(@Valid @ModelAttribute FeujiSolutions feujiSolutions,BindingResult bindingResult) {
//		log.info(feujiSolutions.toString());
//		System.out.println(feujiSolutions);
//		feujiSolutionsServiceImp.save(feujiSolutions);
//		return new ModelAndView("company","feujiSolutions",new FeujiSolutions());
		
		if(bindingResult.hasErrors()) {
			return new ModelAndView("company","feujiSolutions",new FeujiSolutions());
		}
		else {
			return new ModelAndView("successfull","success",new FeujiSolutions());
		}
	}
}
