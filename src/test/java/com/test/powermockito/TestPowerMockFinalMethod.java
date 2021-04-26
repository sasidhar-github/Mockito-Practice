package com.test.powermockito;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.powermockito.ClassWithFinalMethods;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ClassWithFinalMethods.class)
public class TestPowerMockFinalMethod
{
	@Test
	public void testClassWithFinalMethod() throws Exception {

		String message = "Hello PowerMockito"; 
		ClassWithFinalMethods mockObject = PowerMockito.mock(ClassWithFinalMethods.class); 
		PowerMockito.whenNew(ClassWithFinalMethods.class).withNoArguments().thenReturn(mockObject); 
		PowerMockito.verifyNew(ClassWithFinalMethods.class).withNoArguments(); 
		ClassWithFinalMethods object = new ClassWithFinalMethods(); 
		PowerMockito.when(object.finalMethodMessage(message)).thenReturn("test final powermock"); 
		String helloPowerMockito = object.finalMethodMessage(message); //7
		Mockito.verify(object).finalMethodMessage(message); //8
		Assert.assertEquals("test final powermock", helloPowerMockito); //9
	}
}

