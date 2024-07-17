package kr.or.ddit.study06.sec02;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	
	int sum;
	double avg;

	// alt shift s   -> generate toString
	// 내가 원하는대로 텍스트 수정해도 됨
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg="
				+ avg + "]";
	}
	
	
	// 클래스 - 필드 만들기 - 객체 만들어서 공간확보하고 
	
	// 담넷 - c언어 개발 웹페이지
	// 
}
