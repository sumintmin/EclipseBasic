package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class Cal3 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Cal3 obj = new Cal3();
		obj.process();

	}

	public void process() {
		System.out.println("숫자 : ");
		int a = sc.nextInt();
		System.out.println("연산자 : ");
		String oper = sc.next();
		System.out.println("숫자 : ");
		int b = sc.nextInt();
		double result = cal(a, b, oper);
		System.out.println(a + oper + b + "=" + result);
	}
	// 디자인패턴과 전략패턴
	// 이건 전략패턴이다.
	// 전략패턴 모르면 if문에 result 일일이 생성하고 코드 길어짐
	public double cal(int a, int b, String oper) {
		if (oper.equals("+")) return add(a,b);
		if (oper.equals("-")) return minus(a,b);
		if (oper.equals("*")) return mul(a,b);
		if (oper.equals("/")) return div(a,b);
		return 0;
	}

	public int add(int a, int b) {
		return a + b; 
	}
	public int minus(int a, int b) {
		return a - b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public int div(int a, int b) {
		return a / b;
	}
	
	
}
