package com.jhf.ioc;
//tell the spring core controller to creat a bean from this class ..  component mean
//to give meta data ..
//annotation to build from this class a bean ..
//I can add this  //@Controller this the meta data
//component is a dad for 3 children that relate to layers of spring (web , server, repositry)  for each web hava a @controler , the service is @service and the  repositry @ repositry
//that help the spring core container .. I mean the application have parts :)
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emplBean")
public class Employee {
	
	@Value("Samia")
	// I put $samia  to change the name as I want (put on proprities),, or get set to change in run time
	String name;
	@Value("111")
	
	
	int emplID;
	
	@Autowired	Adress adress; 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmplID() {
		return emplID;
	}
	public void setEmplID(int emplID) {
		this.emplID = emplID;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	

	public void ShowDetails() {
		System.out.print( "Employee [name=" + name + ", emplID=" + emplID + ", adress=" + adress + "]"); 
		
	}
	
	// after the annotation there is no need for the constructor
	
	//int backsense ( wraa2 kawales) the annotation is a function signiture ,,
	
	//  for auto wired annotation //this is not primitive and i want to build dependices between them each ot employee have an adress must ! ,, every employee need an adress this is a dependency
		//there is a relationhsup betrween them for that reson there is dependices ,,,
		// I used autoWired to build the employee then adress ,, and heek I build two beans ..

}
