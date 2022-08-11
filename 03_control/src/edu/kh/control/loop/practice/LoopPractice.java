package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			for(int i=1; i<=num; i++) {
				System.out.print(i+" ");
			}
		}
		
	}
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			for(int i=input; i>=1; i--) {
				System.out.print(i + " ");
			}
		}
		
	}
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=input; i++) {
			System.out.print(i +" + ");
			sum += i;
			
		}
		
	}
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1<1 || num2<1) {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}else if (num1 > num2){
			for (int i=num2; i<=num1; i++) {
				System.out.print(i+" ");
			}
				}else {
				for (int i=num1; i<= num2; i++) {
					System.out.print(i+" ");
			}
			
		}

//		다른방법1(처음 if 이후에)
//		else {
//			
//			int start = num1;
//			int end = num2;
//		
//		if (num1>num2) { // 먼저 입력한 숫자가 크면 start / end를 바꿈
//			start = num2;
//			end = num1;
//		}
//			
//			for(int i = start; i<=end; i++) {
//				System.out.print(i+" ");
//			}
//		}

//		다른방법2
//		else { // 둘 다 1 미만이 아니다
//			if(num1>num2) {
//				// 두 변수의 값 교환
//				int temp = num1; // temp 임시저장/ ex) temp : 8 / num1:8/num2:4
//				num1 = num2; //ex) temp : 8 / num1:4/num2:4
//				
//				num2 = num1; //ex) temp : 8 / num1:4/num2:8
//			}
//		}
		
		
	}
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		System.out.println("==== " +input+"단 ====");
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", input, i, input*i);
		}
		
	}
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		
		if(input<2 || input>9) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}else {
			for(int x=input; x<=9; x++) {
				System.out.println("==== "+x+"단 ====");
				for(int i=1; i<=9; i++) {
					
					System.out.printf("%d X %d = %2d\n", x, i, x*i);
				}
				System.out.println(); // 단 사이 줄 바꿈
			}
		}
		
	}
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x=1; x<=input; x++) {
			for(int i=1; i<=x; i++) {
				System.out.print("*");
			} System.out.println();
		}
		
	}
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x=input; x>=1; x--) {
			for(int i=x; i>=1; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
			
			for(int i=1; i<=input; i++) {
				for(int x=input; x>0; x--) {
					if(i<x) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}	
				}
				System.out.println();
		}
			
			//for문 이용 방법
//			for(int row=1; row<=input; row++) {
//				for(int i=input-1; i>=row; i--) {
//					System.out.print("");
//				}
//				
//				for(int col=1; col <= row; col++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
			
			// if문 이용 방법
//			for(int col=1; col<=input; col++) {
//				if(col<=input-row) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//				System.out.println();
//			}

	}
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=0; i<input; i++) {
			for(int x=0; x<i+1; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=0; i<input-1; i++) {
			for(int x=0; x<input-1-i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 다른 방법 (삼각형을 위 아래로 쪼갠데)
		// 위쪽 삼각형
//		for(int row=1; row<=input; row++) {
//			for(int col=1; col <= row; col++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//			
//		// 아래쪽 삼각형	
//		for(int row=input-1; row>=1; row--) {
//			for(int col=1; col <= row; col++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
	}
	// 9번의 응용문제
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=0; i<input;i++) {
			for(int x=1; x<input-i;x++) {
				System.out.print(" ");
			}
			for(int y=0; y<i*2+1; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// for문 이용 방법
//		for(int row=1; row<=input; row++) {
//			for(int i=input-1; i>=row; i--) {
//				System.out.print("");
//			}
//			
//			for(int col=1; col <= row*2-1; col++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// if문 이용 방법
//		for(int col=1; col<=input*2-1; col++) {
//			if(col<=input-row || input+row<=col) {
//				System.out.print(" ");
//			}else {
//				System.out.print("*");
//			}
//		System.out.println();
//		}
	
	}
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1; row <= input; row++) {
			for(int col = 1; col<=input; col++) {
				
				// 첫 번째 / 마지막 줄, 칸 일때만 * 출력
				if(row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count=0;
		
		for(int i=1; i<=input; i++) {
			if(i % 2 ==0 || i % 3 == 0) {
				System.out.print (i+" ");
				if(i % 2 ==0 && i % 3 == 0) {
					count ++;
				}
			}
		}System.out.println("\ncount : " + count);
	
	}
	

}
