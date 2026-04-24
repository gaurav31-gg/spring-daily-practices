package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.A;
import com.nt.sbeans.B;

public class CircularDITest {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext  ctx=
				   new AnnotationConfigApplicationContext(AppConfig.class)){
			//get Spring Bean class obj ref
			 A  a1=ctx.getBean("a1",A.class);
			 System.out.println(a1);
			 System.out.println("---------------");
			   B  b1=ctx.getBean("b1",B.class);
			 System.out.println(b1);
			 
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
