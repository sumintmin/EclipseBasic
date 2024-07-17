package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class TrinomialOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TrinomialOperator obj = new TrinomialOperator();
		obj.process();

	}

	public void process() {
//		method1();
		method2();
	}
	
	public void method2() {
		// a, b 입력 받고
		// a 값이 짝수라면 a + b
		// a 값이 홀수라면 a * b 값을 저장하시오
		
		System.out.println("숫자를 입력 : ");
		int a = sc.nextInt();
		System.out.println("숫자를 입력 : ");
		int b = sc.nextInt();
		
		int result = (a%2 == 0)? (a + b) : (a * b);
		System.out.println(result);
	}
	public void method1() {
		
		// 삼항 연산자: 3개의 피연산자를 필요로 하는 연산
		//			삼항연산자는? 	앞의 조건식의 결과에 따라 클론 앞뒤의
		//						피연산자가 선택됨
		
		//	조건식?	참	:	거짓
		
		System.out.println("나이를 입력: ");
		int age = sc.nextInt();
		String message = age >= 18	?	"성년"	:	"미성년";
		System.out.println(message);
		
	}

}
