package com.example.newspaper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.newspaper.models.NewspaperModels;
import com.example.newspaper.repository.NewsRepository;

@Service
public class NewspaperService {
	
	@Autowired
	private NewsRepository repo;

	//Insertion service
	public NewspaperModels createNews(NewspaperModels newspapermodels) {
		return repo.save(newspapermodels);
	}
	
	public List<NewspaperModels> CreateNewsList(List<NewspaperModels> newspapermodels){
		return repo.saveAll(newspapermodels);
	}
	
	//Retrieve 
	public NewspaperModels getNewsByCategory(String newsCategory) {
		return repo.FindByCategory(newsCategory);
	}
	
	public NewspaperModels getNewsById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	//Delete
	public String DeleteNews(int id) {
		repo.deleteById(id);
		return "News Deleted " +id;
	}
	
	//Update
	public NewspaperModels updateNews(NewspaperModels newspapermodels) {
		NewspaperModels exsistingNews = repo.FindByCategory(newspapermodels.getId());
		exsistingNews.setNewsCategory(newspapermodels.getNewsCategory());
		exsistingNews.setNewsHeadLine(newspapermodels.getNewsHeadLine());
		exsistingNews.setCompleteNews(newspapermodels.getCompleteNews());
		return repo.save(exsistingNews);
	}
}

