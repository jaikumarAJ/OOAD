package com.javafusion.creational;

import com.javafusion.creational.factory.CommercialPlan;
import com.javafusion.creational.factory.DomesticPlan;
import com.javafusion.creational.factory.Plan;

public class FactoryClass {
	public FactoryClass() {
	}

	/*
	 * - There is not direct dependency on DomesticPlan and CommercialPlan classes,
	 * object will be created at run time. in case if we need to make any change
	 * - we just need to make change into factory class and the implementation class will remain unchanged.
	 * - More classes can be added without affecting code of implementation class
	 */
	public Plan getFactoryObjectPlan(String plan) {
		if (plan == null) {
			return null;
		}

		if (plan.equals("dom")) {
			return new DomesticPlan();
		} else if (plan.equals("com")) {
			return new CommercialPlan();
		}

		return null;
	}

}
