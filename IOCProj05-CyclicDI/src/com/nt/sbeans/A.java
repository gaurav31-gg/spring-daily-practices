//A.java
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("a1")
public class A {
    //@Autowired
	@SuppressWarnings("unused")
	private  B b;
    
	@Autowired
    public A(B b) {
    	this.b=b;
		System.out.println("A::0-param constructor");
	}
    
    //toString()
    public String toString() {
    	 return " from A....";
    }
    
}
