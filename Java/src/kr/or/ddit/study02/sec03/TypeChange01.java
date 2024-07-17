package kr.or.ddit.study02.sec03;

public class TypeChange01 {
	public static void main(String[] args) {
		// 타입별 크기
		// byte < short < int < long < float < double < String
		// 		  char	< int < long < ...
		
		
		// 자동 타입 변환
		// 작은 타입 값 -> 큰 타입으로 자동으로 변경됨
		
		// byte -> int
		
		byte b1 = 10;
		int  i1 = b1;
		// (int) 안적어도 자동으로 타입 적어줌
		
		// byte -> short
		
		byte  b2 = 11;
		short s2 = b2;
		
		// byte -> char 자동 타입 변환 x ( 반대도 지원 안됨)
		// char -> int  
		char c3 = 'a';
		int  i3 = c3;
		
		
		// 자동형변환 <-> 강제형변환
		
		
	}
}
