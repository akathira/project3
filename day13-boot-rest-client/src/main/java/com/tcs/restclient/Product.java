package com.tcs.restclient;

public class Product {

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

