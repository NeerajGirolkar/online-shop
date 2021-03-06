package com.online.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id	@GeneratedValue(strategy = GenerationType.AUTO)
	private String productId;
	private String productName;
	private String productCategory;
	private String productDescription;
	private double productPrice;
	private String productCondition;
	private String productState;
	private int unitInStock;
	private String productManufacturer;

	public Product() {
	}

	public Product(String productName, String productCategory, String productDescription, double productPrice,
			String productCondition, String productState, int unitInStock, String productManufacturer) {
		super();
		this.productName = productName;
		this.productCategory = productCategory;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productCondition = productCondition;
		this.productState = productState;
		this.unitInStock = unitInStock;
		this.productManufacturer = productManufacturer;
	}

	public Product(String productId, String productName, String productCategory, String productDescription,
			double productPrice, String productCondition, String productState, int unitInStock,
			String productManufacturer) {
		this(productName, productCategory, productDescription, productPrice, productCondition, productState,
				unitInStock, productManufacturer);
		this.productId = productId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCondition() {
		return productCondition;
	}

	public void setProductCondition(String productCondition) {
		this.productCondition = productCondition;
	}

	public String getProductState() {
		return productState;
	}

	public void setProductState(String productState) {
		this.productState = productState;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

}
