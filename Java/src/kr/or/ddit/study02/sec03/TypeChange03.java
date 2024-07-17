package kr.or.ddit.study02.sec03;

import java.util.Scanner;

public class TypeChange03 {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TypeChange03 obj = new TypeChange03();
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
		// 평균을 첫째자리까지 출력
		System.out.println("국어 점수 입력: ");
		String kor = sc.next();
		System.out.println("영어 점수 입력:");
		
		String eng = sc.next();
		System.out.println("수학 점수 입력: ");
		String math = sc.next();
		
		System.out.println("국어: " + kor + " 수학: " + math + " 영어: " + eng);
		
		int k = Integer.valueOf(kor);
		int e = Integer.valueOf(math);
		int m = Integer.valueOf(eng);
		
		//총점, 평균
		int sum = k + e + m;
		double avg = sum / 3.0; // double 적어주면 된다. double과 int 계산시 double이 되므로 3대신 3.0 넣어도 자동으로 double된다. 실수의 기본형은 double타입이다.
		int avg10 = (int)(avg*10);
		avg = avg10/10.0;
		System.out.println("총점: " + sum + " 평균 : " + avg);
		
	}
	
	public void method4() {
		// 10.3231 -> 10.3
		
		System.out.println("실수를입력하세요: ");
		String num = sc.next();
		double numDouble = Double.parseDouble(num);
		System.out.println("String을 double로 : " + numDouble);
		int numInt = (int)(numDouble * 10); // 103
		double result = numInt/10.0; // 10.3	//1.0을 사용해 형맞춤
		System.out.println("소수점 첫째자리까지 출력: "+result);
		
		
	}
	
	public void method3() {
		System.out.println("국어 점수 입력: ");
		String kor = sc.next();
		System.out.println("영어 점수 입력:");
		
		String eng = sc.next();
		System.out.println("수학 점수 입력: ");
		String math = sc.next();
		
		System.out.println("국어: " + kor + " 수학: " + math + " 영어: " + eng);
		
		int k = Integer.valueOf(kor);
		int e = Integer.valueOf(math);
		int m = Integer.valueOf(eng);
		
		//총점, 평균
		int sum = k + e + m;
//		int avg = sum / 3; // 33.333값이 나올 수 있으니 double을 쓰도록 하자. sum과 3이 int값이라서 
//		double avg = (double) sum / 3; // double 적어주면 된다. double과 int 계산시 double이 되므로 3대신 3.0 넣어도 자동으로 double된다. 실수의 기본형은 double타입이다.
		double avg = sum / 3.0; // double 적어주면 된다. double과 int 계산시 double이 되므로 3대신 3.0 넣어도 자동으로 double된다. 실수의 기본형은 double타입이다.
		System.out.println("총점: " + sum + " 평균 : " + avg);
		//소수점 첫째자리에서 잘라보자.
		
	}
	
	public void method2() {
		// String -> 기본 타입
		
		// String -> 기본 타입
		// 대문자 기본타입.valueOf();
		// 대문자 기본타입. parse대문자 기본타입();
		String s1  = "10";
		byte   b1  = Byte.valueOf(s1);
		short  sh1 = Short.parseShort(s1);
		int    i1  = Integer.valueOf(s1);
		long l1 = Long.valueOf(s1);
		float f1 = Float.valueOf(s1);
		double d1 = Double.valueOf(s1);
		
		String s2 = "true";
		boolean bl1 = Boolean.valueOf(s2);
		
		System.out.println("b1 = " + b1 + " /sh1 = " + sh1 + " /i1 = " + i1 + " /l1 = " + l1 + " /f1 = " + f1 + " /d1 = " + d1 + "/b1 = " + bl1);
	}
	
	
	
	public void method1() {
		System.out.println("method1");
		// 기본 타입 -> String
		// String + anyType -> String 
		int i1 = 20;
		String s1 = "" + i1;
//		String s2 = String.valueOf(i1); // 바꿀 수 있지만 위이꺼가훨씬 편해서 잘 안씀
		
		
	}
	
}
