package com.factoryBeans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class method implements InitializingBean,DisposableBean{
	static {
		System.out.println("bean loading");
	}
	public method()
	{
		System.out.println("Bean instition");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("connection lost");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("data goes into the database");
		
	}
	public void uti()
	{
		System.out.println("i am an custom utility method");
	}
	

}
