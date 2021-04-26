package com.powermockito;

public class ClassWithPrivateMethods {

	private String privateMethodMessage(String message) {
        return message;
    }

	 public String privateCall(String message) {
	        return privateMethodMessage(message);
	    }
}
