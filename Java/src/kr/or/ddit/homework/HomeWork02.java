package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork02 obj = new HomeWork02();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
	}
	
	public void method5() {
		System.out.println("method5 - 소수 반올림하기");
		// 소수점 3째자리에서 반올림
		// 12.32131 -> 12.32
		// 12.32731 -> 12.33
		System.out.println("실수를 입력하세요:");
		String num = sc.next();
		
		/*
		 * double d1 = Double.valueOf(str) + 0.5;
		 * int num = (int)d1;
		 * sout(num);
		 * 
		 * int num = (int)(d1*100);
		 * d1 = num/1000.0;
		 * 
		 * sout(d1);
		 * 
		 */
		
		double numDouble = Double.parseDouble(num);
//		System.out.println("StrToDouble : " + numDouble);
		double nums = (numDouble * 100 + 0.5);
		
		int numInt = (int)nums;
		double result = numInt/100.0;
		System.out.println("소수점 둘째자리까지 반올림 출력:" + result);
		System.out.println(" ");
	}
	
	public void method4() {
		System.out.println("method4 - 각자리 숫자 더하기");

		// 3자리 숫자의 각 자리수 합을 구하시오.
		// 123 -> 1 + 2 + 3 -> 6
		System.out.println("3자리 숫자를 입력하시오: ");
		String str = sc.next();
		System.out.println(str);
		int c5 = (int)str.charAt(0)-48;
		int c6 = (int)str.charAt(1)-48;
		int c7 = (int)str.charAt(2)-48;
		int sum = c5 + c6 + c7;
		/*
		 * int i1 = c1-'0';
		 * int i2 = c2-'0';
		 * int i3 = c3-'0';
		 * 1 = 49, 0 = 48, 
		 * -----------------
		 * int num = Integer.valueOf(str);
		 * int i1 = num/100; //i1 에는 1이 들어감.
		 * num = num-i1*100; // 뭘 나누기 하면 ? 
		 * int i2 = num/10;
		 * num = num-i2*10;
		 * int i3 = num;
		 * 
		 * int sum = i1 + i2 + i3;
		 * 
		 */
		
		System.out.println(sum);
		System.out.println(" ");
	}
	
	
	public void method3() {
		System.out.println("method3 - 소문자를 대문자로");

		// 스캐너를 통해 소문자를 입력 받고 대문자로 바꾸시오.
		System.out.println("소문자를 입력하세요: ");
		String str = sc.next();
		char c3 = str.charAt(0);
		char c4 = (char)(c3 - 32);
		System.out.println(c3 + " -> " + c4);
		System.out.println(" ");
			
	}
	
	// 0.5를 더하면 반올림이 됨
	public void method2() {
		System.out.println("method2 - 대문자를 소문자로");

		// 스캐너를 통해 대문자를 입력 받고 소문자로 바꾸시오.
		System.out.println("대문자를 입력하세요: ");
		String str = sc.next();
		char c1 = str.charAt(0);
		
//		c1 = (char)(c1 + 32);
		char c2 = (char)(c1 + 32);
		System.out.println(c1 + " -> " + c2);
		System.out.println(" ");
		
	}
	
	public void method1() {
		System.out.println("method1 - 소수점 둘째자리까지 출력하기");

		// 스캐너를 통해서 실수를 입력 받고
		// 소수점 2째자리까지 출력
		// ex) 12.2346412 -> 12.23
		
		System.out.println("실수를 입력하세요:");
		String num = sc.next();
		double numDouble = Double.parseDouble(num);
		
//		System.out.println("StrToDouble : " + numDouble);
		
		int numInt = (int)(numDouble * 100);
		
		double result = numInt/100.0;
		
		System.out.println("소수점 둘째자리까지 출력:" + result);
	}

}
