package kr.or.ddit.test;

import java.util.Scanner;

public class forex {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		forex obj = new forex();
		obj.process();

	}

	public void process() {
//		System.out.print("별 몇개?");
//		int row = sc.nextInt();
//		for (int i = 0; i < row; i++) {
//			for (int space = 0; space < i; space++) {
//				System.out.print("-");
//			}
//			for (int star = row; star > row-i; star--) {
//				System.out.print("*");
//			}System.out.println();
//		}
//		method1();
		method2();
	}
	
	public void method1() {
		
		for (int i = 0; i < 11; i++) {
//			for (int space = 0; space < i+1; space++) {
//			}
//			for (int space = 0; space < 11-i; space++) {
//				System.out.print(i);
//				
//			}
			for (int space = 0; space < i; space++) {
				System.out.print(" ");
			}
		
			
			if(i % 2 == 0) {
				for (int j = 0; j < 11-i; j++) {
					System.out.print("*");
				}System.out.println();
			}
		}
		
		
	}	
	public void method2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
//			System.out.print("*");
			System.out.println();
		}
	}
}

