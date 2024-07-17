package kr.or.ddit.test;

class Parent {
	int x = 1000;
	
	Parent() {
		this(3000);
	}
	
	Parent(int x) {
		this.x = x;
	}
}

class Child extends Parent {
	int x = 4000;
	
	Child() {
		this(5000); // x = 5000;
	}
	
	Child(int x) { // 이부분이 obj.x로 값 받을 수 있는 부분이라
		this.x = x; // 여기 x는 다른 x고 이 부분 주석처리하면
		// x = (input x)
	}
	
	int getx() {
		return x;
	}
}

public class thisand {
	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(obj.getx());
		obj.x = 1; //여기가 실행이 안돼요
		System.out.println(obj.getx());
	}
}