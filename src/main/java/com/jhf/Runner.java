package com.jhf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jhf.ioc.Employee;
//import com.jhf.ioc.Adress;


@Configuration
@ComponentScan({"com.jhf.ioc"})                           //// to build tha meta data .. 

public class Runner {

	public static void main(String[] args) {
		
		//Build Spring core Contianern..
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Runner.class);
	
		Employee empl=(Employee) context.getBean("emplBean"); //The spring core container 
		 empl.ShowDetails(); //the spring will make the address
		
	}
	 
	
}
// for mapping we use component scan I give it the folder to search the component
//if I dont want to make beans we dont need to add comonent scan  ..

//AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Runner.class);
// the place where I put the beans is context
//this is instance .. 
// Employee empl =new  /// I will not make the new because the inversion of control ..
//to make beans by spring , without new