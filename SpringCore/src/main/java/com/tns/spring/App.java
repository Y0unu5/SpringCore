package com.tns.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Student s = (Student) c.getBean("student1");
		System.out.println(s);
		Student s1 = (Student) c.getBean("student2");
		System.out.println(s1);

	}
}
