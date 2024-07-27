package kr.or.ddit.study06.sec05;

public class StaticExample {
	static int a; // 필드는 객체가 생성될 때 힙메모리에 생성된다.
	int b; // 
	// 힙에 지금 b, method1, method2가 만들어져있음
	// method영역에는 a, m3, m4가 있는데 객체 만들기와 상관없이 만들어지고 static은 바로 사용이 가능하다
	// static은 정적멤버
	// method1은 쓰려면 객체가 먼저 만들어져야한다.
	// static에서는 m1, m2를 불러올 수 없다.
	// static의 경우 힙에 객체가 하나 더 있다고 가정하고 어디 메소드1인지 확인이 불가해서
	// static에서는 instance 멤버를 불러올 수 없고 객체를 만들어서 불러올 수가 있따.
	// static에서 m3에서 b를 못불러온다.
	// m1에서는 m3을 부르는게 가능하다.
	// 클래스 만들어지는 것과 상관없이 만들어지는 것을 static이라고 함
	// static은 붕어빵 사장님의 전화번호
	// 전화번호는 붕어빵 붓는거랑 상관없이 전번은 있음. 그게 static 
	// static은 고유값. int b를 쓰려면 붕어빵을 구워야겠으나
	// 굽기와 상관없이 ...
	// m1에서는 m3을 불러올 수가 있따.?
	// 하나밖에 없기에 접근이 가능하다?
	// 교무실은 하나밖에 존재하지 않는 영역이기에 메소드 영역이다.
	// 반에 가서갖다주세요 하면 어디반인지 모름. 지정을 해야 갖고올 수 있다.
	// 교무실에서 갖고오세요 하면 딱 갖고올 수 있다.
	// 객체 만들어지는 경우 상관없는 경우가 static이다. 
	// static을 붙이면 정적멤버가 된다.
	// 클래스 영역은 아니고 메소드 영역이라고 한다.
	
	// main함수에서 static
	// cal 클래스 만들자마자 올라가서 만듦?
	// static에서는 반드시 객체를 만들어야 메소드 접근이 된다!! new cal();
	
	// static은 언제 쓰는걸까?
	
	public void method1() {
		
	}
	
	public void method2() {
		
	}
	
	public static void method3() {
		
	}
	
	public static void method4() {
		
	}
	
	
}
