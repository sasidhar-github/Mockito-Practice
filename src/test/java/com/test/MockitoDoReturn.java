package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.doReturn;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoDoReturn {

	@Mock
    private List<String> mockList;
 
    @Spy
    private List<String> spyList = new ArrayList<>();
    
	@Test
	public void testDoReturn()  {
		Properties prop = new Properties();
		Properties spy = Mockito.spy(prop);
		doReturn("propInvoked").when(spy).get("test");
		assertEquals("propInvoked", spy.get("test"));
	}
 
    @Test
    public void testMockList() {
        //by default, calling the methods of mock object will do nothing
        mockList.add("test");
        assertNull(mockList.get(0));
    }
 
    @Test
    public void testSpyList() {
        //spy object will call the real method when not stub
        spyList.add("test");
        assertEquals("test", spyList.get(0));
    }

}
