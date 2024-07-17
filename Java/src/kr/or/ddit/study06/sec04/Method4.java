package kr.or.ddit.study06.sec04;

public class Method4 {
	int a;
	int b;
	
	
	// 메소드에서 필드로 접근이 가능하다. 메소드를 만들면 필드도 같이 만들어진다? a,b값 호출할 수 있다.
	public void method1() {
		System.out.println("a : " + a);
		System.out.println("method1");
		method2();
		Cal2 cal = new Cal2();
		cal.method1(a, b);
		// 메모리랑 같이 이해를 하자
		// 클래스의 구성요소: 필드 생성자 메소드
		
		
	}
	
	public void method2() {
		System.out.println("method2");
	}
}
