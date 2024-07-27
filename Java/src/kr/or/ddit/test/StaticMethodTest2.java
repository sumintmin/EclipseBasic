package kr.or.ddit.test;

interface Employable {
	String getName();
	
	static boolean isEmpty(String str) {
		if(str == null || str.trim().length() == 0) {
			return true;
		}else {
			return false;
		}
	}
}

class Employee implements Employable{
	private String name;
	
	public Employee(String name) {
		if(Employable.isEmpty(name) == true)
			throw new RuntimeException("이름은 반드시 입력하여야 함!");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {return this.name;}
}

public class StaticMethodTest2{
	public static void main(String[] args) {
		Employable employee1 = new Employee("홍길동");
		// Employable employee2 = new Employee("");
	}
}

// 팩토리 메소드 : 공장처럼 객체를 생성하는 정적 메소드.. 
// 디자인 패턴의 하나로서 객체를 만드는 부분을 부모 클래스에 위임하는 패턴.
// 팩토리 메소드 이름으로 많이 사용되는 것은 getInstance()이다.