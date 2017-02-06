package expert.system.cars;

public class CarSuggest {

	private String modelCar;
	private Personalities type;
	private Quiz survey;
	
	public CarSuggest(){}
	
	public CarSuggest(String modelCar, Personalities type, Quiz survey) {
		this.modelCar = modelCar;
		this.type = type;
		this.survey = survey;
	}

	public String getModelCar() {
		return modelCar;
	}

	public Personalities getType() {
		return type;
	}

	public Quiz getSurvey() {
		return survey;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}

	public void setType(Personalities type) {
		this.type = type;
	}

	public void setSurvey(Quiz survey) {
		this.survey = survey;
	}
		
}
