//WeekDayAnalyzer.java
package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wda")
public class WeekDayAnalyzer {
	//@Autowired
	private   LocalDate  date;
	//@Autowired
	private   LocalTime time;
	
	public WeekDayAnalyzer() {
		System.out.println("WeekDayAnalyzer::0-param constructor");
	}
	
	@Autowired
	public   void   putDate(LocalDate date) {
		System.out.println("WeekDayAnalyzer.putDate()");
		this.date=date;
	}
	
	@Autowired
	public void  assignTime(LocalTime time) {
		System.out.println("WeekDayAnalyzer.assignTime()");
		this.time=time;
	}
	
	/*//@Autowired
	public WeekDayAnalyzer(LocalDate  date, LocalTime time) {
		System.out.println("WeekDayAnalyzer::2-param constructor");
		this.date=date;
		this.time=time;
	}*/
	
	
/*   @Autowired
	public  void setDate(LocalDate date) {
	   System.out.println("WeekDayAnalyzer.setDate()");
		this.date=date;
	}
   
   @Autowired
  	public  void setTime(LocalTime time) {
  	   System.out.println("WeekDayAnalyzer.setTime()");
  		this.time=time;
  	}*/
     
   
   
         //b.method
     public  String  showMessage(String user) {
    	 System.out.println("WeekDayAnalyzer.showMessage():::"+date+"..."+time);
    	 //get  current weekday number
    	 int wno=date.getDayOfWeek().getValue();
    	 //generate the message
    	 if(wno>=1  && wno<=5)
    		 return "Happy Working Day ::"+user;
    	 else
    		 return "Happy WeekEnd ::"+user;
     }
     
	

}
