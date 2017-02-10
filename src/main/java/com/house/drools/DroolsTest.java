package com.house.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.house.UI.UI;
import com.house.cars.InfoResult;
import com.house.cars.Personality;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {
	
	
	public static InfoResult recommendACarByPersonality(Personality personality){
		InfoResult info = null;
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");
			
			info = new InfoResult(personality);
			
			kSession.insert(info);
			kSession.insert(UI.carList);
			kSession.fireAllRules();

			return info;
			
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return info;
		
	}
}
