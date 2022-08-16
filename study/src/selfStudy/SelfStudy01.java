package selfStudy;

import java.util.Scanner;

public class SelfStudy01 {
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int input = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + candy / input);
		System.out.println("남은 사탕 개수 : " + candy % input);
	}
	
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수 입니다.");
		}else if(num == 0) {
			System.out.println("0 입니다.");
		}else {
			System.out.println("음수입니다.");
		}
	}
	
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}
	
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요");
		int input = sc.nextInt();
		
		if(input < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}else {
			for(int i = 1; i<=input; i++) {
				System.out.print(i+" ");
			}

		}
	}
	
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i<=input; i++) {
			sum += i;
			if(i<input) {
				System.out.print(i+" + ");
			}else {
				System.out.print(i + " = " + sum);
			}
		}

	}
	
	public void ex6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : 
		case 12 : System.out.printf(month + "월은 31일까지 있습니다."); break;
		
		case 2 : case 4 : case 6 : case 9 : 
		case 11 : System.out.println(month + "월은 30일까지 있습니다."); break;
		
		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}
	
	public void ex7() {
		// 1부터 30까진 5의 배수뤃 제외하고 출력 (continue 사용)
		
		for(int i=1; i<=30; i++) {
			if(i % 5 ==0) {
				continue;
				
			}System.out.print(i + " ");
			
		}
	}
	
	public void ex8() {
		Scanner sc = new Scanner(System.in);
		
		int ran = (int)(Math.random()*50+1);
		
		int count=1;
		
		while(true) {
			System.out.print(count+"번 입력 : ");
			int num = sc.nextInt();
			
			if(num > ran) {
				System.out.println("DOWN");
			}else if(num < ran) {
				System.out.println("UP");
			}else {
				System.out.println("정답입니다! ( 총 입력 횟수 : "+count+"회)"); break;
			}
			count++;
		}
		
	}
	
	public void ex9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 판? : ");
		int game = sc.nextInt();
		
		int win=0;
		int lose=0;
		int draw=0;
		
		for(int i=1; i<=game; i++) {
			System.out.println();
			System.out.println(i+"번째 게임");
			System.out.print("가위/바위/보 중 하나를 입력 해주세요 : ");
			String player = sc.next();
			
			int com = (int)(Math.random()*3);
			
			if(com==0) {
				System.out.println("컴퓨터는 [가위]를 선택했습니다.");
				if(player.equals("바위")) {
					System.out.println("플레이어 승!");
					win++;
				}else if(player.equals("보")){
					System.out.println("졌습니다ㅠㅠ");
					lose++;
				}else {
					System.out.println("비겼습니다.");
					draw++;
				}
			}
			if(com==1) {
				System.out.println("컴퓨터는 [바위]를 선택했습니다.");
				if(player.equals("보")) {
					System.out.println("플레이어 승!");
					win++;
				}else if(player.equals("가위")){
					System.out.println("졌습니다ㅠㅠ");
					lose++;
				}else {
					System.out.println("비겼습니다.");
					draw++;
				}
			}
			if(com==2) {
				System.out.println("컴퓨터는 [보]를 선택했습니다.");
				if(player.equals("가위")) {
					System.out.println("플레이어 승!");
					win++;
				}else if(player.equals("바위")){
					System.out.println("졌습니다ㅠㅠ");
					lose++;
				}else {
					System.out.println("비겼습니다.");
					draw++;
				}
			}
			System.out.printf("현재 기록 : %d승 %d무 %d패\n",win, draw, lose);
			
		}
	}
	
	public void ex10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 판? : ");
		int game = sc.nextInt();
		
		int win=0;
		int lose=0;
		int draw=0;
		
		for(int i=1; i<=game; i++) {
			System.out.println();
			System.out.println(i+"번째 게임");
			System.out.print("가위/바위/보 중 하나를 입력 해주세요 : ");
			String player = sc.next();
			
			String com=null;
			
			int ran = (int)(Math.random()*3);
			
			switch(ran) {
			case 0 : com = "가위"; break;
			case 1 : com = "바위"; break;
			case 2 : com = "보"; break;
			}
			
			System.out.printf("컴퓨터 [%s]를 선택했습니다. \n", com);
			
			if(player.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;
			}else {
				boolean win1 = player.equals("가위")&&com.equals("보");
				boolean win2 = player.equals("바위")&&com.equals("가위");
				boolean win3 = player.equals("보")&&com.equals("바위");
				
				if(win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
				}else {
					System.out.println("졌습니다ㅠㅠ");
					lose++;
				}
			}
			System.out.printf("현재 기록 : %d승 %d무 %d패 \n",win, draw, lose);
		
		}
		
	}
	
	public void ex11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 인원 수 : ");
		int input = sc.nextInt();
		
		int[] scoreArr = new int[input];
		

	}

}
