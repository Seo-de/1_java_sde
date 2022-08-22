package edu.kh.inheritance.model.vo;

public class Person {
	
	private String name;
	private int age;
	
	// 기본 생성자 만드는 단축키
	// ctrl + space bar + enter 
	public Person() {

	}
	
	
	// 매게 변수 만드는 단축키
	// alt + s -> o 또는 alt + shift + s -> o 
	// Generate Constructor using Fiels...
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	

}
