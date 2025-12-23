package com.exception;

public class checkedException {

	public static void main(String[] args) {
		ApplyForLice al=new ApplyForLice(1,"java");
		try {
		al.applyForLicence(23);
		}
		catch (AgeException e) {
			// TODO: handle exception
			System.out.println("not applicable");
		}

	}

}

class AgeException extends Exception{
	int age;

	public AgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeException(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}
class ApplyForLice{
	int id;
	String name;
	public ApplyForLice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApplyForLice(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void applyForLicence(int age) throws AgeException{
		if(age <16) {
			AgeException ae=new AgeException(age);
		    throw ae;
		}
		System.out.println("Able to apply");
	}
	
}
