package com.flipkart.product.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.product.request.response.ProductRequest;
import com.flipkart.product.request.response.ProductResponse;
import com.flipkart.product.service.ProductService;



@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping("create")
	public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productRequest) {

		ProductResponse response = productService.createProduct(productRequest);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
}