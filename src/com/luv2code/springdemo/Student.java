package com.luv2code.springdemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countryOptions;
	private String favoriteLanguage;
	private String favoriteLanguage2;
	private LinkedHashMap<String, String> favoriteLanguageOptions2;
	private String[] operatingSystems;
	
	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BR","Brazil");
		countryOptions.put("VN","Vietnam");
		countryOptions.put("EN","English");
		
		// populate favorite language options
		favoriteLanguageOptions2 = new LinkedHashMap<>();
        // parameter order: value, display label
        //
		favoriteLanguageOptions2.put("Java", "Java");
		favoriteLanguageOptions2.put("C#", "C#");
		favoriteLanguageOptions2.put("PHP", "PHP");
		favoriteLanguageOptions2.put("Ruby", "Ruby");
		
	}
	
	public LinkedHashMap<String, String> getFavoriteLanguageOptions2() {
        return favoriteLanguageOptions2;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}



	public String getFavoriteLanguage2() {
		return favoriteLanguage2;
	}

	public void setFavoriteLanguage2(String favoriteLanguage2) {
		this.favoriteLanguage2 = favoriteLanguage2;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	
}
