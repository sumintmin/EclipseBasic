package kr.or.ddit.test;

public class NestedClass {
	class B{
		B(){} // 생성자
		int field1; // 인스턴스 필드
		// static int field2; // 정적필드 x
		void method1() {} // 인스턴스 메소드
		// static void method2(){} // 정적메소드x
	}
	
	void methodA() {
		B b = new B();
		b.field1 = 3;
		b.method1();
	}
	
	A a = new A();
	A.B b = a.new B();
	b.field1 = 3;
	b.method1();
}
