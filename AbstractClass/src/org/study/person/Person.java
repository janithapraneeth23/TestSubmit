package org.study.person;

public abstract class Person implements IsAlive, LiveLife{
	
	public void speak() {
		System.out.println("Share Thoughts");
	}
	
	public abstract void eat();
	
	@Override
	public void breath() {
		System.out.println("Life is a journey");
	}
	
	@Override
	public void message() {
		System.out.println("Message");
	}
	
}
