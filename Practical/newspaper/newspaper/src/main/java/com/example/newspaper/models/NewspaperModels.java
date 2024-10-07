package com.example.newspaper.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="news")
public class NewspaperModels {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String newsCategory;
	private String newsHeadLine;
	private String completeNews;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNewsCategory() {
		return newsCategory;
	}
	public void setNewsCategory(String newsCategory) {
		this.newsCategory = newsCategory;
	}
	public String getNewsHeadLine() {
		return newsHeadLine;
	}
	public void setNewsHeadLine(String newsHeadLine) {
		this.newsHeadLine = newsHeadLine;
	}
	public String getCompleteNews() {
		return completeNews;
	}
	public void setCompleteNews(String completeNews) {
		this.completeNews = completeNews;
	}
	
	
}
