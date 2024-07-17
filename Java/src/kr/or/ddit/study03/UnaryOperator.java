package kr.or.ddit.study03;

import java.util.Scanner;

public class UnaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		UnaryOperator obj = new UnaryOperator();
		obj.process();

	}

	public void process() {
		// 단항 연산자
//		method1();
		method2();
	}
	
	public void method2() {
		// 증감 연산자
		// ++ 변수 : 다른 연산을 수행하기 	전에 		1을 증가시킴
		// 변수 ++ : 다른 연산을 수행한 	후에   	1을 증가시킴
		// -- 변수 : 다른 연산을 수행하기 	전에 		1을 감소시킴
		// 변수 -- : 다른 연산을 수행한 	후에   	1을 증가시킴
		
		int val = 10;
		int res = 10;
		
		val = 10;
		res = ++val;
		val += 1;
		res = val;
		
		System.out.println("val :" + val);
		System.out.println("res :" + res);

		val = 10;
		res = --val;
		System.out.println("val : " + val);
		System.out.println("res : " + res);
		
		val = 10;
		res = val--;		
		System.out.println("val : " + val);
		System.out.println("res : " + res);
	}
	
	public void method1() {
		// 부호 연산자
		// +, -
		int num 	= -100;
		int result 	= -num;
		System.out.println(result);
	}
	
}
