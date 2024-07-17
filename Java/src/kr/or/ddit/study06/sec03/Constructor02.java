package kr.or.ddit.study06.sec03;

public class Constructor02 {
	
	// 생성자 오버로딩 // 파라미터에 따라 호출되는 생성자가 다르다
	// 파라미터가 같으면 같은 생성자가 호출된다. 변수이름만 바꿔도 어림도없지~
	// 파라미터 값에 따라 호출되는 생성자가 다르다.
	
	// 스트링과 int 는 순서 바꾸면 다른 생성자로 사용 가능하다~
	
	public Constructor02() {
		System.out.println("기본 생성자");
	}
	
	public Constructor02(String a) {
		System.out.println("생성자1 String a");
	}
	
	public Constructor02(String a, String b) {
		System.out.println("생성자2 String b");
	}
	
	public Constructor02(String a, int b) {
		System.out.println("생성자3 String a, int b");
	}
	
	public Constructor02(int b, String a) {
		System.out.println("생성자4 int b, String a");
	}
	
	
}
