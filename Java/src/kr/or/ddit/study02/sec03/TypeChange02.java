package kr.or.ddit.study02.sec03;

public class TypeChange02 {
	public static void main(String[] args) {
		// byte < short < int < long < float < double < String
		
		// 강제 타입 변환
		// type1 변수명 = (type1)type2
		
		// int -> short
		int   i1 = 10;
		short s1 = (short)i1;
		System.out.println(i1+ s1);
		
		
		// int -> byte
		int  i2 = 10;
		byte b2 = (byte)i2;
		System.out.println(i2+ b2);
		
		// long -> int
		long l3 = 10;
		int  i3 = (int)l3;
		System.out.println(l3+ 13);
		
		// double -> int
		double d4 = 10.4;
		int	 i4   = (int)d4;
		System.out.println(d4+ i4);
		
		// int -> char
		char c5 = 'b'; // 대문자 A로 바꿔서 c6에 저장
		char c6 = (char)(c5-32);
//		char c7 = c6;
		System.out.println(c5 + " -> "+c6);
		
		//
		
		char c7 = 'D'; // 소문자로 바꿔서 출력
		char c8 = (char)(c7+32);
		System.out.println(c7 + " -> " + c8);
		
	}
}
