package com.basic;

public class DependencyInjInCoreJava {
	
	int stdid;
	String stdname;
	Address adr;//ref of class
	

	public DependencyInjInCoreJava() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "DependencyInjInCoreJava [stdid=" + stdid + ", stdname=" + stdname + ", adr=" + adr + "]";
	}


	public DependencyInjInCoreJava(int stdid, String stdname, Address adr) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.adr = adr;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ds=new Address("mh","ind");
		DependencyInjInCoreJava di=new DependencyInjInCoreJava(12,"vikas",ds);
		System.out.println(di);

	}

}
class Address{
	String state;
	String country;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String state, String country) {
		super();
		this.state = state;
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", country=" + country + "]";
	}
	
}
