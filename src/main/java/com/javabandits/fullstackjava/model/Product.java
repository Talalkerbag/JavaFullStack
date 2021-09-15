package com.javabandits.fullstackjava.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Product {

	@Id
	@Column(name="id")
	@GeneratedValue
	private int id;
	private String name;
	private String description;
	private String imageurl;
	private double price;
	private int quantity;
	private String category;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getImageuri() {
		return imageurl;
	}
	public void setImageuri(String imageuri) {
		this.imageurl = imageuri;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", imageurl=" + imageurl
				+ ", price=" + price + ", quantity=" + quantity + ", category=" + category + "]\n";
	}
	public int getQuanity() {
		return quantity;
	}
	public void setQuanity(int quanity) {
		this.quantity = quanity;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
