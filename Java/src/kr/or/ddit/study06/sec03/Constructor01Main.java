package kr.or.ddit.study06.sec03;

public class Constructor01Main {
	public static void main(String[] args) {
		
		
		// 					기본 생성자
		Constructor01 c = new Constructor01();
		
		// 클래스 생성 방법 -> new 클래스이름()
		
		Constructor01 c2 = new Constructor01("필드1", 2);
		// 이 값이 constructor01로 이동함
		System.out.println(c2.field1+", " + c2.field2);
		
	}
}
