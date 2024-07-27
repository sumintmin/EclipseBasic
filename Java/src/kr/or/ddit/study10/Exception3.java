package kr.or.ddit.study10;

import java.util.Scanner;

/*
 * throw	:	예외 강제 발생
 * 				- 일반 메소드 내부에서 사용
 * 				- 사용 형식
 * 				  throw 예외클래스 객체명
 * 					-> IOException io = new IOException();
 * 						ex) throw new Exception();
 * 							throw IOException();
 */
public class Exception3 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Exception3 obj = new Exception3();
		obj.process();

	}

	public void process() {
//		getNum(); // 위로 던지거나 try로 감싸거나
		while(true) {
			try {
				getNum();
			} catch (Exception e) {
				System.out.println("0보다 큰 수를 입력하세요..");
			}
		}
//		getNum(); // 빨간줄. 컴파일러에서 체크한걸 일반 예외라고 한다. 
		// 그냥 쓰면 에러나니까 try catch while문에 넣어준다.
	}
	
	public int getNum() throws Exception { // throw 된 친구는 예외처리를 반드시 해주어야 한다.
		int num = sc.nextInt();
		if(num < 0) {
			throw new Exception(); // 빨간줄에 exception에 커서 놓고 add throw 어쩌고 선택 하면
			// getNum()옆에 throws Exception 뜸
		}
		return num;
	}

}
