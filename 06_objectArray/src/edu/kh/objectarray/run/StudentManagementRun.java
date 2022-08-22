package edu.kh.objectarray.run;

import edu.kh.objectarray.view.StudentManagementView;

// 실행용 클래스
public class StudentManagementRun {
	public static void main(String[] args) {
		
//		StudentManagementView view = new StudentManagementView();
//		view.displayMenu(); // 한번만 쓸거면 이렇게 변수를 만드는게 아까운거래 4바이트 낭비래
		
		new StudentManagementView().displayMenu();
		// 객체 생성 -> 참조할 주소 반환 -> 바로 메서드 호출
		// == 객체 1회성 사용
		
		// ** heap 영역에 생성된 객체를
		//    어떤 참조 변수도 참조하지 않으면 
		// GC(Garbage Collector)에 의해서 Heap 영여겡서 지워지게 된다!!
		// -> Jave 특징 중 자동 메모리 관리
		
		
	}

}
