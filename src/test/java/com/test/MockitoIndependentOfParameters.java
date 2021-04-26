package com.test;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoIndependentOfParameters {

	@Test
	public void testReturnValueInDependentOnMethodParameter()  {
	        @SuppressWarnings("unchecked")
			Comparable<Integer> c= Mockito.mock(Comparable.class);
	        when(c.compareTo(anyInt())).thenReturn(-1);
	        //assert
	        Assert.assertEquals(-1, c.compareTo(9));
	}

}
