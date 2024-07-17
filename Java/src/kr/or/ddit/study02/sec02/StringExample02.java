package kr.or.ddit.study02.sec02;

public class StringExample02 {
	public static void main(String[] args) {
		// 제어문자 
		// 인쇄할 수 없거나 키보드로 표현할 수 없는 특별한 문자를 가리키며
		// 역슬래시(\)와 한개의 문자와 결합하여 작성
		
		//		\n		: 개행 문자
		// 		\r		: 개행 문자
		// 		\r\n	: 개행 문자						//한 세트로 한 줄 이동 ( 두 줄 이동 아님! )	//\n\r은 두 줄 이동이다.
		// 		\t		: 수평 탭 스크린 커서를 다음 탭으로 옮김
		// 		\\		: 역슬래시를 출력
		// 		\"		: 큰따옴표를 출력
		
		String str = "가\\\t\r\t나";
		System.out.println(str);
		
		//"401"호 양형운
		System.out.println("\"401\"호\t\"양형운\"");
	}

}
