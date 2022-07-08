package com.sachin.SpringMVCDemo;

public class Alien
{ 
	private int age;
	private Computer com;
	
//	 public Alien() {
//		System.out.println("Alien Object Created..");	
//	 }
	
	
	public Alien() {
		System.out.println("Alien object created!");
	}


	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Age Assigned");
		this.age = age;
	}
	
    public Computer getCom() {
		return com;
	}


	public void setCom(Computer com) {
		this.com = com;
	}


public void code() 
{
	System.out.println("Im Coding..");
	com.compile();
}
}
