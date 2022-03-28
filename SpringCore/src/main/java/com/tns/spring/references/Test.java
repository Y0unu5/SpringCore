package com.tns.spring.references;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext c = new ClassPathXmlApplicationContext("com/tns/spring/references/reference.xml");
		A temp = (A) c.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
	}

}
