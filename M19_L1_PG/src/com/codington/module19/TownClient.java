package com.codington.module19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Main class
public class TownClient {

	public static void main(String[] args) {

		ApplicationContext context = null;
		//TODO 1.Create an instance of ClassPathXmlApplicationContext and assign it to the ApplicationContext interface reference "context".

		//TODO 2. Use ApplicationContext's getBean() method  to retrieve the town bean from the IoC container.

		//TODO 3. Invoke Town class method diplayTownInfo() to display the town details.
		((ClassPathXmlApplicationContext) context).close();
	}

}
