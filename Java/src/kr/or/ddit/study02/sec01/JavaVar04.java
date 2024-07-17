package kr.or.ddit.study02.sec01;

public class JavaVar04 {
	
	int a;
	int b;
	
	public void method1() {
		int c;
		// abc //아직 e를 사용 불가능함
		if (1 == 1) {
			int d;
			// abcd 사용 가능
		}
		int d;
		int e; 
		// abc e 사용 가능, d는 블럭이 종료되어 사라짐... 잘가 안녕... 그래서 새로 만들 수 있으나 이전 d와 지금 d는 
		// 메모리 위치도 다르고 전혀 다른 변수이다... 아예 사라졌기 때문이다...
	}
	
	public void method2() {
		int f; // ab f 까지. cde는 다른 블록이어서 없어진거다.. 이름이 같을 뿐 전혀 상관이 없다.?
		// 그럼 여기서 c d f 쓸 수 있는겨?
		int g;
	}
	// ab만 사용 가능.. 다른 변수는 블럭을 지나서 사용할 수 없음.
	// ctrl shift f 들여쓰기 정렬 자동으로 해줌 기억하기~
	
}
