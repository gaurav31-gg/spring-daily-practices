//B.java
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("b1")
public class B {
	//@Autowired
	@SuppressWarnings("unused")
	private   A a;
	
	@Autowired
	public B(A a) {
		this.a=a;
		System.out.println("B:: 0-param constructor");
	}
	
	public String toString() {
		 return "from B";
	}

}
