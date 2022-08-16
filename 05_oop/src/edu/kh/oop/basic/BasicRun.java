package edu.kh.oop.basic;

public class BasicRun {

	public static void main(String[] args) {
		
		SDE 서도은 = new SDE();
		// heap 영역에 SDE 클래스에 정의된 내용을 이용하여
		// SDE 객체를 생성(할당)
		
		// 객체가 가지고 있는 속성 출력
		System.out.println("이름 : " + 서도은.name);
		System.out.println("나이 : " + 서도은.age);
		System.out.println("생년월일 : " + 서도은.birthday);
		
		// System.out.println("비밀번호 : " + 서도은.password);
		
		
		// 기능 수행
		
		서도은.study();
		서도은.plus(50, 100);
		

	}

}
