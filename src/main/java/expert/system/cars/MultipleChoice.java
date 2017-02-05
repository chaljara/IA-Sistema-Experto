package expert.system.cars;

import java.util.ArrayList;
import java.util.Iterator;

public class MultipleChoice {

	private ArrayList<String> Answers;
	
	//Recibe el valor del slider, devuelve un arreglo double, en index 0 el valor de extro y en index 1 el intro.
	
public static double[] Calcular_Percent_ExtravertionVsIntravertion(int slidervalue){ //Ingresar como parametro el valor del slide (1-7) -> slider.getValue()
		int likert=0;
		double pintro=0;
		double pextro=0;
		double vector[]=new double[2];
		
		switch (slidervalue){
		case 1:
			likert=-3;
			pextro=1;
			break;
		case 2:
			likert=-2;
			pextro=0.834;
			break;
		case 3:
			likert=-1;
			pextro=0.667;
			break;
		case 4:
			likert=0;
			break;
		case 5:
			likert=1;
			pintro=0.667;
			break;
		case 6:
			likert=2;
			pintro=0.834;
			break;
		case 7:
			likert=3;
			pintro=1;
			break;
		}
		
		if(likert==0)
		{
			pextro=0.5;
			pintro=0.5;
		
		}else if(likert<0){
			
			pintro=1-pextro;
			}
		    else
				{
					pextro=1-pintro;
				}
		
		vector[0]=pextro;
		vector[1]=pintro;
		return vector;
	}
	
public static String Evaluar_Pregunta_ExtravertionVsIntravertion(ArrayList<double[]> ListaPorc){ //Recibe una lista 
		double totalpextro=0, totalpintro=0;            //con todos los porcentajes, los suma y compara
		double vector[]=new double[2];                  //Cada pregunta debe guardar sus porcentajes
		                                                //En una lista global de esa categoria (total 4 listas)
		for (int i=0; i<ListaPorc.size();i++ ) {
		   vector=ListaPorc.get(i);
		   totalpextro=totalpextro+vector[0];
		   totalpintro=totalpintro+vector[1];
		}

			if (totalpextro>totalpintro)
				return "Extravertion";

		return "Introvertion";

}

/////////////////////////// Thinking and Feeling ///////////////////////////////////////

public static double[] Calcular_Percent_ThinkingVsFeeling(int slidervalue){ //Ingresar como parametro el valor del slide (1-7) -> slider.getValue()
	int likert=0;
	double pthink=0;
	double pfeel=0;
	double vector[]=new double[2];
	
	switch (slidervalue){
	case 1:
		likert=-3;
		pthink=1;
		break;
	case 2:
		likert=-2;
		pthink=0.834;
		break;
	case 3:
		likert=-1;
		pthink=0.667;
		break;
	case 4:
		likert=0;
		break;
	case 5:
		likert=1;
		pfeel=0.667;
		break;
	case 6:
		likert=2;
		pfeel=0.834;
		break;
	case 7:
		likert=3;
		pfeel=1;
		break;
	}
	
	if(likert==0)
	{
		pthink=0.5;
		pfeel=0.5;
	
	}else if(likert<0){
		
		pfeel=1-pthink;
		}
	    else
			{
				pthink=1-pfeel;
			}
	
	vector[0]=pthink;
	vector[1]=pfeel;
	return vector;
}

public static String Evaluar_Pregunta_ThinkingVsFeeling(ArrayList<double[]> ListaPorc){ //Recibe una lista 
	double totalpthink=0, totalpfeel=0;            //con todos los porcentajes, los suma y compara
	double vector[]=new double[2];                  //Cada pregunta debe guardar sus porcentajes
	                                                //En una lista global de esa categoria (total 4 listas)
	for (int i=0; i<ListaPorc.size();i++ ) {
	   vector=ListaPorc.get(i);
	   totalpthink=totalpthink+vector[0];
	   totalpfeel=totalpfeel+vector[1];
	}

		if (totalpthink>totalpfeel)
			return "Thinking";

	return "Feeling";

}

//////////////////////////////// Sensing Vs Intuition////////////////////////////

public static double[] Calcular_Percent_SensingVsIntuition(int slidervalue){ //Ingresar como parametro el valor del slide (1-7) -> slider.getValue()
	int likert=0;
	double pintu=0;
	double psense=0;
	double vector[]=new double[2];
	
	switch (slidervalue){
	case 1:
		likert=-3;
		psense=1;
		break;
	case 2:
		likert=-2;
		psense=0.834;
		break;
	case 3:
		likert=-1;
		psense=0.667;
		break;
	case 4:
		likert=0;
		break;
	case 5:
		likert=1;
		pintu=0.667;
		break;
	case 6:
		likert=2;
		pintu=0.834;
		break;
	case 7:
		likert=3;
		pintu=1;
		break;
	}
	
	if(likert==0)
	{
		psense=0.5;
		pintu=0.5;
	
	}else if(likert<0){
		
		pintu=1-psense;
		}
	    else
			{
				psense=1-pintu;
			}
	
	vector[0]=psense;
	vector[1]=pintu;
	return vector;
}

public static String Evaluar_Pregunta_SensingVsIntuition(ArrayList<double[]> ListaPorc){ //Recibe una lista 
	double totalpsense=0, totalpintu=0;            //con todos los porcentajes, los suma y compara
	double vector[]=new double[2];                  //Cada pregunta debe guardar sus porcentajes
	                                                //En una lista global de esa categoria (total 4 listas)
	for (int i=0; i<ListaPorc.size();i++ ) {
	   vector=ListaPorc.get(i);
	   totalpsense=totalpsense+vector[0];
	   totalpintu=totalpintu+vector[1];
	}

		if (totalpsense>totalpintu)
			return "Sensing";

	return "Intuition";

}


////////////////////////////////////////// Judging Vs Perceiving //////////////////////

public static double[] Calcular_Percent_JudgingVsPerceiving(int slidervalue){ //Ingresar como parametro el valor del slide (1-7) -> slider.getValue()
	int likert=0;
	double pperce=0;
	double pjudge=0;
	double vector[]=new double[2];
	
	switch (slidervalue){
	case 1:
		likert=-3;
		pjudge=1;
		break;
	case 2:
		likert=-2;
		pjudge=0.834;
		break;
	case 3:
		likert=-1;
		pjudge=0.667;
		break;
	case 4:
		likert=0;
		break;
	case 5:
		likert=1;
		pperce=0.667;
		break;
	case 6:
		likert=2;
		pperce=0.834;
		break;
	case 7:
		likert=3;
		pperce=1;
		break;
	}
	
	if(likert==0)
	{
		pjudge=0.5;
		pperce=0.5;
	
	}else if(likert<0){
		
		pperce=1-pjudge;
		}
	    else
			{
				pjudge=1-pperce;
			}
	
	vector[0]=pjudge;
	vector[1]=pperce;
	return vector;
}

public static String Evaluar_Pregunta_JudgingVsPerceiving(ArrayList<double[]> ListaPorc){ //Recibe una lista 
	double totalpjudge=0, totalpperce=0;            //con todos los porcentajes, los suma y compara
	double vector[]=new double[2];                  //Cada pregunta debe guardar sus porcentajes
	                                                //En una lista global de esa categoria (total 4 listas)
	for (int i=0; i<ListaPorc.size();i++ ) {
	   vector=ListaPorc.get(i);
	   totalpjudge=totalpjudge+vector[0];
	   totalpperce=totalpperce+vector[1];
	}

		if (totalpjudge>totalpperce)
			return "Judging";

	return "Perceiving";

}




	
	
}
