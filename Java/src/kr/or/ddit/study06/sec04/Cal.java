package kr.or.ddit.study06.sec04;

public class Cal {
	// 파라미터 int a, b 넣어주고 a + b 값을 출력
	// 파라미터 int a, b 넣어주고 a - b 값을 출력
	// 파라미터 int a, b 넣어주고 a * b 값을 출력
	// 파라미터 int a, b 넣어주고 a / b 값을 출력
	
	
	// 메소드 이름 규칙 = 변수명 규칙
	// 괄호 열고 파라미터 int a int  b~ 
	// 메소드는 중괄호로 시작 끝 지점 지정
	// 메소드 = 일을 시킨다. 일을 하려면 재료를 줘야함,. 재료를 외부에서 주는 것 = 파라미터
	// 10이라는 값이 내려온다ㅣ. 10 + 17이라는 결과값을 얻었다.
	// 이게 파라미터다
	public static void main(String[] args) {
		Cal c = new Cal();
		c.method1(10, 20);
		c.method2(10, 20);
		c.method3(10, 20);
		c.method4(10, 20);
	}
	
	public void method1(int a, int b) {
		System.out.println(a + b);
	}
	public void method2(int a, int b) {
		System.out.println(a - b);
	}
	public void method3(int a, int b) {
		System.out.println(a * b);
	}
	public void method4(int a, int b) {
		System.out.println(a / b);
	}

}
