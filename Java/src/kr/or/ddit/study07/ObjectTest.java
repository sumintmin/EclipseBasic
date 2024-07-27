package kr.or.ddit.study07;

public class ObjectTest {
	// Object
	// 모든 클래스의 최상위 클래스
	// ctrl space 기본으로 제공하는 메소드 재정의(오버라이드) 4가지
	
	// @Override 부모에서 만든 메소드 재정의
	// 오버라이딩과 오버로딩의 차이점
	// 오버로딩 파라미터에 따라 호출되는 메소드, 생성자가 달라짐
	// 메소드와 필드를 부모에서 받아올 수 있다.
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
