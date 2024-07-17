package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class PrintExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PrintExample obj = new PrintExample();
		obj.process();

	}

	public void process() {
		
//		method1();
//		method2();
		method3();
	}
	
	
	public void method3() {
		//printf 형식지정 문자열
		// 정수: %d, 실수: %f, 문자열: %s
		// System.out.printf("형식지정 문자열", 변수 리스트)
		int age = 25;
		String name = "육수민";
		System.out.printf("이름: %s 나이: %d", name, age);
		System.out.println("이름: "+ name  + " 나이: "+ age);
		System.out.printf("이름: %s 나이: %d", "육수민", 25);
	}
	
	
	public void method2() {
		// println - 줄바꿈 기능x
		System.out.print("대전시\t");
		System.out.print("중구\n");
		System.out.print("계룡로\t");
		System.out.print("34061");	
	}
	
	public void method1() {
		// println - 줄바꿈 기능
		System.out.println("대전시");
		System.out.println("중구");
		System.out.println("계룡로");
		System.out.println("34061");
	}
	



}
