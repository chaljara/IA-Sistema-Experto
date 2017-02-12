package com.house.cars;

import java.util.ArrayList;

import com.house.cars.Personality.MyersBriggsType;

public class InfoResult {
	private String StyleType = "Compact";
	private String personalityInfo;
	private String traits;
	private MyersBriggsType MBType;
	private Car carSelected;
	
	
	public InfoResult() {
	}
	

	public InfoResult(MyersBriggsType mBType) {
		super();
		MBType = mBType;
	}

	
	public MyersBriggsType getMBType() {
		return MBType;
	}


	public void setMBType(MyersBriggsType mBType) {
		MBType = mBType;
	}


	public String getPersonalityInfo() {
		return personalityInfo;
	}

	public void setPersonalityInfo(String personalityInfo) {
		this.personalityInfo = personalityInfo;
	}
	

	public String getTraits() {
		return traits;
	}

	public void setTraits(String traits) {
		this.traits = traits;
	}

	public String getStyleType() {
		return StyleType;
	}

	public void setStyleType(String styleType) {
		StyleType = styleType;
	}
	public Car getCarSelected() {
		return carSelected;
	}

	public void setCarSelected(Car carSelected) {
		this.carSelected = carSelected;
	}


	@Override
	public String toString() {
		return "InfoResult [StyleType=" + StyleType + ", traits=" + traits + ", MBType=" + MBType + ", carSelected="
				+ carSelected + "]";
	}
	
}
