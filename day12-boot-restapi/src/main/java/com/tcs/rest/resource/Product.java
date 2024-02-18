package com.tcs.rest.resource;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pid")
	private int pid;
	private String description;
	private double price;
	private double qty;
	public Product(int productId, String description, double price, double qty) {
		super();
		this.pid = productId;
		this.description = description;
		this.price = price;
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Product [productId=" + pid + ", description=" + description + ", price=" + price + ", qty=" + qty
				+ "]";
	}
	public int getProductId() {
		return pid;
	}
	public void setProductId(int productId) {
		this.pid = productId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public Product() {
		super();
	}
	

}
