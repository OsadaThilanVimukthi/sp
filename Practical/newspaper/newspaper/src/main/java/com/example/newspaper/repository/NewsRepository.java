package com.example.newspaper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.newspaper.models.NewspaperModels;

public interface NewsRepository extends JpaRepository<NewspaperModels,Integer> {

	

	

	NewspaperModels FindByCategory(String newsCategory);

}
