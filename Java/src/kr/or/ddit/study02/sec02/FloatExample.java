package kr.or.ddit.study02.sec02;

public class FloatExample {
	public static void main(String[] args) {
		// float	:	4byte
		//				(부호1bit, 지수 8bit, 가수 23bit)
		//				F, f 뒤에 붙인다.
		// double	:	8byte
		//				(부호 1bit, 지수 8bit, 가수 52bit)
		//				실수 기본 타입
		
		// 고정 표기법 부동 표기법
		
		// 1 -> 0.9999999999
		
		float f1 = 3.141592f;
		double d1 = 3.141592;
		
		if(f1 == d1) {
			System.out.println("같은 값");
		}
		else {
			System.out.println("다른 값");
		}
		
	}
}
