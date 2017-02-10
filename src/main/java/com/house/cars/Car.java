package com.house.cars;

public class Car {
	private String id;
	private String make;
	private String model;
	private String styletype;
	private String year;
	private String price;
	private String capacity;
	private String weight;
	private boolean flag;
	
	public Car(String id, String make, String model, String bodytype, String year, String price, String capacity, String weight){
		this.id = id;
		this.make=make;
		this.model=model;
		this.styletype=bodytype;
		this.year=year;
		this.price=price;
		this.capacity=capacity;
		this.weight=weight;
		this.flag=false;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	

	public String getStyletype() {
		return styletype;
	}

	public void setStyletype(String styletype) {
		this.styletype = styletype;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", bodytype=" + styletype + ", year=" + year
				+ ", price=" + price + ", capacity=" + capacity + ", weight=" + weight+"]";
	}
	
	
}
