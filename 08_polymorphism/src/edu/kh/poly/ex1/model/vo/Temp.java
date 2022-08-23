package edu.kh.poly.ex1.model.vo;


// toString() 오버라이딩 확인용 임시 클래스
public class Temp {
	public static void main(String[] args) {
		Car c = new Car(4,4,"경유");
		System.out.println(c);// 그냥 c만 넣어도 되고, c.toString()을 써도 돼
	}

}
