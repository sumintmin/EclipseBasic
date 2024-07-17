package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class StringTest {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StringTest obj = new StringTest();
		obj.process();

	}

	public void process() {
		method1();
	}
	
	public void method1() {
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "강감찬";
		String s4 = new String("강감찬");
		String s5 = new String("강감찬");
		// new하면 강감찬을 새로 만들음
		// stack에서는  heap에서  갖고옴
		// 주소값 비교, ==은 stack에 있는 값 비교
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s4 == s5);
		
		//그래서 string은 ==이 아니라 equals로 비교해야함
		if(s3.contentEquals(s4)) {
			System.out.println("같은 값");
		}
	}
}
