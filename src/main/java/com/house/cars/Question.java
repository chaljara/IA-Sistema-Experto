package com.house.cars;

public class Question {

		private String Question;
		private int Answer;
		//private ArrayList<MultipleChoice> Answers;
		public Question(String question, int answer) {
			Question = question;
			Answer = answer >= 0 && answer <= 3 || answer >= -3 && answer <= 0 ? answer : 0;
		}
		public String getQuestion() {
			return Question;
		}
		public int getAnswer() {
			return Answer;
		}		
		
}
