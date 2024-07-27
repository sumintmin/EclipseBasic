package kr.or.ddit.study06.sec06;

public class Person {
	private String name;
	private int age;
	
	
	// getter/setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(age<0) {
			System.out.println("음수는 입력할 수 없답니다^^");
			
		}
//		this.name = name;
		
	}
	
	
	// 데이터는 현재 int타입이므로 int 적어주고
	// 데이터 가져간다 해서 get이고 
	// age붙이는데 소문자가 아니라 get이 있으므로
	// Age 이렇게 시작한다.
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
