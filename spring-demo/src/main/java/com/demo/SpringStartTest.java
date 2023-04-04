package com.demo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStartTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
		UserDemo u= (UserDemo) applicationContext.getBean("userDemo");
		System.out.println(u.getClass().toString());
		System.out.println("11");
	}
}
