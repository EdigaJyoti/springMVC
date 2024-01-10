package com.feuji.bean;

public class FeujiSolutions {
	
	private String companyName;
	
	private Integer countOfEmployees;
	
	private String location;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getCountOfEmployees() {
		return countOfEmployees;
	}

	public void setCountOfEmployees(Integer countOfEmployees) {
		this.countOfEmployees = countOfEmployees;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "FeujiSolutions [companyName=" + companyName + ", countOfEmployees=" + countOfEmployees + ", location="
				+ location + "]";
	}
	

}
