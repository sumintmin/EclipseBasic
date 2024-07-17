package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class WhileExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WhileExample01 obj = new WhileExample01();
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
		do {
			System.out.println("실행");
		} while (false);
	}
	
	public void method4() {
		// 각 자리수의 합을 구하시오.
		// 123 -> 1 + 2 + 3
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num > 0) {
			sum += num%10; // 나머지 1의자리숫자를 계속 더함
			num /= 10;
		}
		System.out.println(sum);
		
	}
	
	public void method3() {
		short s = 10;
		while(s>0) {
			System.out.println(s++);
		} // overflow 최댓값에서 1을 더한 순간 값이 최솟값으로 바뀐다.
		// underflow 0에서 1을 뺐더니 255가 되는 등의 버그
	}
	
	public void method1() {
		//while (조건식)
//		for(;true;) {} 이렇게 조건식을 쓰면 while문과 같다.
		int i = 0; // 초기화 식은 여기에 작성, 증감식은 내부에 i++로 작성. 
		while(i<10) { // (true)자리에 (i<10) 쓰면 for문과 동일함
			System.out.println("실행");
			i++;
		}
	}
	
	public void method2() {
		String menu = "";
		menu += "1. 아메리카노(2000)\n";
		menu += "2. 딸기에이드(3000)\n";
		menu += "3. 종료";
		
		int sum = 0;
		while(true) {
			System.out.println(menu);
			int sel = sc.nextInt();
			if(sel == 1) sum += 2000;
			if(sel == 2) sum += 3000;
			if(sel == 3) break;
		}
		System.out.println("총 결제 금액은: " + sum);
		
	}
}
