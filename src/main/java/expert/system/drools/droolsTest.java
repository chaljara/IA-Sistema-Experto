package expert.system.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import expert.system.cars.InfoResult;
import expert.system.cars.Personality;

public class droolsTest {
	
	public static InfoResult recommendACarByPersonality(Personality personality){
		InfoResult info = null;
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rule");
			FactHandle fact1;
			
			info = new InfoResult(personality);
			
			fact1 = kSession.insert(info);
			kSession.fireAllRules();

			return info;
			
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return info;
		
	}
}
