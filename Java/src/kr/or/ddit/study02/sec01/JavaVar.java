package kr.or.ddit.study02.sec01;

public class JavaVar {
	// 변수는 하드디스크가 아니라 메모리라는 저장공간에 저장
	// 메모리 공간에 변수를 만듦. 메모리를 직접 불러올 수 없어서 이름을 붙이고 이름을 변수로 사용한다.
	public static void main(String[] args) {
		// 변수 선언
		// 방법1!!!!!!!!!!!!!!!!!!!
		// type 변수명;
//		int x;
//		int y;
		// (타입) 변수명;
		// 정수타입, 실수타입, 논리타입
//		방법2!!!!!!!!!!!!!!!11
//		int x, y; //한 번에 선언도 가능
//		
//		x = 10;
//		y = 15;
//		x = 20; // 변수는 값을 하나만 저장할 수 있기 때문에 최근 값이 저장된다!
//		방법 3!!!!!!!!!!!!
		int x = 10;
		int y = 11;
		System.out.println("Happy Java Class~ 2024-07-02");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("변수 선언에는 3가지 방법이 있다.\n int x, int y, int x,y int x= 10, int y = 10;");
	}
}
