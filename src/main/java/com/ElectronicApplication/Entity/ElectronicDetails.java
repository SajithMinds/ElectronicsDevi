package com.ElectronicApplication.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Electronic_Table")
public class ElectronicDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Name")
	private String Name;
	@Column(name="Category")
	private String Category;
	@Column(name="Price")
	private long Price;
	
	public ElectronicDetails(String name, String category, long price) {
		super();
		Name = name;
		Category = category;
		Price = price;
	}
	public ElectronicDetails() {
		super();
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public String getCategory() {
		return Category;
	}
	public long getPrice() {
		return Price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public void setPrice(long price) {
		Price = price;
	}
	
}
