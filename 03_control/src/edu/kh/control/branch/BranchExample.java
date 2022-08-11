package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	
	public void ex1() {
		
	// break문 : 가장 가까운 반복문을 빠져 나가는 구문
	
	for(int i=1; i<=10000; i++) {
		System.out.println(i);
		
		// i가 20일 때 반복 종료
		
		if(i==20) {
			break;
		}
	}
	System.out.println("----------------");
	
	for(int row=1 ; row <=5; row ++) {
		for(int col =1; col <=30; col++) {
			System.out.printf("(%d, %d) ", row, col);
			
			if(col == 3) {
				break;
			}
		}
			System.out.println();
			
			if(row==3) {
				break;
			}
		}
	}	
	public void ex2() {
		
		// 0이 입력될 때 까지의 입력된 정수의 합 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while( true ) { // 조건식에 강제로 true 작성 == 무한 반복
			System.out.println("정수 입력 : ");
			int input = sc.nextInt();
			
			if(input == 0) {
				break;
			}
			
			sum += input; // 누적
		}
		System.out.println("합계 : " + sum);
		// Unreachable code : 도달할 수 없는 코드 -> 해석이 될 수 없다
	}
	

	public void ex3() {
		
		// "exit@" 문자열이 입력될 때 까지 문자열 누적하기
		
		Scanner sc = new Scanner(System.in);
		
		String str = ""; // 빈 문자열
		
		System.out.println("--- 문자열 입력 (종료 시 exit@ 입력) --- ");
		while(true) {
			
			String input = sc.nextLine(); // 한 줄 입력
			
			// 비교연산자는 보통 기본 자료형의 값 비교만 가능하다!
			// -> String은 기본 자료형 X, 참조형 0
			
			// -> 참조형은 A.equals(B) 값을 비교할 수 있다!
			
			// A.equals(B)    A == B
			if(input.equals("exit@")) {
				
				break;
			}
			str += input + "\n"; // 누적하면서 줄 바꿈
		}
		
		System.out.println(str);

	}
	
	public void ex4() {
		
		// continue : 다음 반복으로 넘어감
		
		// 1부터 30까진 5의 배수뤃 제외하고 출력 (continue 사용)
		
		for(int i=1; i<=30; i++) {
			if(i%5 == 0)
				continue; // 다음 반복으로 이동(증감식 부분으로 이동)
				System.out.println(i);
			}
		
	}
	public void ex5() {
		
			for(int i=1; i<=100; i++) {
				if(i%5 == 0) {
					if(i==40) {
						System.out.println(i);
						break;
					}
					continue;
				}
	
				System.out.println(i);
				}
					
				
			}
	
	public void upDownGame() {
		
		// 프로그램 시작 시 1~50 사이의 임의의 수 (난수)를 하나 생성하여
		// 사용자가 몇회 만에 맞추는지 카운트
		
		// 만약 틀렸을 경우 난수가 입력한 수 보다 크면 UP / 작으면 DOWN 출력
		
		// (임의의수 30일 경우)
		
		// ex) 1번 입력 :10
		// UP
		// 2번 입력 : 40
		// DOWN
		// 3번 입력 : 30
		// 정답 입니다!( 총 입력 횟수 : 3회)
		
		// 난수 생성 : Math.random() -> Java에서 제공해주는 난수 생성 방법
		// 0.0 <= x < 1.0            0.0 이상 1.0미만의 난수를 생성(double)
		int ran = (int)(Math.random()*50+1);
		// 1.1 <= x < 1.0
		// 0.0 <= x < 50.0
		// 1.0 <= x < 51.0
		
		// 1 <= (int)(x*50+1) < 51 ------>1~50
		
		Scanner sc = new Scanner(System.in);
		
		int count=1;
		
		while(true) {
			
			System.out.println(count + "번 입력 : ");
			int num = sc.nextInt();
			
			// 난수 == 입력 값
			// 난수 > 입력 값
			// 난수 < 입력 값
			
			if(ran == num) {
				System.out.println("정답 입니다! ( 총 입력 횟수 : "+count+"회 )");
				break;
			}else if(ran > num) {
				System.out.println("UP");
			}else {
				System.out.println("DOWN");
			}
			count++;
		}
	}
	
	
	public void rpsGame() { //가위바위보게임
		
		   // 가위 바위 보 게임
		   
		   // 몇판? : 3
		   
		   // 1번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  가위
		   // 컴퓨터는 [보]를 선택했습니다.
		   // 플레이어 승!
		   // 현재 기록 : 1승 0무 0패
		   
		   // 2번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  보
		   // 컴퓨터는 [보]를 선택했습니다.
		   // 비겼습니다.
		   // 현재 기록 : 1승 1무 0패
		   
		   // 3번째 게임
		   // 가위/바위/보 중 하나를 입력 해주세요 :  가위
		   // 컴퓨터는 [바위]를 선택했습니다.
		   // 졌습니다ㅠㅠ
		   // 현재 기록 : 1승 1무 1패
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 판?");
		int game = sc.nextInt();
		
		
		for(int i=0; i<game; i++) {
			System.out.print("가위/바위/보 중 하나를 입력 해주세요 : ");
			String player = sc.next();
			
		
			int rps = (int)(Math.random()*3);
			
			System.out.println("컴퓨터는 [" + rps + "]를 선택했습니다.");
			
			if(player.equals("가위")) {
				if(rps == 0) {
					System.out.println("비겼습니다.");
				}else if(rps == 1) {
					System.out.println("플레이어 승!");
				}else {
					System.out.println("졌습니다ㅠㅠ");
				}
	
			}else if(player.equals("바위")) {
				if(rps == 0) {
					System.out.println("졌습니다ㅠㅠ");
				}else if(rps == 1) {
					System.out.println("비겼습니다.");
				}else {
					System.out.println("플레이어 승!");
				}
			} else {
				if(rps == 0) {
					System.out.println("플레이어 승!");
				}else if(rps == 1) {
					System.out.println("졌습니다ㅠㅠ");
				}else {
					System.out.println("비겼습니다.");
				}
			}
	 
			
		}
		
		
		
		
		

		
	}
	
	
	
	
	

	
}

