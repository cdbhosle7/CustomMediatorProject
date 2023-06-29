package com.synoris;

import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;

public class HelloMediator extends AbstractMediator { 

	public boolean mediate(MessageContext context) { 
		System.out.println("Hello from custom mediator"); 
		return true;
	}
}
