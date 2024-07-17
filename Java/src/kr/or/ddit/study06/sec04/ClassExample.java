package kr.or.ddit.study06.sec04;

public class ClassExample {
	
	int field;
	
	public ClassExample() {
		
	}
	
	// alt shift s o
	// 생성자는 오버로딩을 지원한다.
	public ClassExample(int field) {
		super();
		this.field = field;
	}
	
	public void method1() {
		
	}
	
	// 메소드는 2가지가 전부다. return 타입, parameter
	// 소보루빵 만드는 과정을 알 필요는 없다...
	// 50라인정도가 적당함 (빨리 읽기)
	// 코드 타이핑은 20% 나머지 80%는 코드 리딩 
	
	public int method2() {
		
		return 0; // return 타입
	}
	
	public void method3(int a) {
		// int a : 파라미터 : 외부에서 주입하는 것
	}
	
	
	

}
