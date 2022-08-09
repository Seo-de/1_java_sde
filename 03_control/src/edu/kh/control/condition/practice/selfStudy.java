package edu.kh.control.condition.practice;

import java.util.Scanner;

public class selfStudy {
	
	public void self() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double midTerm = sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		double finalTerm = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double report = sc.nextDouble();
		System.out.print("출석 점수 : ");
		double check = sc.nextDouble();
		
		System.out.println("================ 결과 ================");
		
		String result;
		
		midTerm *= 0.2;
		finalTerm *= 0.3;
		report *= 0.3;
		
		double sum = midTerm + finalTerm + report + check;
		
		if(check <= 14) {
			System.out.println("Fail [출석 횟수 부족 (" + (int)check + "/20)]"); 
		}else {
			System.out.println("중간 고사 점수(20) : " + midTerm);
			System.out.println("기말 고사 점수(20) : " + finalTerm);
			System.out.println("과   제 점수(20) : " + report);
			System.out.println("출   석 점수(20) : " + check);
			System.out.println("총 점 : " + sum);
		
		if (sum >= 70) {
			result = "Pass";
		}else {
			result = "Fail [점수미달]";
		}
		System.out.println(result);
		}
		
		
		
		
	}
	
	public void self2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double midTerm = sc.nextDouble();
		System.out.print("중간 고사 평가 비율 : ");
		double midValue = sc.nextDouble();
		
		System.out.print("기말 고사 점수 : ");
		double finalTerm = sc.nextDouble();
		System.out.print("기말 고사 평가 비율 : ");
		double finalValue = sc.nextDouble();
		
		System.out.print("과제 점수 : ");
		double report = sc.nextDouble();
		System.out.print("과제 평가 비율 : ");
		double reportValue = sc.nextDouble();
		
		System.out.print("출석 점수 : ");
		double check = sc.nextDouble();
		System.out.print("출석 평가 비율 : ");
		double checkValue = sc.nextDouble();
		
		System.out.println("================ 결과 ================");
		
		midTerm *= midValue;
		finalTerm *= finalValue;
		report *= reportValue;
		check *= checkValue;
		
		double sum = midTerm + finalTerm + report + check;
		
		if (check <= 20-(1-checkValue)) {
			
		}
		
	}
	
	
	
	

}
