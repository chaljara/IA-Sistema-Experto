package com.house.cars;

import java.util.ArrayList;

public class Personality {
        
	private Trait extraversion;
	private Trait introversion;
	private Trait sensing;
	private Trait intuition;
	private Trait thinking;
	private Trait feeling;
	private Trait judging;
	private Trait perceiving;
	private ArrayList<MyersBriggsType> totals;
	
	public Personality(){
		this.extraversion = new Trait("E", 0.0f);
		this.introversion = new Trait("I", 0.0f);;
		this.sensing = new Trait("S", 0.0f);;
		this.intuition = new Trait("N", 0.0f);;
		this.thinking = new Trait("T", 0.0f);;
		this.feeling = new Trait("F", 0.0f);;
		this.judging = new Trait("J", 0.0f);;
		this.perceiving = new Trait("P", 0.0f);;
		this.totals = new ArrayList<MyersBriggsType>(16);
	}
	public Personality add(String initial, int value){
		float amount = 0.000f;
		
		switch(value){
			case 1:
				amount = 0.000f;
				break;
			case 2:
				amount = 0.167f;
				break;
			case 3:
				amount = 0.334f;
				break;
			case 4:
				amount = 0.500f;
				break;
			case 5:
				amount = 0.667f;
				break;
			case 6:
				amount = 0.834f;
				break;
			case 7:
				amount = 1.000f;
				break;
			default:
				break;
		}

		if(initial.equals("EI")){

			introversion.setAmount(introversion.getAmount()+amount);
			extraversion.setAmount(extraversion.getAmount()+(1.000f-amount));
		}
		else if(initial.equals("SN")){
			sensing.setAmount(sensing.getAmount()+amount);
			intuition.setAmount(intuition.getAmount()+(1.000f-amount));
		}
		else if(initial.equals("TF")){

			thinking.setAmount(thinking.getAmount()+amount);
			feeling.setAmount(feeling.getAmount()+(1.000f-amount));
		}
		else if(initial.equals("JP")){
			judging.setAmount(judging.getAmount()+amount);
			perceiving.setAmount(perceiving.getAmount()+(1.000f-amount));
		}
		return this;
	}
	
	public Personality processMB(){
		//System.out.println(extraversion.getAmount() + " "+sensing.getAmount() + " "+thinking.getAmount()+" "+ judging.getAmount());
		//System.out.println(introversion.getAmount() + " "+intuition.getAmount() + " "+feeling.getAmount()+" "+ perceiving.getAmount());
		//Maxima sumatoria para cada personalidad es 30 ( 7+8+8+7 )
		totals.add(0, new MyersBriggsType("ISTJ", PersonalityType.LOGISTICIAN, (introversion.getAmount() + sensing.getAmount() + thinking.getAmount() + judging.getAmount())/30));
		totals.add(1, new MyersBriggsType("ISFJ", PersonalityType.DEFENDER, (introversion.getAmount() + sensing.getAmount() + feeling.getAmount() + judging.getAmount())/30));
		totals.add(2, new MyersBriggsType("INFJ", PersonalityType.ADVOCATE, (introversion.getAmount() + intuition.getAmount() + feeling.getAmount() + judging.getAmount())/30));
		totals.add(3, new MyersBriggsType("INTJ", PersonalityType.ARCHITECT, (introversion.getAmount() + intuition.getAmount() + thinking.getAmount() + judging.getAmount())/30));
		totals.add(4, new MyersBriggsType("ISTP", PersonalityType.VIRTUOSO, (introversion.getAmount() + sensing.getAmount() + thinking.getAmount() + perceiving.getAmount())/30));
		totals.add(5, new MyersBriggsType("ISFP", PersonalityType.ADVENTURER, (introversion.getAmount() + sensing.getAmount() + feeling.getAmount() + perceiving.getAmount())/30));
		totals.add(6, new MyersBriggsType("INFP", PersonalityType.MEDIATOR, (introversion.getAmount() + intuition.getAmount() + feeling.getAmount() + perceiving.getAmount())/30));
		totals.add(7, new MyersBriggsType("INTP", PersonalityType.LOGICIAN, (introversion.getAmount() + intuition.getAmount() + thinking.getAmount() + perceiving.getAmount())/30));
		totals.add(8, new MyersBriggsType("ESTP", PersonalityType.ENTREPRENEUR, (extraversion.getAmount() + sensing.getAmount() + thinking.getAmount() + perceiving.getAmount())/30));
		totals.add(9, new MyersBriggsType("ESFP", PersonalityType.ENTERTAINER, (extraversion.getAmount() + sensing.getAmount() + feeling.getAmount() + perceiving.getAmount())/30));
		totals.add(10, new MyersBriggsType("ENFP", PersonalityType.CAMPAIGNER, (extraversion.getAmount() + intuition.getAmount() + feeling.getAmount() + perceiving.getAmount())/30));
		totals.add(11, new MyersBriggsType("ENTP", PersonalityType.DEBATER, (extraversion.getAmount() + intuition.getAmount() + thinking.getAmount() + perceiving.getAmount())/30));
		totals.add(12, new MyersBriggsType("ESTJ", PersonalityType.EXECUTIVE, (extraversion.getAmount() + sensing.getAmount() + thinking.getAmount() + judging.getAmount())/30));
		totals.add(13, new MyersBriggsType("ESFJ", PersonalityType.CONSUL, (extraversion.getAmount() + sensing.getAmount() + feeling.getAmount() + judging.getAmount())/30));
		totals.add(14, new MyersBriggsType("ENFJ", PersonalityType.PROTAGONIST, (extraversion.getAmount() + intuition.getAmount() + feeling.getAmount() + judging.getAmount())/30));
		totals.add(15, new MyersBriggsType("ENTJ", PersonalityType.COMMANDER, (extraversion.getAmount() + intuition.getAmount() + thinking.getAmount() + judging.getAmount())/30));
		return this;
	}
	
	
	public ArrayList<MyersBriggsType> sortMB(){

		float piv = -1.0f;
		int ntimes = 5;
		ArrayList<MyersBriggsType> selected = new ArrayList<MyersBriggsType>(ntimes);
		MyersBriggsType mbt = null;

		for(int i = 0; i < ntimes ; i++){
			for(int k = 0; k < totals.size(); k++){
				if(!totals.get(k).isSelected() && !totals.get(k).isBigger() && totals.get(k).getSum() > piv){
					totals.get(k).setBigger(true);
					piv = totals.get(k).getSum();
					mbt = totals.get(k);
				}
				
			}
			if(mbt == null) continue;
			//System.out.println(mbt.toString());
			selected.add(new MyersBriggsType(mbt.getName(), mbt.getType(), mbt.getSum()));
			totals.get(totals.indexOf(mbt)).setSelected(true);
			
			for(int m = 0; m < totals.size(); m++){
				totals.get(m).setBigger(false);
			}
			
			piv = 0f;
			mbt = null;
		}
		return selected;
		
	}
	
	public class Trait{
		private String initial;
		private float amount;
		
		public Trait(String initial, float amount){
			this.initial = initial;
			this.amount = amount;
		}

		public String getInitial() {
			return initial;
		}

		public void setInitial(String initial) {
			this.initial = initial;
		}

		public float getAmount() {
			return amount;
		}

		public void setAmount(float amount) {
			this.amount = amount;
		}

		@Override
		public String toString() {
			return "Trait [initial=" + initial + ", amount=" + amount + "]";
		}
		
	}
	
	public class MyersBriggsType{
		private String name;
		private PersonalityType type;
		private float sum;
		private boolean bigger;
		private boolean selected;
		
		public MyersBriggsType(String name, PersonalityType type, float sum){
			this.name = name;
			this.type = type;
			this.sum = sum;
			this.bigger = false;
			this.selected = false;
		}
		
		public PersonalityType getType() {
			return type;
		}

		public void setType(PersonalityType type) {
			this.type = type;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getSum() {
			return sum;
		}

		public void setSum(float sum) {
			this.sum = sum;
		}

		public boolean isBigger() {
			return bigger;
		}

		public void setBigger(boolean bigger) {
			this.bigger = bigger;
		}

		public boolean isSelected() {
			return selected;
		}

		public void setSelected(boolean selected) {
			this.selected = selected;
		}

		@Override
		public String toString() {
			return "MyersBriggsType [name=" + name + ", type=" + type + ", sum=" + sum + ", bigger=" + bigger
					+ ", selected=" + selected + "]";
		}


	} 
	
	public enum PersonalityType{ARCHITECT, LOGICIAN, COMMANDER, DEBATER, ADVOCATE, MEDIATOR, PROTAGONIST
        , CAMPAIGNER, LOGISTICIAN, DEFENDER, EXECUTIVE, CONSUL, VIRTUOSO, ADVENTURER
        , ENTREPRENEUR, ENTERTAINER};
	
}
