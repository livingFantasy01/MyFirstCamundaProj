package com.demo.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class DiscountElegibilityDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		Long age = (Long) execution.getVariable("age");

		int discount = 0;
		
		if(age < 25)
			discount = 10;
		else if(age >=25 && age < 35 )
			discount = 5;
		else
			discount = 1;
		System.out.println("Discount is : "+discount);	
		execution.setVariable("discount", discount);
			
			
		
		
	}

}
