package kr.or.ddit.study06.sec03;

public class PeopleMain {
	public static void main(String[] args) {
		People p = new People("육수민", 25);
		People p2 = new People("hello", 23);
		System.out.println(p.name +" " + p.age);
		System.out.println(p2.name +" " + p2.age);
	}
}
