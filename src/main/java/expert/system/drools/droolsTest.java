package expert.system.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import expert.system.cars.Personalities;
import expert.system.cars.CarSuggest;

public class droolsTest {

	public static final void main(String[] args){
		
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			//Get the session named kseesion-rule that we defined in kmodule.xml above.
			//Also by default the session returned is always stateful. 
			KieSession kSession = kContainer.newKieSession("ksession-rule");

			CarSuggest car = new CarSuggest("", Personalities.ENTREPRENEUR, null);

			FactHandle fact1;

			fact1 = kSession.insert(car);
			kSession.fireAllRules();

			System.out.println(car.getModelCar());

		} catch (Throwable t) {
			t.printStackTrace();
		}
		
	}
}
