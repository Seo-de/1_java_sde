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
					
					System.out.printf("%d * %d = %d\n", x, i, x*i);
				}
			
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
		
		for(int x=1; x<=input; x++) {
			
			for(int i=1; i<=x; i++) {
				
				System.out.print("*");
			}System.out.println();
		}
			
	

	}
	public void practice10() {
		
	}
	public void practice11() {
		
	}
	public void practice12() {
		
	}
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int count=0;
		
		for(int i=1; i<=input; i++) {
			if(i % 2 ==0 || i % 3 == 0) {
				System.out.print (i+" ");
				if(i % 6 == 0) {
					count ++;
				}

			}else {
				
			}
		}System.out.println("\ncount : " + count);
	
	}
	

}
