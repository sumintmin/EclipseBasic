package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceExample01 obj = new ReferenceExample01();
		obj.process();

	}

	public void process() {
		int a = 10;
		
		if(a == 10) {
			int b = 15; // stack에 저장
			
			String str = "abc";
			
			String str2 = new String("abc");
			
			if(str == str2) { // 1과 2가 다르므로 실행되지 않아 아무일도 일어나지 않음.
				int c = 20;
				String str3 = "def"; // int c string str3 둘 다 실행 안됨
			}else{						// else는
				String test = "test";	// stack에서 사라진다. 변수는 남아있다?
			}String str4 = "def"; 	// 
			int d = 30;
			
	
		}
		int d  = 30;
	
	}
	int e = 50;
	

String test1 = "test";



}



// stack -> a = 10; int b = 15;String str = 주소값:10;
// String str2 = 주소값 : 20, String test = 주소값: 30
//	String s4 = 주소값: 40 	int d = 30 --> a는 두고 블럭이 끝나서 사라진다.


// stack -> int a = 10; int e = 50; String test 1 = 주소값 30;
// 
// heap ==> 10: abc, 20:abc , 30: test 40: def
