package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		String result;
		
		if(input > 0) {
			switch(input%2) { // 나는 switch로 했는데 중첩 if문을 써도 좋아
		case 0 : result = "짝수입니다."; break;
		default : result = "홀수입니다."; 
		}}else {
			result = "양수만 입력해주세요.";
		}
		
//      알려주신 방법		
//		if(input <= 0) {
//			result = "양수만 입력해주세요.";
//		}else if(input % 2 == 0) {
//			result ="짝수 입니다.";
//		}else {
//			result = "홀수 입니다.";
//		}
		
		System.out.println(result);
		
	}
	
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 :");
		int score1 = sc.nextInt(); // kor
		
		System.out.print("수학점수 : ");
		int score2 = sc.nextInt(); // math
		
		System.out.print("영어점수 : ");
		int score3 = sc.nextInt(); //eng
		
		int sum = score1 + score2 + score3;
		double avg = sum/3.0; // 뒤에 계산한것도 double형식으로 바꿔주자
		
		if(score1 >= 40 && score2 >= 40 && score3 >= 40 && avg >= 60) {
			System.out.println("국어 : " + score1);
			System.out.println("수학 : " + score2);
			System.out.println("영어 : " + score3);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			System.out.printf("%d월은 31일까지 있습니다.", month); break; // println(month + "월은 31일까지 있습니다.")로 해도 깔끔
		case 2 : System.out.printf("%d월은 28일까지 있습니다.", month); break;
		case 4 : case 6 :  case 9 : case 11 : 
			System.out.printf("%d월은 30일까지 있습니다.", month); break;
		default : System.out.printf("%d월은 잘못 입력된 달입니다.", month);
		}
		
		
	}
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		String result;
		
		System.out.print("키(m)를 입력해 주세요 : \n");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : \n");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		
		if(BMI < 18.5) {
			result = "저체중";
		}else if(BMI < 23) {
			result = "정상체중";
		}else if(BMI < 25) {
			result = "과체중";
		}else if(BMI < 30) {
			result = "비만";
		}else {
			result = "고도 비만";
		}
		System.out.println("BMI 지수 : " + BMI);
		System.out.println(result);
		
		
	}
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		// 변수의 장점 : 재사용성
		
		System.out.print("중간 고사 점수 : ");
		int mtest = sc.nextInt(); 
		//double midTerm 앞에 double을 붙여주면 자동형변환해줘
		// int로 입력받아도 앞에 double로 자동 형변환됨.
		System.out.print("기말 고사 점수 : ");
		int ftest = sc.nextInt(); //double finalTerm
		System.out.print("과제 점수 : ");
		int homework = sc.nextInt(); //double report
		System.out.print("출석 횟수 : ");
		int check = sc.nextInt(); //double attendance
		
		// 각각의 점수를 비율에 맞게 변경
		// 복합대입 연산자 사용하면 더 간단히 코드를 바꿀 수 있어.
		// ex) midTerm *= 0.2; 이런식으로 바꿔줄 수 있지.
		
		System.out.println("============= 결과 =============");
		
		double mscore = (double)mtest/100*20;
		double fscore = (double)ftest/100*30;
		double hscore = (double)homework/100*30;
		
//		double sum = mscore + fscore + hscore + check;
		
//		내가 한 거
//		System.out.println("중간 고사 점수(20) : " + mscore);
//		System.out.println("기말 고사 점수(30) : " + fscore);
//		System.out.println("과제 점수(30) : " + hscore);
//		System.out.println("출석 점수(20) : " + check);
//		System.out.println("총점 : " + sum);
//		
//		if(sum >= 70) {
//			System.out.println("Pass");
//		}else if(check < 14) {
//			System.out.printf("Fail [출석 횟수 부족 (%d / 20)]", check);
//		}
//		else {
//			System.out.println("Fail [점수미달]");
//		}
		
		if(check <= 14 ) { // 혹은 범위를 <= 20 * (1-0.3)으로 설정해
			System.out.println("Fail [출석 횟수 부족 (" + (int)check + "/20)]");
			                                         // 소수점 버림 처리
		}else {
			System.out.printf("중간 고사 점수(20) : %0.1f \n" , mscore);
			System.out.printf("기말 고사 점수(30) : %0.1f \n" , fscore);
			System.out.printf("과제 점수(30) : %0.1f \n" , hscore);
			System.out.printf("출석 점수(20) : %0.1f \n" , check);
			
			double sum = mscore + fscore + hscore + check;
			
			System.out.printf("총점 : %.1f\n" ,sum);
			
			if(sum >= 70.0) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		}
		
		
	}

}
