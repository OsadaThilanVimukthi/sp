package com.example.newspaper.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.newspaper.models.NewspaperModels;
import com.example.newspaper.service.NewspaperService;

@RestController
public class NewsControllers {
	
	@Autowired
	private NewspaperService service;
	
	
	//get news create form
	
//	@GetMapping("/addNews")
//	public String getCreateForm(Model model) {
//		NewspaperModels newspapermodels = new NewspaperModels();
//		model.addAttribute("NewspaperModels",newspapermodels);
//		return "newspaper/createnews";
//	}
//	
//	//InsertNews
//	
//	@PostMapping("/addNews")
//	public String createNews(@ModelAttribute("newsservice") NewspaperModels newspapermodels ) {
//		service.createNews(newspapermodels);
//		return "newspaper/createnews";
//	}
//	
//	public String viewAllNews()
	
	@PostMapping("/addPost")
	public NewspaperModels createnews(NewspaperModels newspapermodels) {
		return service.createNews(newspapermodels);
	}
	
	@GetMapping("/getPost/{newsCategory}")
	
	public NewspaperModels viewNewsByCategory(@PathVariable String newsCategory) {
		return service.getNewsByCategory(newsCategory);
	}

}
