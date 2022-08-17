package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void ex01() {
		int[] arr = new int[9];
		int sum=0;
		for(int i=1; i<=arr.length; i++) {
			System.out.print(i+" ");
			if(i % 2 != 0) {
				sum += i;
			}
		} System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}
	
	public void ex02() {
		int[] arr = new int[9];
		int sum=0;
		for(int i=arr.length; i>=1; i--) {
			System.out.print(i + " ");
			if(i % 2 == 0) {
				sum += i;
			}
		}System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}
	
	public void ex03() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("양의 정수 : ");
		 int input = sc.nextInt();
		 int[] arr= new int[input];
		 for(int i=0; i<arr.length; i++) {
			 System.out.print((i+1) + " ");
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
	// ??
	public void ex05() {
//		 Scanner sc = new Scanner(System.in);
//		 
//		 System.out.print("문자열 : ");
//		 String str = sc.next();
//		 char[] charArr= str.toCharArray();
//		 System.out.print("문자 : ");
//		 String input2 = sc.next();
//		 
//		 int count=0;
//		 
//		 for(int i=0; i<charArr.length; i++) {
//			 if(charArr[i].equals(input2)) {
//				 count++;
//			 }
//
//		 }
//		 System.out.printf("%s에 %s가 존재하는 위치(인덱스) : \n", str, input2, charArr);
//		 System.out.printf("%s 개수 : %d", input2, count);
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
	// ?
	public void ex07() {
		
	}
	public void ex08() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수 : ");
		 int num = sc.nextInt();
		 int[] arr = new int[num];
		 
		 if(num % 2 == 0 || num<=2) {
			 System.out.println("다시 입력하세요.");
		 }else {
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

		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10+1);
			arr[i]=ran;
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
		System.out.println("발생한 난수 : " + Arrays.toString(arr));
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	public void ex11() {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*10+1);
			arr[i] = ran;
			for(int x=0; x<i; x++) {
				if(arr[x]==ran) {
				i--; break;
				}
			}
		}
		System.out.print(Arrays.toString(arr));
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
	// ?
//	public void ex20() {
//		 Scanner sc = new Scanner(System.in);
//		 System.out.print("행의 크기 : ");
//		 int rowSize = sc.nextInt();
//		 int colSize = 0;
//		 int[][] arr = new int[rowSize][colSize];
//		 for(int row=0; row<rowSize; row++) {
//			 System.out.print(row + "열의 크기 : ");
//			 colSize = sc.nextInt();
//			 for(int col=0; col<colSize; col++) {
//				 System.out.println(arr[row][col]);
//			 }System.out.println();
//		 }
//	}
	public void ex21() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
				"송성실", "윤예의", "진재주", "차천축", "피풍표","홍하하"};
		int[][] arr1 = new int[3][2];
		int[][] arr2 = new int[3][2];
		
		for(int i=1; i<=2; i++) {
			System.out.println("== "+i+"분단 ==");
			for(int x=0; x<arr1.length; x++) {
				for(int y=0; y<arr1[x].length;y++) {
					arr1 = students;
				}
			}
		}
		
		
	}
	public void ex22() {
		
	}
	public void ex23() {
		
	}
	public void ex24() {
		
	}

}
