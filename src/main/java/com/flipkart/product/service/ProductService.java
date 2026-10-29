package com.flipkart.product.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.category.entity.CategoryEntity;
import com.flipkart.category.repository.CategoryRepository;
import com.flipkart.product.entity.ProductEntity;
import com.flipkart.product.repository.ProductRepository;
import com.flipkart.product.request.response.ProductRequest;
import com.flipkart.product.request.response.ProductResponse;


@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	CategoryRepository categoryRepository;

	public ProductResponse createProduct(ProductRequest productRequest) {
		String categoryId = productRequest.getCategoryId();

		CategoryEntity parentEntity = categoryRepository.findById(Long.valueOf(categoryId)).get();

		ProductEntity childEntity = new ProductEntity();

		childEntity.setCategory(parentEntity);
		childEntity.setName(productRequest.getName());
		childEntity.setDescription(productRequest.getDescription());
		childEntity.setPrice(productRequest.getPrice());
		childEntity.setStatus("Active");

		ProductEntity responseEntity = productRepository.save(childEntity);

		ProductResponse productResponse = new ProductResponse();
		productResponse.setCaregoryName(responseEntity.getCategory().getName());
		productResponse.setDescription(responseEntity.getDescription());
		productResponse.setStatus(responseEntity.getStatus());
		productResponse.setPrice(responseEntity.getPrice());

		return productResponse;
	}

}