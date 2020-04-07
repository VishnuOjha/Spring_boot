package com.bean;


public class ProductBean {

	
	private String name;
	private int pid,price;
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "ProductBean [name=" + name + ", pid=" + pid + ", price=" + price + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
