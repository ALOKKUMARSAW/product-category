package com.flipkart.category.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.category.request.response.CategoryRequest;
import com.flipkart.category.request.response.CategoryResponse;
import com.flipkart.category.service.CategoryService;


@RestController
@RequestMapping("category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	@PostMapping("/create")
	public ResponseEntity<CategoryResponse> createCategory(@RequestBody CategoryRequest categoryRequest) 
	{
		CategoryResponse response = categoryService.createCategory(categoryRequest);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@GetMapping("showCategories")
	public String listAllCategories() {
		categoryService.showAllCategories();
		return "SUCESS";
	}
}