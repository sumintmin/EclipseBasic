package kr.or.ddit.homework;

import java.util.Scanner;

public class Homework06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework06 obj = new Homework06();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
		method4();
	}
	
	public void method4() {
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
//		for (int i = 0; i <= num; i++) {
//			if(num % 2 == 0) {
//				if (i % 2 == 0) {
//					sum += i * i;
//				}
//			}else {
//				if(i % 2 != 0) {
//					sum += i;
//				}
//			}
//		}
//		System.out.println(sum);
//		
//		
		
		if(num%2 == 0) {
			for(int i = 2; i <= num; i += 2) sum += i*i;
			System.out.println("짝수의 합 : " + sum);
		}else {
			for(int i = 1; i<= num; i += 2)	sum += i;
			System.out.println("홀수의 합: " + sum);
		}
	}
	
	public void method3() {
		System.out.print("출력하지 않을 단을 입력하세요: ");
		int num = sc.nextInt();
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i == num) continue;
				System.out.printf("%d * %d = %d", i, j, i*j);
				System.out.println();
			}System.out.println();
		}
	}
	
	public void method2() {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%d * %d = %d \t", j, i, i*j);
				
			}
			System.out.println();
		}
	}
	
	
	public void method1() {
		// 특정 단만 출력하는 구구단
		System.out.print("출력할 단을 입력하시오: ");
		int num = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d", num, i, num*i);
			System.out.println();
		}
	}
	
	
}
