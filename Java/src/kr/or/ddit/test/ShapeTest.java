package kr.or.ddit.test;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
	System.out.println("Circle을 그립니다.");
	}
}

class Rectangle extends Shape{
//	@Override // 어노테이션의 용도: 부모 클래스에 그런 이름이 없다면 컴파일러 오류를 발생시킨다.
//	public void draw() {
//		System.out.println("Triangle을 그립니다.");
//	}
}

public class ShapeTest {
	public static void main(String[] args) {
		Rectangle s = new Rectangle();
		s.draw();
		Circle c = new Circle();
		c.draw();
	}
}
