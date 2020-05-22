package com.smoke;

import org.testng.annotations.Test;

import com.generic.DriverScript;

public class ApplicationStatus {

	@Test
	public void setup() {	
		
		new DriverScript().getdriver("URL");
		
		
	

	}

}
