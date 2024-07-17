package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class IfExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample02 obj = new IfExample02();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
		method3();
//		method3_1();
	}
	
	public void method3_1() {
		System.out.print("너의 점수: ");
		int score = sc.nextInt();
		String grade = "";
		if(score == 100) grade ="A+";
		else if(score >= 90) grade += "A"; // 두줄할거면 블럭 필수
		else if(score >= 80) grade += "B";
		else if(score >= 70) grade += "C";
		else if(score >= 60) grade += "D";
		else grade+="F";
		
		if (score != 100 && score > 60) {
			if(score%10 <= 3) grade +="-";
			else if(score%10 <= 6) grade += "0";
			else grade +="+";
		}
		System.out.println("너의 학점: " + grade);
	}
	
	
	public void method3() {
		// 90A 80B 70C 60D 미만F
		// 끝자리가 0~3이면 -, 4~6이면 0, 7~9면 +
		
		System.out.print("점수를 입력하세요: ");
		int s = sc.nextInt();
		int score = s%10;
		int a = 90, b = 80, c = 70, d = 60;
		char A = 'A', B = 'B', C = 'C', D = 'D';
		
		char plus = '+', minus = '-', zero = '0', re;
		
		if (s >=a) {	System.out.print(A);
		}else if(s >=b) {
			System.out.print(B);
		}else if(s >=c) {
			System.out.print(C);
		}else if(s >=d) {
			System.out.print(D);}
		
			
		if (score >= 0 && score <=3) {
			re = plus;
//			System.out.println(re);
		}else if (score >=4 && score <= 6 ) {
			re = zero;
//			System.out.println(re);
		}else if (score >=7 && score <=9) {
			re = minus;
//			System.out.println(re);}
		System.out.println(re);
	}
	
	public void method2() {
		// 숫자 a,b를 큰 숫자부터 출력하시오
		System.out.println("숫자: ");
		int a = sc.nextInt();
		System.out.println("숫자: ");
		int b = sc.nextInt();
//		int c;
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println(a + ", " + b);
	}
	
	public void method1() {
		// 숫자 a, b 중 큰 숫자를 출력하시오.
		System.out.println("숫자 : ");
		int a = sc.nextInt();
		
		System.out.println("숫자 : ");
		int b = sc.nextInt();
		
		System.out.println((a>b)?a:b);
		
	}
}
