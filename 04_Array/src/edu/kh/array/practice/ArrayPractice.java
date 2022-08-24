package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void ex01() {
		int[] arr = new int[9];
		
		int sum=0;
		for(int i=1; i<=arr.length; i++) {
			System.out.print(arr[i]+" ");
			if(i % 2 != 0) {
				sum += arr[i];
			}
		} System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}
	
	public void ex02() {
		int[] arr = new int[9];
		
		int sum=0;
		for(int i=arr.length; i>=1; i--) {
			System.out.print(arr[i] + " ");
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}
	
	public void ex03() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("양의 정수 : ");
		 int input = sc.nextInt();
		 int[] arr= new int[input];
		 for(int i=0; i<arr.length; i++) {
			 arr[i]=i+1;
			 System.out.print(arr[i] + " ");
		 }
	}
	
	public void ex04() {
		 Scanner sc = new Scanner(System.in);
		 int[] arr = new int[5];
		 
		 boolean flag = true;
		 
		 for(int i=0; i<arr.length; i++) {
			 System.out.printf("입력 %d : ", i);
			 arr[i] = sc.nextInt();
		 }
		 System.out.print("검색할 값 : ");
		 int search = sc.nextInt();
		 for(int i=0; i<arr.length; i++) {
			 if(search == arr[i]) {
				System.out.println("인덱스 : " + i);
				flag = false;
				break;
			 }
		 }if(flag == true) {
				 System.out.println("일치하는 값이 존재하지 않습니다.");
			 }

		
	}
	// 답안보고 이해
	public void ex05() {
		 Scanner sc = new Scanner(System.in);

		 System.out.print("문자열 : ");
		 String str = sc.nextLine();
		 char[] arr = new char[str.length()];
		 
		 for(int i=0; i<arr.length; i++) {
			 arr[i]=str.charAt(i);
		 }
		 
		 System.out.print("문자 : ");
		 char ch = sc.nextLine().charAt(0);
		 
		 int count = 0;
		 
		 System.out.printf("%s에 %s가 존재하는 위치(인덱스) : ", str, ch);
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i]==ch) {
				 System.out.print(i + " ");
				 count++;
			 }
		 }
		 System.out.println();
		 System.out.println(ch + "개수 : " + count);
	}
	
	public void ex05_1() {

	}
	public void ex06() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("정수 : ");
		 int input = sc.nextInt();
		 
		 int[] arr = new int[input];
		 
		 int sum = 0;
		 
		 for(int i=0; i<input; i++) {
			 System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");
			 int num = sc.nextInt();
			 arr[i] = num;
			 sum += num;
		 }
		 for(int i=0; i<input; i++) {
			 System.out.print(arr[i]+"  ");
		 }System.out.println("\n총 합 : " + sum);
		 
		 
	}
	
	public void ex07() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("주민등록번호(-포함) : ");
		 String input = sc.nextLine();
		 
		 char arr[] = new char[input.length()];
		 for(int i=0; i<arr.length; i++) {
			 arr[i] = input.charAt(i);
			 if(i<=7) {
				 System.out.print(arr[i]);
			 }else {
				 arr[i] = '*';
				 System.out.print(arr[i]);
			 }
		 }
	}
	public void ex08() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수 : ");
		 int num = sc.nextInt();
		 
		 if(num % 2 == 0 || num<=2) {
			 System.out.println("다시 입력하세요.");
		 }else {
			 int[] arr = new int[num];
			 for(int i=1; i<=(num/2+1); i++) {
				 System.out.print(i + ", ");
			 }for(int i=num/2; i>=1; i--) {
				 System.out.print(i + ", ");
			 }
		 }
	}
	
	public void ex09() {
		int arr[] = new int[10];
		System.out.print("발생한 난수 : ");
		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10+1);
			arr[i]=ran;
			System.out.print( arr[i] + " ");
		}
	}
	
	public void ex10() {
		int[] arr = new int[10];

		System.out.print("발생한 난수 : ");
		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10+1);
			arr[i]=ran;
			System.out.print(arr[i] + ", ");
		}
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}if (min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println();
//		System.out.println("발생한 난수 : " + Arrays.toString(arr));
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	public void ex11() {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10+1);
			arr[i] = ran;
			for(int x=0; x<i; x++) {
				if(arr[x]==arr[i]) {
				i--; break;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");			
		}
	}
	
	public void ex12() {
		int[] arr = new int[6];
		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*45+1);
			arr[i] = ran;
			for(int x=0; x<i; x++)
			if(arr[x]==ran) {
				i--;
				break;
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	// ?
	public void ex13() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("문자열 : ");
		 String str = sc.next();
		 

		 

	}
	
	public void ex14() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("배열의 크기를 입력하세요 : ");
		 int num = sc.nextInt();
		 for(int i=0; i<num; i++) {
			 System.out.print((i+1)+"번째 문자열 : ");
			 String input = sc.next();
		 }
		 System.out.println("더 값을 입력하시겠습니까?(Y/N) : ");
		 String input = sc.next();
		 if(input.equals("N") || input.equals("n")) {
			 
		 }
		
	}
	public void ex15() {
		int arr[][] = new int[3][3];
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.printf("(%d, %d)", row, col);
			}System.out.println();
		}
		
	}
	
	public void ex16() {
		int arr[][] = new int[4][4];
		int count=1;
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.printf("%3d", count);
				count++;
			}System.out.println();
		}
	}
	
	public void ex17() {
		int [][] arr= new int[4][4];
		int count=16;
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.printf("%3d", count);
				 count--;
			}System.out.println();
		}
	}
	
	// ArrayExample2 참고
	public void ex18() {
		int[][] arr= new int[4][4];
		for(int row=0; row<arr.length-1; row++) {
			for(int col=0; col<arr[row].length-1; col++) {
				int ran = (int)(Math.random()*10+1);
				arr[row][col]=ran;
				arr[row][arr[row].length-1] += ran;
				arr[arr.length-1][col] += ran;
				arr[arr.length-1][arr[row].length-1] += ran;
			}
		}
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.printf("%3d", arr[row][col]);
			}System.out.println();
		}
	}
	
	public void ex19() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("행 크기 : ");
		 int rowSize = sc.nextInt();
		 System.out.print("열 크기 : ");
		 int colSize = sc.nextInt();
		 if(rowSize>10 || colSize>10) {
			 System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		 }
		 char[][] arr= new char[rowSize][colSize];
		 for(int row=0; row<rowSize; row++) {
			 for(int col=0; col<colSize; col++) {
				 char ran = (char)(Math.random()*26+65);
				 arr[row][col] = ran;
				 System.out.print(arr[row][col]+" ");
			 }System.out.println();
		 }
	}
	// 가변배열 + 실습문제16 참고
	public void ex20() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("행의 크기 : ");
		 int rowSize = sc.nextInt();
		 int[][] arr = new int[rowSize][];
		 int count=0;
		 
		 for(int row=0; row<arr.length; row++) {
			 System.out.print(row + "열의 크기 : ");
			 int colSize = sc.nextInt();
			 arr[row] = new int[colSize];
			 for(int col=0; col<arr[row].length; col++) {
			 } 
		 }
		 for(int row=0; row<arr.length; row++) {
			 for(int col=0; col<arr[row].length; col++) {
				 char a = 97;
				 arr[row][col] = a+count;
				 System.out.print((char)arr[row][col] + "  ");
				 count++;
				 
			 }System.out.println();
		 }
 
	}
	//?
	public void ex21() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축", "피풍표","홍하하"};
		String [][] arr;
		
		int[][] arr1 = new int[3][2];
		int[][] arr2 = new int[3][2];
		
		for(int i=0; i<students.length; i++) { 
			
		}

	}
	
	//?
	public void ex22() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축", "피풍표","홍하하"};
		
	}
	
	// ?
	public void ex23() {
		 Scanner sc = new Scanner(System.in);
		 String[][] arr = new String[6][6];
		 
		 arr[0][0] = " ";
		 
		 for(int row=1; row<arr.length; row++) {
			 for(int col=1; col<arr[row].length; col++) {
				 System.out.print(  arr[col][row]);
			 }System.out.println();
		 }
		 
		 
	
	}
	
	// ?
	public void ex24() {
		
	}

}
