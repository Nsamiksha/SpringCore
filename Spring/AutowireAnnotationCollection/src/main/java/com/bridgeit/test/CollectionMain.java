package com.bridgeit.test;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bridgeit.bean.MyCollection;

public class CollectionMain {
	public static void main(String[] args) {
		ApplicationContext context = null;
		context = new FileSystemXmlApplicationContext("src/main/java/com/bridgeit/cfgs/autowire.xml");
		MyCollection myCollection=(MyCollection)context.getBean("myCollection");
		System.out.println(myCollection);
	} 
} 

