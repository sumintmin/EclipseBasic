package kr.or.ddit.test;

class Person{
	String name;
	
	
//	public Person() {}
//	
	
	public Person(String theName) {
		this.name = theName;
	}
}

class Employee extends Person{
	String id;
//	public Employee() {super();
//	
//	}
	public Employee(String name, String id) {
		super(name);
		this.id = id;
		System.out.println();
	}
	@Override
	// 컴파일러가 부모클래스에서 이름 동일여부확인후 오류 판정, 없으면 오류체크 불가
	// 오버라이드: 부모클래스 재정의
	// 메소드 오버라이딩: 자신의 필요에 맞추어 재정의
	// 				상속 관계에서 정의(부모클래스 -> 자식클래스)
	public String toString() {
		return "Employee [id=" + id + " name ="+name+"]";
	}
	
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee("kim", "20210001");
		System.out.println(e);
	}

};
