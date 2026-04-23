package com.nt.main;

import java.time.LocalDate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyMgmtTest {

	public static void main(String[] args) {
		 
		//create  IOC container
		try(ClassPathXmlApplicationContext ctx=
				      new ClassPathXmlApplicationContext("applicationContext.xml")){
		//get spring bean class obj ref
			SeasonFinder finder=ctx.getBean("sf",SeasonFinder.class);
            //invoke the method
             String  msg=finder.showSeasonName();
             System.out.println(msg);
             
             System.out.println("--------------------");
             LocalDate   date=ctx.getBean("ldate",LocalDate.class);
             System.out.println(date);
           	}//try
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
