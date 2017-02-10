package com.house.cars;

public class InfoResult {
	private String StyleType = "Compact";
	private String personalityInfo;
	private String traits;
	private Personality personality;
	private Car carSelected;
	
	public InfoResult(Personality personality){
		this.personality=personality;
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

	public Personality getPersonality() {
		return personality;
	}

	public void setPersonality(Personality personality) {
		this.personality = personality;
	}

	public Car getCarSelected() {
		return carSelected;
	}

	public void setCarSelected(Car carSelected) {
		this.carSelected = carSelected;
	}
	
}
