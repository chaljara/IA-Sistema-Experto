package com.house.cars;

import java.util.ArrayList;

public class Quiz {
	
	private ArrayList<Question> questions;

	public Quiz() {
		questions = new ArrayList<Question>();
		questions.add(new Question("1. You find it difficult to introduce yourself to other people" , 0));
		questions.add(new Question("2. You often get so lost in thoughts that you ignore or forget your surroundings" , 0));
		questions.add(new Question("3. You do not find it easy to stay relaxed and focused " , 0));
		questions.add(new Question("4. You do not usually initiate conversation" , 0));
		questions.add(new Question("5. You do not feel superior to other people" , 0));
		questions.add(new Question("6. Being organized is less important to you than being adaptable" , 0));
		questions.add(new Question("7. Winning a debate matters less to you than making sure no one gets upset" , 0));
		questions.add(new Question("8. You do not mind being at the center of attention" , 0));
		questions.add(new Question("9. You consider yourself more creative than practical" , 0));
		questions.add(new Question("10. People can rarely upset you" , 0));
		questions.add(new Question("11. Your travel plans are not well thought out" , 0));
		questions.add(new Question("12. It is often difficult for you to relate to other people\u2019s feelings" , 0));
		questions.add(new Question("13. Your mood can change very quickly" , 0));
		questions.add(new Question("14. In a discussion, people's sensitivities should be more important than truth." , 0));
		questions.add(new Question("15. You often worry about how your actions affect other people" , 0));
		questions.add(new Question("16. You often get carried away by fantasies and ideas" , 0));
		questions.add(new Question("17. You often find yourself lost in thought when you are walking in nature" , 0));
		questions.add(new Question("18. As a parent, you would rather see your child grow up kind than smart" , 0));
		questions.add(new Question("19. You often let other people influence your actions" , 0));
		questions.add(new Question("20. Your dreams do not tend to focus on the real world and its events" , 0));
		questions.add(new Question("21. You often spend time exploring unrealistic and impractical yet intriguing ideas" , 0));
		questions.add(new Question("22. You would rather improvise than spend time coming up with a detailed plan" , 0));
		questions.add(new Question("23. You are a reserved and quiet person" , 0));
		questions.add(new Question("24. You often contemplate the reasons for human existence" , 0));
		questions.add(new Question("25. Being right is less important than being cooperative when it comes to teamwork" , 0));
		questions.add(new Question("26. You frequently misplace your things" , 0));
		questions.add(new Question("27. Your mind is always buzzing with unexplored ideas and plans" , 0));
		questions.add(new Question("28. If the room is full, you stay closer to the walls, avoiding the center" , 0));
		questions.add(new Question("29. You have always been interested in unconventional and ambiguous things, e.g. in books, art, or movies" , 0));
		questions.add(new Question("30. You do not take initiative in social situations" , 0));
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	} 
	/*
public static Personality DefinirPersonalidad(String EI, String SN, String TF, String JP){
		
		if(EI.equals("Introvertion") && SN.equals("Intuition") && TF.equals("Thinking")){
			if(JP.equals("Judging"))
				return Personality.ARCHITECT;
			else if(JP.equals("Perceiving"))
				return Personality.LOGICIAN;
		
		} else
		
		if(EI.equals("Extravertion") && SN.equals("Intuition") && TF.equals("Thinking")){
			if(JP.equals("Judging"))
				return Personality.COMMANDER;
			else if(JP.equals("Perceiving"))
				return Personality.DEBATER;
		
		} else
		
		if(EI.equals("Introvertion") && SN.equals("Intuition") && TF.equals("Feeling")){
			if(JP.equals("Judging"))
				return Personality.ADVOCATE;
			else if(JP.equals("Perceiving"))
				return Personality.MEDIATOR;
		
		} else
		
		if(EI.equals("Extravertion") && SN.equals("Intuition") && TF.equals("Feeling")){
			if(JP.equals("Judging"))
				return Personality.PROTAGONIST;
			else if(JP.equals("Perceiving"))
				return Personality.CAMPAIGNER;
		} else
		
		if(EI.equals("Introvertion") && SN.equals("Sensing") && JP.equals("Judging")){
			if(TF.equals("Thinking"))
				return Personality.LOGISTICIAN;
			else if(TF.equals("Feeling"))
				return Personality.DEFENDER;
		
		} else
		
		if(EI.equals("Extravertion") && SN.equals("Sensing") && JP.equals("Judging")){
			if(TF.equals("Thinking"))
				return Personality.EXECUTIVE;
			else if(TF.equals("Feeling"))
				return Personality.CONSUL;
		
		} else
		
		if(EI.equals("Introvertion") && SN.equals("Sensing") && JP.equals("Perceiving")){
			if(TF.equals("Thinking"))
				return Personality.VIRTUOSO;
			else if(TF.equals("Feeling"))
				return Personality.ADVENTURER;
		
		} else
		
		if(EI.equals("Extravertion") && SN.equals("Sensing") && JP.equals("Perceiving")){
			if(TF.equals("Thinking"))
				return Personality.ENTREPRENEUR;
			else if(TF.equals("Feeling"))
				return Personality.ENTERTAINER;
		}
	
		
		return null;
				
		
	}
	*/	
}
