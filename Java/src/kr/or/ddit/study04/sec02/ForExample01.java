package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample01 obj = new ForExample01();
		obj.process();

	}

	public void process() {
		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method6_1(
//		method7();
//		method7_1();
//		method8();
//		method9();
//		method10();
//		method11();
//		method12();
//		method12_1();
//		method13();
//		method14();
//		method15();
//		method16();
		
	}
	

	
	public void method16() {
		//	1	8	9	16
		//	2	7	10	15
		//	3	6	11	14
		//	4	5	12	13
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int result = 0;
				if(j%2 == 0) result = i + j * 4 + 1;
				if(j%2 == 1) result = -i + j * 4 + 4;
				System.out.print(result + "\t");
			}
			System.out.println();
		}
	
	}
	
	public void method15() {
		//	1	5	9	13
		//	2	6
		//	3	7
		//	4	8	...	16
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int result = i+4*j + 1;
				System.out.print(result + "\t");
				
			}
			System.out.println();
		}
		
		
		
		
	}
	
	public void method14() {
		// 1 2 3 4
		// 5 6 7 8
		// .....16
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int result = i * 4 + j + 1;
				System.out.print(result + "\t");
			}
			System.out.println();
		}
	}
	
	public void method13() {
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println(i + ", " + j);
				
			}
		}
	}
	public void method12() {
		// 1	2	3	4
		// 8	7	6	5
		// 9	10	11	12
		// 16	15	14	13
		for (int i = 0; i < 4; i++) {
			if (i % 2 != 0) {
				for (int j = 4; j > 0; j--) {
					int result = i * 4 + j ;
					System.out.print(result + "\t");
				}
				System.out.println();
			}else { // i 값이 증가할 때 4씩 증가
				for (int j = 0; j < 4; j++) {
					int result = i * 4 + j  + 1;
					System.out.print(result + "\t");
				}
				System.out.println();
			}
		}
		
	}
	
	public void method12_1() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int result = 0;
				if(i%2 == 0) result = i*4 + j + 1;
				if(i%2 == 1) result = i*4 + 4 - j;
				System.out.print(result + "\t");
			}
			System.out.println();
		}
	}
	
	
	
	public void method11() {
		// 문자를 거꾸로 출력하기
		// cup -> puc
		System.out.println("문자열 입력");
		String str = sc.next();
		// cup은 012 이므로 3에서 1을 빼서 계산함
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("\n");
		for (int i = 0; i <= str.length()-1; i++) {
			System.out.println(str.charAt(str.length()-1-i));
		}
	}
	
	
	
	
	
	public void method10() {
		// z~a까지 출력
		for (char ch = 'z'; ch >='a'; ch--) {
			System.out.println(ch);
			
		}
	}
	
	public void method9() {
		// a부터 입력한 문자까지 출력하기
		System.out.println("알파벳 소문자 입력: ");
		String str = sc.nextLine();
//		char ch = str.charAt(0);
		for (char ch = 'a'; ch <= str.charAt(0); ch++) {
			System.out.println(ch);
		}
		
		char i = str.charAt(0);
		for(; i>='a'; i--) {
			System.out.println(i);
		}
	}
	
	public void method8() {
		// string을 char로 변경한다.
		// 입력한 문자부터 ~z까지 출력하기
		System.out.println("알파벳 소문자 입력: ");
		String str = sc.nextLine();
//		char ch = str.charAt(0);
		for (char ch = str.charAt(0); ch <= 'z' ; ch++) {
			System.out.print(ch);
		} // 필요에 따라 초기값 생략이 가능하다.
		// 혹은 변수 선언을 for안에서 초기설정해도 됨
	}
	
	public void method7_1() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}
	
	
	public void method7() {
		// a~z까지 출력하기
//		char a = 0;
//		for (int i = 65; i <= 90; i++) {
//			a = i;
//			System.out.println(a);
//			
//		}
		char ch = 'a';
		for (int i = 0; i < 26; i++) {
			ch = (char)(ch + 1);
			System.out.println(ch);
		}
	}
	public void method6_1() {
		int sum = 0;
		for (int i = 2; i < 11; i+=2) {
			sum += i;
			System.out.println("i = " + i + " sum += " + sum);
		}
		System.out.println("1~10까지의 홀수의 합 = " + sum);
	}
	
	public void method6() {
		// 1~10 까지 홀수의 합을 구하시오
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				sum += i;
				System.out.println("i = " + i + " sum += " + sum);
			}	
		}
		System.out.println("1~10까지 짝수의 합 = " + sum);
	}

	
	public void method5() {
		// 홀수의 합
		// 1~10까지의 홀수의 합을 구하시오
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 != 0) {
				sum += i;
				System.out.println("i = " + i + " sum += " + sum);
			}
		}
		System.out.println("1~10까지 홀수의 합 = " + sum);
		
	}
	
	public void method4() {
		// 5~10까지 합
		int sum = 0;
		for (int i = 5; i < 11; i++) {
			sum += i;
			System.out.println("i = " + i + " sum += " + sum);
		}
		System.out.println("5~10까지의 합은 : " + sum);
	}
	
	public void method3() {
		// 1~10까지의 합을 구하시오.
		int sum = 0;
		// for 블럭이 끝나면 누적이 안됨 sum 무한생성이므로 for문 밖에 선언한다.
		for (int i = 0; i < 11; i++) {
			sum +=i; //
//			System.out.println("i = " + i + " sum += " + sum);
			// line number를 더블클릭하면 파란 점이 나온다. f11누르기
			// debug perspective 실행됨 
			// variables를 보면 sum 0 i 0이 뜸
			// f8로 반복문 1회 진행상황 확인가능함
		}
		System.out.println("1~10까지의 합 : "+sum);
	}
	
	public void method1() { // 반복되는 if문이다.
		for(int i = 0; i < 3; i++) {
			System.out.println("실행");
		}
	}
	
	public void method2() {
		//반복문을 이용해서 1~5까지 출력	
		for (int i = 1; i < 6; i++) {
			System.out.println(i);
		}
	}
	
}
