package com.house.cars;

import java.util.ArrayList;

public class CarList {
	private ArrayList<Car> carList;
	
	public CarList(){
		carList = new ArrayList<Car>();
	}
	
	public void addCar(Car car){
		this.carList.add(car);
	}
	public Car getCar(String id){
		for(Car car:carList){
			if(car.getId().equals(id))
				return car;
		}
		return null;
	}

	public ArrayList<Car> getCarList() {
		return carList;
	}

	public void setCarList(ArrayList<Car> carList) {
		this.carList = carList;
	}
	
	public Car getCarByStyleType(String styleType){
		for(Car car: carList){
			if(!car.isFlag() && styleType.toUpperCase().equals(car.getStyletype().toUpperCase())){
				car.setFlag(true);
				return car;
			}
		}
		for(Car car: carList){
			if(styleType.equals(car.getStyletype())){
				return car;
			}
		}
		return new Car("1","","","","","","","");
		
	}
	
}
