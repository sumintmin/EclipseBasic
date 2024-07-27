package kr.or.ddit.study06.sec06.access;

public class AccessMain1 {
	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		at.method1();
		at.method2();
		at.method3();
		// private 는 외부 클래스에서 호출 불가
//		at.method4();
	}
}
