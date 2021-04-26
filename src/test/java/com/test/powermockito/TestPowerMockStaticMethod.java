package com.test.powermockito;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import com.powermockito.ClassWithStaticMethod;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ClassWithStaticMethod.class)
public class TestPowerMockStaticMethod {

	@Test
	public void testClassWithStaticMethod() {
 
	    String message = "Hello PowerMockito"; 
	    String expectation = "Expectation"; 
 
	    PowerMockito.mockStatic(ClassWithStaticMethod.class); 
	    PowerMockito.when(ClassWithStaticMethod.staticMethodMessage(message)).thenReturn(expectation); 
 
	    String actual = ClassWithStaticMethod.staticMethodMessage(message); 
	    Assert.assertEquals(expectation, actual); 
	}
}
