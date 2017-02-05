package expert.system.cars;

import java.util.ArrayList;
import java.util.Iterator;

public class MultipleChoice {

	private ArrayList<String> Answers;
	
	//Recibe el valor del slider, devuelve un arreglo double, en index 0 el valor de extro y en index 1 el intro.
	
double[] Calcular_Percent_ExtroIntro(int slidervalue){ //Ingresar como parametro el valor del slide (1-7) -> slider.getValue()
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
	
String Evaluar_Pregunta(ArrayList<double[]> ListaPorc){ //Recibe una lista 
		double totalpextro=0, totalpintro=0;            //con todos los porcentajes, los suma y compara
		double vector[]=new double[2];                  //Cada pregunta debe guardar sus porcentajes
		                                                //En una lista global de esa categoria (total 4 listas)
		for (int i=0; i<ListaPorc.size();i++ ) {
		   vector=ListaPorc.get(i);
		   totalpextro=totalpextro+vector[0];
		   totalpintro=totalpintro+vector[1];
		}

			if (totalpextro>totalpintro)
				return "Extrovertido";

		return "Introvertido";

}
	
	
	
}
