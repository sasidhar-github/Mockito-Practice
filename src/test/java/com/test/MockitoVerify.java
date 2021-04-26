package com.test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.main.CalculatorService;
import com.main.MathApplication;

@RunWith(MockitoJUnitRunner.class)
public class MockitoVerify {

	@InjectMocks
	MathApplication mathApp;

	@Mock
	CalculatorService calService;


	@Test
	public void testAdd() {
		when(calService.add(10, 20)).thenReturn(30.0);
		Assert.assertEquals(mathApp.add(10.0, 20.0),30.0,0);
		verify(calService).add(10, 20);
		//verify(calService).add(10, 2);
		verify(calService,Mockito.times(1)).add(10, 20);
		//verify(calService,Mockito.times(2)).add(10, 20);	
		verify(calService, Mockito.never()).multiply(10.0,20.0);
		//verify(calService, Mockito.atLeastOnce()).subtract(20.0, 10.0);
	}

}
