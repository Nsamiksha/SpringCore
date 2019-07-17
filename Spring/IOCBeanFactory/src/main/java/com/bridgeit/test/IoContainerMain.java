package com.bridgeit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.bridgeit.bean.Employee;

public class IoContainerMain {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		res=new FileSystemResource("src/main/java/com/bridgeit/cfgs/bean1.xml");
		
		factory=new XmlBeanFactory(res);
		

		Employee employee = (Employee) factory.getBean("studentbean");

		employee.show();
		

	}
}