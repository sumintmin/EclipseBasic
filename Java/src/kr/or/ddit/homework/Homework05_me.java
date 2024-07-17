package kr.or.ddit.homework;

import java.util.Scanner;

public class Homework05_me {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework05_me obj = new Homework05_me();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
		method7();
		
	}
	
	public void method1() {
		// ex) row = 4일 경우 아래와 같이 출력
		// *
		// **
		// ***
		// ****
		System.out.print("별 몇개? ");
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int star = 0; star < i+1; star++) { System.out.print("*"); }
			System.out.println(); } }
	
	public void method2() {
		// ex) row = 4일 경우 아래와 같이 출력
		// 		*
		// 	   **
		// 	  ***
		//   ****
		
		// ALT SHIFT R로 변수명 한번에 변경
		System.out.print("별 몇개?");
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int space = 0; space < row-1-i; space++) {
				System.out.print(" ");
				}
			for (int star = 0; star < i+1; star++) {
				System.out.print("*");
				}
			System.out.println();	}	}
	
	public void method3() {
		// 		****
		// 	 	***
		// 	  	**
		//   	*
		System.out.print("별 몇개?");
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int star = 0; star < row-i; star++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	public void method4() {
		// 		****
		// 	 	 ***
		// 	  	  **
		//   	   *
		System.out.print("별 몇개?");
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int space = 0; space < i; space++) {
				System.out.print(" ");
			}
			for (int star = 0; star < row-i; star++) {
				System.out.print("*");
			}
		System.out.println();	
		}
	}
	
	public void method5() {
		// 		*
		// 	   ***
		// 	  *****
		//   *******
		
		System.out.print("별 몇개?");
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int space = 0; space < row-i; space++) {
				System.out.print(" ");}
			for (int star = 0; star < 2*i+1; star++) { System.out.print("*"); }
			System.out.println(); } 
		
	}
	
	public void method6() {
		// 		*******
		// 	 	 *****
		// 	  	  ***
		//   	   *
		System.out.print("별 몇개?");
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int space = 0; space < i; space++) {
				System.out.print(" ");
			}
			for (int star = 0; star < 2*(row-i)-1; star++) {
				System.out.print("*");
			}System.out.println();
			
		}
		
		
	}
	public void method7() {
		// 홀수만
		// *	*
		//  *  *
		//	 *
		//  *  *
		// *    *
		System.out.print("별 몇개?");
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				int result = i * row + j ;
				
				if (result % (row+1) == 0 || result == 0) {
					System.out.print("*");
				}else if (result % (row-1) == 0) {
					System.out.print("*");
					}else{
						System.out.print(" ");
					}
			}
			System.out.println();
		}
		
		
	}
	
}
