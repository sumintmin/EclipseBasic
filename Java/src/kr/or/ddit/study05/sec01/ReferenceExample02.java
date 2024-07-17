package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceExample02 obj = new ReferenceExample02();
		obj.process();

	}

	public void process() {
		int a = 10; // stack에 저장
		
		if(a == 10) {
			int sum = 0; // stack에 저장
			//
			for(int i = 1; i < 2; i++) { // stack에 저장 
				// stack에 int i = 1저장
				sum += i; // sum값이 1로 업데이트 됨
				// stack에 i?
				// sum값이 3이 된다.
			}
			// i값이 삭제됨 --> 현재 stack 상태: int a = 10; int sum = 3; int b = 20;
			int b = 20;
			// 
			
			String str = "abc";
			// heap 영역: 10: Abc
			// String str = 주소값 10
			
			
		}
		// 다 삭제됨 --> 현재 stack상태: int a= 10; int sum = 0;
		int sum = 0;
		// 
		for(int i = 2; i<4; i++) {
			// stack에 i가 저장됨 -- > int i = 2;		int a = 10; int sum = 5 int i = 3이라고 쳐? ㅇㅎ 한줄실행
			sum +=i; 	// int i 값이 블럭을 벗어나며 i가 사라짐 sum은 안사라짐 
			// 
		}
//		int i = 2;
//		for (; i<4;i++) {sum+=i;} // 하면 i가 안사라짐
		String str2 = new String("abc");
		// 새로 생김
		String str3 = "def";
	}
}
