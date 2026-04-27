package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WeekDayAnalyzer;

public class DependencyMgmtTest {

	public static void main(String[] args) {
		//create  IOC container
		try(AnnotationConfigApplicationContext  ctx=
				  new AnnotationConfigApplicationContext(AppConfig.class)){
			//get target spring bean class object
			WeekDayAnalyzer analyzer=ctx.getBean("wda",WeekDayAnalyzer.class);
			//invoke the b.method
			String msg=analyzer.showMessage("raja");
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
