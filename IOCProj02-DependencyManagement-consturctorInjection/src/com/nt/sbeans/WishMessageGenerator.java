//WishMessageGenerator.java
package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	// HAS-A properties (Composition)
	 private  LocalTime  time;
	 private   LocalDate  date;
	 private   int  age;
	 
	 public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}
	 
	 //  parameterized constructor for constructor Injection (alt+shift+s,o)
	 public WishMessageGenerator(LocalTime time, LocalDate date, int age) {
		 System.out.println("WishMessageGenerator:: 3-param constru");
			this.time = time;
			this.date = date;
			this.age = age;
		 }
	 
	 public void setAge(int age) {
		 System.out.println("WishMessageGenerator.setAge()");
		 this.age=age;
	 }
   
	 //B.method
	 public  String  generateWishMessage(String user) {
		 System.out.println("WishMessageGenerator.generateWishMessage()::"+time+"...."+date+"...."+age);
		 // get current of the day
		 int  hour=time.getHour();
		 // generate the wish message
		 if(hour<12)
			 return "Good Morning:"+user;
		 else if(hour<16)
			 return "Good AfterNoon:"+user;
		 else if(hour<20)
			 return "Good Evening:"+user;
		 else
			 return  "Good Night :"+user;
	 }

	 
	 	 
}
