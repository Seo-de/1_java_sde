package edu.kh.oop.field.ex2;

import edu.kh.oop.field.ex1.FieldTest;
// 다른 클래스를 현재 클래스에서 사용할 수 있도록 가져오기

public class FieldTest3 extends FieldTest{
// [접근제한자] [예약어] class 클래스명 [상속관계]
	
	public void ex() {
		
		FieldTest f = new FieldTest();
		
		System.out.println("다른 패키지");
		System.out.println( f.v1 ); // public
//		System.out.println( f.v2 ); // protected
		// -> 다른 패키지, 상속X
		// 상속받은게 아니라 새로 만든거라 f.v2가 인식이 안된거래
		
		System.out.println(v2);
		// int edu.kh.oop.field.ex1.FieldTest.v2
		// 상속 관계에선 protected 직접 접근 가능
		
//		System.out.println( f.v3 ); // default
		// -> 다른 패키지
	}

}
