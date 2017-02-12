package com.house.drools;

import java.util.ArrayList;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.house.UI.UI;
import com.house.cars.InfoResult;
import com.house.cars.Personality.MyersBriggsType;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {
	
	public static ArrayList<InfoResult> recommendACarByPersonality(ArrayList<MyersBriggsType> selectedListMB){
		ArrayList<InfoResult> infoList = new ArrayList<InfoResult>(selectedListMB.size());
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");
			kSession.insert(UI.carList);
			
			for(MyersBriggsType mbt : selectedListMB){
				InfoResult info = new InfoResult(mbt);
				kSession.insert(info);
				kSession.fireAllRules();
				infoList.add(info);
			}
			
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return infoList;
		
	}
}
