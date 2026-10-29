package com.flipkart.category.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flipkart.category.entity.CategoryEntity;


@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, Long> {

	// @EntityGraph(attributePaths = {"products"})
	@Query("SELECT c FROM CategoryEntity c LEFT JOIN FETCH c.products")
	public List<CategoryEntity> getAllCategories();
	

}