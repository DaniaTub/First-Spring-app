package com.jhf.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Adress {
	@Value("Haifa")
	String city;
	
	@Value("Central")
	String state;
	
	@Value("Palestine")
	String country;
	
	
	
	
	public void showAdress() {
		System.out.print("Adress [city=" + city + ", state=" + state + ", country=" + country + "]");
	}
	
	
	
	
	

}
