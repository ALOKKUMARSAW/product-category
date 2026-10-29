package com.flipkart.product.request.response;


public class ProductResponse {

	private Long id;
	private String status;
	private String name;
	private String description;
	private Double price;
	private String caregoryName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCaregoryName() {
		return caregoryName;
	}

	public void setCaregoryName(String caregoryName) {
		this.caregoryName = caregoryName;
	}

}