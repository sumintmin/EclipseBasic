package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
		method7();
	}
	
	public void method7() {
		END: // A나 B end 다 상관없음
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {
				if(i == 4) {  break END; // break end: end라는 반복문을 종료하겠다.
				System.out.println(j + ", " + i);
				}
			}
		}
	}
	
	
	public void method6() {
		for (int j = 0; j < 10; j++) {
			boolean chk = false;
			for (int i = 0; i < 10; i++) {
				if(i == 4) {
					chk = true;
					break;
				}
				System.out.println(j + ", " + i);
			}
			if (chk) break;
		}
	}
	
	public void method5() {
		// break,continue
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {
//				if (i == 2) continue;
				if (i == 4) break;
				System.out.println(j + ", " + i);
			
		}
			
//			System.out.println(i);
		}
	}
	
	
	public void method4() {
		// 입력한 숫자까지만 출력
		System.out.println("2~9 입력");
		int number = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
//				if (i >number) continue;
				System.out.printf("%d * %d = %d", i, j, i*j);
				System.out.println();
				// System.out.println(i + "*" + j + "=" + i * j);
			}
			if (i == number) break;
		}
	}
	
	
	
	public void method3() {
		System.out.println("2~9 입력");
		int number = sc.nextInt();
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i == number) continue;
				System.out.printf("%d * %d = %d \t", i, j, i*j);
				System.out.println();
			}
//			System.out.println();
		}
	}
	
	public void method2() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) continue;
			// continue 해당 루프 중지, 다음 루트 동작
			System.out.println(i);
		}
	}
	
	public void method1() {
		// 99단 출력하기
		for (int i = 1; i < 100; i++) {
			for (int j = 1; j < 100; j++) {
				System.out.printf("%d * %d = %d \t", i, j, i*j);
				System.out.println();
			}
			System.out.println();
		}
	}
	
}
