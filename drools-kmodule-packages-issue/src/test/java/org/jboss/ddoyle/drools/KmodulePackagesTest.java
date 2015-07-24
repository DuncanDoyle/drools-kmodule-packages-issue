package org.jboss.ddoyle.drools;

import org.jboss.ddoyle.drools.model.SimpleEvent;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class KmodulePackagesTest {

	@Test
	public void test() {
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kieContainer = kieServices.newKieClasspathContainer();
		KieSession kieSession = kieContainer.newKieBase(null).newKieSession();
		
		SimpleEvent event = new SimpleEvent("bla");
		kieSession.insert(event);
		
		kieSession.fireAllRules();
		kieSession.dispose();
	}

}
