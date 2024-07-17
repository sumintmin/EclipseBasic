package kr.or.ddit.study03;

import java.util.Scanner;

public class BinaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BinaryOperator obj = new BinaryOperator();
		obj.process();

	}

	public void process() {
		// 이항 연산자: 대부분의 연산자
		// 피연산자가 2개인 것 2 + 3 <- 피연산자 2, 3
		// 산술 연산자, 
//		관계 연산자, 논리 연산자, 비트 연산자, 대입 연산자
		
//		method1();
//		method2();
//		method3();
//		method4();	// 참고
//		method5();	// 참고
		method6();
	}
	
	public void method6() {
		// =   :   '='	오른쪽 값을	   '='	왼쪽에 저장 우선순위가 늦다★
		// =과 다른 연산자 결합 가능
		// += 		a = a + b -> a + = b
		// -=		a = a - b -> a - = b
		// *=		a = a * b -> a * = b
		// /=		a = a / b -> a / = b
		// %=		a = a % b -> a % = b
		
		int a = 10;
		int b = 4;
		
		System.out.println("a = a + b => a += b  " + (a += b));
		System.out.println("a = a - b => a -= b  " + (a -= b));
		System.out.println("a = a * b => a *= b  " + (a *= b));
		System.out.println("a = a / b => a /= b  " + (a /= b));
		System.out.println("a = a % b => a %= b  " + (a %= b));
		
		// a 값에 10을 더하시오
		System.out.println(a);
		a += 10;
		System.out.println(a);
		
	}
	
	public void method5() {
		// 시프트 연산자
		// >> <<
		
		System.out.println(32 >> 2);
		System.out.println(32 << 2);
		// 금융권의 연산처리
		// 0010000 >> 2	0000100
		// 0010000 << 2	1000000?
		// 더 빨리 연산하는 연산자
	}
	
	
	
	public void method4() {
		// 논리 연산자
		// 		45 = 32 + 8 + 4 + 1		&			|
		// A	00101101
		// B	00010100
		// &	00000100
		// |	00111101
		
		int a = 45;
		int b = 20;
		
		System.out.println(a&b);
		System.out.println(a|b);
		
	}
	
	
	
	public void method3() {
		// 논리 연산자
		// && || !
		// A && B : A, B 중 하나라도 거짓이면 거짓 		논리곱
		// A || B : A, B 중 하나라도 참이면 참 		논리합
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(a&&b); 		// 거짓
		System.out.println(a||b); 		// 참~
		System.out.println();
		
		System.out.println(!a || !b); 	// 참
		System.out.println(a&&!b); 		// 참
		System.out.println();
		
		System.out.println(!(a&&b)||b); // 참
		System.out.println();
		
		// 1보다 크고 5보다 작으면 참
		
		int num = 3;
		
//		boolean result = true;
//		if (num > 1 && num < 5) {
//			System.out.println(result);
//		}
//		else {
//			System.out.println(!result);
//		}
		
		boolean result = (1<num) && (num<5);
		System.out.println(result);
		System.out.println();
		
		// 0보다 작거나 100보다 크다면 참
		boolean test = (0>num) || (100<num);
		System.out.println(test);
		
	}
	
	public void method2() {
		// 관계 연산자
		// > < == >= <= !=
//		!:부정
		System.out.println("점수를 입력하세요");
		int num = sc.nextInt();
//		
//		if(num>60) {
//			System.out.println("합격");
//		} // 두개가 포함되면 앞에꺼가 먼저 나온다.. 60점이라던가 이상이하로 했을 때
//		else if(num <=60) {
//			System.out.println("불합격");
//		}
		// 관계연산자는 항상 boolean이 나온다.
		
		if (num%2 != 1) {
			System.out.println("짝수");
		}
	
		else if (num%2 != 0){
			System.out.println("홀수");
		}
		
	}
	
	public void method1() {
		// 산술 연산자.
		// + - / * % 
		
		int a = 10;
		int b = 7;
		
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a % b = " + (a % b));
	}
	
}
