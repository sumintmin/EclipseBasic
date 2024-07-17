package kr.or.ddit.homework;

import java.util.Scanner;

public class homework05_ans {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		homework05_ans obj = new homework05_ans();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
		method7();
	}
	
	public void method1() {
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
		}
	}
	
	public void method3() {
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method4() {
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int space = 0; space < i; space++) {
				System.out.print(" ");
			}
			for (int star = 0; star < row-i; star++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	public void method5() {
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int space = 0; space < row-1-i; space++) {
				System.out.print(" "); // 공백은 row보다 하나 적음, 줄마다 1개씩 감소함
			}
			for (int star = 0; star < 2*i +1; star++) {
				System.out.print("*"); // 별 개수가 2개씩 증가함
			}System.out.println();
		}
	}
	
	public void method6() {
		int row = sc.nextInt();
		for (int i = 0; i < 0; i++) {
			for (int space = 0; space < i; space++) {
				System.out.print(" ");
			}
			for (int star = 0; star < (row-i-1); star++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	public void method7() {
		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			if (i <= row/2) {
				for(int s1 = 0; s1<i; s1++) {
					System.out.print(" ");
				}
				for (int j = 0; j < row - 2 * i; j++) {
					if(j == 0 || j == row -2*i-1) {
						System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
				
			}System.out.println();
		}
			else {
				for (int s1 = 0; s1 < row-i-1; s1++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 0 + 2*(i-row/2) + 1; j++) {
					if (j == 0 || j == 2*(i-row/2)) {
						
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}System.out.println();
			}
	}
	}
}
