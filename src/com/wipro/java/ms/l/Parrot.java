package com.wipro.java.ms.l;

public class Parrot implements Fly {
    @Override
    public void fly() {
        System.out.println("parrot is flying.");
    }

	@Override
	public void eat() {
		 System.out.println("Parrot eating...");
		
	}
}
