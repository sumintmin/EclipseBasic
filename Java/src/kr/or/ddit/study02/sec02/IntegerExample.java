package kr.or.ddit.study02.sec02;

public class IntegerExample {
	public static void main(String[] args) {
		// 정수형
		// 1. byte   : 1byte(-128 ~ 127)
		// 2. short	 : 2byte(-32768 ~ 32767)
		// 3. int	 : 4byte(-2^31 ~ 2^31-1)	정수 기본형
		// 4. long   : 8byte(-2^63 ~ 2^63-1)	뒤에 L, l
		
		byte b1 = 127;
		System.out.println("b1 = " + b1);
		
		// byte 사용 범위를 벗어난 경우 컴파일 에러 발생
//		byte b2 = 128;
		short s1 = 100;
		System.out.println("s1 = " + s1);
		short s2 = (short)(s1 + 10); // 왜 빨간줄이 떴을까? 
		// 큰 대야의 물을 작은 대야에 담을 수 있을까? 
		
		int i1 = 100;
		System.out.println("i1 = " + i1);
		int i2 = i1 + 10;
		System.out.println("i2 = " + i2);
		// 굳이 타입 변환할 필요가 없다.. short는 매번 더할 때마다 하면 돼~ 기본 데이터가 int니까...
		
		long l1 = 100;
		System.out.println("l1 = " + l1);
		long l2 = l1 + 10;
		System.out.println("l2 = " + l2);
		
//		long l3 = 10000000000000000;
		long l3 = 10000000000000000L;
		// long타입 안벗어났는데 int타입 범위를 벗어났기 때문에 숫자처럼 사용할 수 없다.
		// 맨 뒤에 long타입인걸 알려줘야함
		// L이나 l을 붙여주면 됨. 
		
		int var1 = 200;
		
		// 8진법 -> 0~7을 사용하는 숫자체계
		// 앞에 0을 붙이면 8진법으로 인식한다.
		int var2 = 0200;
		
		// 16진법 -> 0~f까지 사용
		// ff는 16 * 15 + 15 = 255
		// 200 -> 16^2 * 2 = 256 * 2 = 512
		int var3 = 0x200;
		
		// 2진법 -> 0, 1 사용
		int var4 = 0b1011;
		
		System.out.println("(10진법) var1 = " + var1);
		System.out.println("(8진법)  var2 = " + var2);
		System.out.println("(16진법) var3 = " + var3);
		System.out.println("(2진법)  var4 = " + var4);
		
	}
}
