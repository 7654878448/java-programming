package com.factoryBeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class launch {
	public static void main(String[]args)
	{
		ClassPathXmlApplicationContext cl=	new ClassPathXmlApplicationContext("getbean.xml");
		method  m1=(method)cl.getBean("met");
		m1.uti();
		
		cl.close();
	}

}
