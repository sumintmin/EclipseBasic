package kr.or.ddit.study02.sec02;

public class CharExample {
	public static void main(String[] args) {
		// chat
		// 부호 없는 2byte 정수 (0~65535)
		
		char c1 = 65;
		char c2 = 66;
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);

		//6566은 안되니까.. 문자는 하나만 사용할 수 있다. 'ab'이런거 안됨
		// 문자는 하나만 저장 가능
		// ''로 감싸 표시한다.
		
		char c3 = 'a'; // 큰 따옴표가 아닌 작은 따옴표로 표시
		System.out.println("c3 = " + c3);
		
//		char c4 = c1 + 1;
		// 정수형 기본 더하기는 int이므로 char는 2바이트 int는 4바이트 작은데 못담으니까 강제형변환
		
		char c4 = (char)(c2 + 1); // int타입으로 바뀌니까 업캐스팅? 다운캐스팅? 강제형변환은 업캐스팅
		System.out.println("c4 = " + c4);
		
		// 번호 찾기
		char c5 = '가';
		System.out.println("c5 = " + c5);
		System.out.println(c5 + 0); // 숫자를 더해버리면 int 타입으로 바뀌니까 숫자를 찾을 수 있다.
		char c6 = 44032;
		System.out.println(c6);
		char c7 = 0777;
		System.out.println(c7);
		
		
		
	}
}
