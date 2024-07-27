package kr.or.ddit.study11;

import java.util.Scanner;
/*
 * Math 클래스
 * 수학과 관련된 연산 처리 등을 위한 클래스
 * 절대값, 반올림, 버림, 삼각함수, 제곱 등등...
 * 
 * 
 */
public class MathExample {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MathExample obj = new MathExample();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
		method6();
		
	}
	
	public void method6() {
		
	}
	
	public void method5() { // 참고: 한 번도 안써봤음
		int max = Math.max(10, 20);
		System.out.println(max);
	}
	
	public void method4() {
		// pow 제곱
		// 1테라와 1테라바이트는 다르다.
		double k = Math.pow(2, 10); // 2^10
		double m = Math.pow(2, 20); // 2^20
		double g = Math.pow(2, 30); // 2^30
		double t = Math.pow(2, 40); // 2^40
		
		double t1 = Math.pow(10, 12); // 10^12
		// 한 900기가정도 바이트랑 다르다
		
		System.out.println(t1/t*100);
//		double pow = Math.pow(2,10);
//		System.out.println(pow);
	}
	
	
	public void method3() {
		// sqrt = 루트
		double sqrt = Math.sqrt(36); 
		System.out.println(sqrt);
		
		
	}
	
	public void method1() {
		// 절대 값
		int i1 = Math.abs(-10); // ctrl키로 abs 생김새 확인 가능함~
		System.out.println();
		
	}
	
	public void method2() {
		
		// 반올림
		long a = Math.round(10.7);
		// 버림
		double b = Math.floor(10.7); // ctrl 로 long인지 double인지 확인
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(roundDigit(10.1217, 4));
	}
	
	public double roundDigit(double num, int digit) {
		
		int gop = 1;
		
		for(int i = 0; i< digit-1; i++) {
			gop *= 10;
		}
		double result = Math.round(num * gop);
		return result / gop;
	}
}
