package kr.or.ddit.study06.sec05;

public class Student {

	static int year; // 모든 객체에 값이 전달되었다. 공통정보 변경 시 사용함
	String name;
	
	@Override
	public String toString() {
		return year + "년" + " 이름 : " + name;
	}
	
	
	
}
