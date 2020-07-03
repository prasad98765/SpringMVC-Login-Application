package com.luv2code.springdemo.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;



@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;
	
	@Value("#{favoriteLanguage}")
	private Map<String, String> languageOption;
	
	@Value("#{operatingSystem}")
	private Map<String, String> operatingSystem;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a student object
		Student theStudent = new Student();
		
		// add student object to the model
		theModel.addAttribute("student",theStudent);
		
		//add the country option to the model
		theModel.addAttribute("theCountryOptions",countryOptions);
			
		//add the language option to the model
		theModel.addAttribute("theLanguageOptions",languageOption);
		
		//add the operating System option to the model
		theModel.addAttribute("theOperatingSystem",operatingSystem);
		
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		//log the input data
		System.out.println("thestudent: "+ theStudent.getFirstName()+" "+ theStudent.getLastName());
		
		return "student-confirmation";
		
	}

}
