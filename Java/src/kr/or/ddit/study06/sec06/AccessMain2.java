package kr.or.ddit.study06.sec06;
// 패키지 이름이 안맞으면 줄뜸
// f2키를 누르면  move가 됨
// 객체 생성에 에러가 나는데 ctrl shift o하면 import 로 
// 외부 클래스 기능을 갖고옴
import kr.or.ddit.study06.sec06.access.AccessTest;

public class AccessMain2 {
	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		at.method1();
		
		// protect의 경우에는 같은 패키지에서만 호출 가능
//		at.method2();
		
		// default 같은 패키지에서만 호출 가능
//		at.method3();
		
		// private 는 외부 클래스에서 호출 불가
//		at.method4();
		
		
	}
}
