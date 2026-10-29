package com.flipkart.category.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.category.entity.CategoryEntity;
import com.flipkart.category.repository.CategoryRepository;
import com.flipkart.category.request.response.CategoryRequest;
import com.flipkart.category.request.response.CategoryResponse;
import com.flipkart.product.entity.ProductEntity;


@Service
public class CategoryService {
	
	

	@Autowired
	CategoryRepository categoryRepository;
	// total 4 queries.   ----> N categories ---- N+ 1 
	public void showAllCategories() {
		System.out.println("categoryService.showAllCategories() :::::::::::::::: START:");
		/*
		 This is fired one query to get all the categories
		 */
		//Iterable<CategoryEntity> categoryies = categoryRepository.findAll();
		
		List<CategoryEntity> categoryies = categoryRepository.getAllCategories();
		for(CategoryEntity categoryEntity : categoryies) {
			System.out.println(categoryEntity.getName());
			System.out.println(categoryEntity.getId());
			
			List<ProductEntity> products = categoryEntity.getProducts();
			
			System.out.println("Total products are : "+products.size());
		}
		System.out.println("categoryService.showAllCategories() :::::::::::::::: END:");
	}

	public CategoryResponse createCategory(CategoryRequest categoryRequest) {
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setName(categoryRequest.getName());
		categoryEntity.setDescription(categoryRequest.getDescription());
		categoryEntity.setStatus("Active");
		CategoryEntity responseEntiry = categoryRepository.save(categoryEntity);

		CategoryResponse categoryResponse = new CategoryResponse();
		categoryResponse.setId(responseEntiry.getId());
		categoryResponse.setName(responseEntiry.getName());
		categoryResponse.setDescription(responseEntiry.getDescription());
		categoryResponse.setStatus(responseEntiry.getStatus());

		return categoryResponse;
	}

}