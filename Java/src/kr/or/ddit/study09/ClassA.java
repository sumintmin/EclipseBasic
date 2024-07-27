package kr.or.ddit.study09;
// 중첩 클래스의 사용을 보여준다.
// classA는 메인클래스이며 main메소드
// classB cb = new ClassA().new classB() a의 인스턴스로 b의 인스턴스 생성
// new classA.b구문으로 내부 클래스 인스턴스 생성
// cb.b = 10; 이 코드는 인스턴스 b 필드 값을 10으로 설정합니다.
// c cc = new classA().classC() 클래스 a의 중첩크
public class ClassA {
	public static void main(String[] args) {
		//ClassB 필드 b에 값 10 넣기
		ClassB cb = new ClassA().new ClassB();
		cb.b = 10;
		
		ClassC cc = new ClassA.ClassC();
		cc.c = 20;
		
		// ClassC 필드 c에 값 20 넣기
	}
	
	class ClassB{
		int b;
	}
	
	static class ClassC{
		int c;
	}

}
