package edu.kh.oop.basic;

// 클래스 : 객체가 되었을 때 가지고 있을 속성, 기능을 정의(작성)한 문서
public class SDE {
	
	// 객체가 가지고 있는 속성
	String name = "서도은";
	int age = 28;
	String birthday = "19950501";
	private String password = "1234";
	
	// private : 해당 클래스 내부에서 접근 가능하다라느 뜻
	
	// 객체가 가지고 있는 기능
	public void study() {
		System.out.println("자바 공부를 열심히 할 수 있음.");
	}
	
	
	public void plus(int num1, int num2) {
		System.out.println("합 : " + (num1 + num2));
	}
	
	//public : 같은 프로젝트 내부
	public void showPassword() {
		System.out.println("비밀번호 : ***" + password + "***");
	}
}
