package kr.or.ddit.study06.sec05;

public class StudentMain {
	public static void main(String[] args) {
		
		//클래스 객체 만들 필요가 없어서 바로 쓸 수 있다.
		Student.year = 2023;
		
		Student s1 = new Student();
		s1.name = "양소현";
		
		Student s2 = new Student();
		s2.name = "육수민";
		
		System.out.println(s1);
		System.out.println(s2);
		Student.year++;
		System.out.println(s1);
		System.out.println(s2);
		// 가비지컬렉터 대상이 아니라 너무 많이 쓰면 느려지니 주의!
	}
}
