package ASMMMM.java;

	public class Student {
	private String sid;
	private String name;
	private String age;
	private String Address;
	public Student() {
	super();
	
	}
	public Student(String sid, String name, String age, String address) {
	super();
	this.sid = sid;
	this.name = name;
	this.age = age;
	Address = address;
	}
	//returns the value of the attribute
	public String getSid() {
	return sid;
	}
	//take a parameter sid and assign it to this.sid variable
	public void setSid(String sid) {
	this.sid = sid;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getAge() {
	return age;
	}
	public void setAge(String age) {
	this.age = age;
	}
	public String getAddress() {
	return Address;
	}
	public void setAddress(String address) {
	Address = address;
	}
	}
