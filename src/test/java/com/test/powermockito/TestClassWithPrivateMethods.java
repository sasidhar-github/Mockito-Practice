package com.test.powermockito;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import com.powermockito.ClassWithPrivateMethods;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ClassWithPrivateMethods.class)
public class TestClassWithPrivateMethods {

	@Test
	public void testClassWithPrivateMethod() throws Exception {
 
	    String message = "Hello PowerMockito";
	    String expectation = "Expectation";
 
	    ClassWithPrivateMethods mock = PowerMockito.spy(new ClassWithPrivateMethods());
	    PowerMockito.doReturn(expectation).when(mock, "privateMethodMessage", message);
 
	    String actual = mock.privateCall(message);
	    Assert.assertEquals(expectation, actual);
	}
}
