package com.phc.es;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.phc.es.controller.ApiConroller;

@RunWith(MockitoJUnitRunner.class)
public class ApiConrollerTest {
	
	
	@InjectMocks
	private ApiConroller apiController;
	
	
	@Before
	public void setUp() {
		apiController=new ApiConroller();
	}
	
	@Test
	public void healthTest() {
		
		String status=apiController.health();
		assertEquals("UP", status);
		
	}
	
	
	@Test
	public void indexTest() {
		
		String status=apiController.index();
		assertEquals("Welcome to Azure Devops tutorial", status);
		
	}
	

}
