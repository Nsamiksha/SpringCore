package com.bridgeit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bridgeit.bean.Airtel;

public class Mobile {
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		ctx = new FileSystemXmlApplicationContext("src/main/java/com/bridgeit/cfgs/bean.xml");
Airtel airtel = (Airtel) ctx.getBean("Airtel");
airtel.calling();
		
	}
}
