package com.cnn.regression1;

import org.testng.Assert;

public class TestingEnum {
	
	
	public static void main(String[] args) {
		
		
		for(AllMyPageTitle a:AllMyPageTitle.values()) {

			System.out.println(a.getTitle());
			
		}
		
	}
	

}