package com.bridgeit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bridgeit.bean.Company;

public class CompanyInfo {
public static void main(String[] args) {
	ApplicationContext ctx = null;
	ctx = new FileSystemXmlApplicationContext("src/main/java/com/bridgeit/cfgs/bean.xml");
	
	Company company = (Company) ctx.getBean("company");
	company.show();
}
}
