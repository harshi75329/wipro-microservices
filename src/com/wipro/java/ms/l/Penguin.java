package com.wipro.java.ms.l;

public class Penguin implements Birds{

	@Override
	public void eat() {
		 System.out.println("Penguin eating...");
		
	}
    // No fly method, so no LSP violation
}
