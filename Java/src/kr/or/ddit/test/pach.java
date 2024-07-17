package kr.or.ddit.test;

class Base{
	public Base() {
		System.out.println("Base() 생성자");
	}
};

class Derived extends Base{
	public Derived() {
//		super();
		System.out.println("Derived() 생성자");
	}
}

// this: 현재 자신이 속한 객체의 지시자
// this(): 자신이 속한 객체의 생성자
//			- 매개변수/인수의 경우
//				생성자의 매개변수에 따라 해당되는 생성자 호출
//		생성자 오버로딩this(10); -> public myclass(int 	);
//					this(10,20) -> public myclass(inta, int b);

public class pach {
	
	public static void main(String[] args) {
//		this();
		Derived r = new Derived();
		
	}
}
