package com.tns.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("com/tns/spring/constructor/CIConfig.xml");
		Person p = (Person) c.getBean("person");
		System.out.println(p);
		
		Addition a=(Addition) c.getBean("add");
		System.out.println(a);
	}

}
