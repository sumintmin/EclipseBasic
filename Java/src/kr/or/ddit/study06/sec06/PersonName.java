package kr.or.ddit.study06.sec06;

public class PersonName {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("박광제");
		p1.setAge(20);
		
		
		System.out.println(p1.getName() + "," + p1.getAge());
		// 입력은 set 갖고올땐 get
		
		Person p2 = new Person();
		
		int age = -10;
//		if(age<0) {
//			System.out.println("음수는 입력할 수 없답니다^^");
//			
//		} 이거 그대로 복사해서 person클래스에 setname에 복붙
//		p2.age = -10;을 막을 순 없으셈
		// getter setter 로 출력받는게 좋고
		// 필드에 직접대고 값 입력받는건 좋지 않다.
		
		String str = "abcd";
		str.length(); // 필드가 아니라 메소드로 준다.
		
//		p2.age = -10;
		p2.setAge(age);
		p2.setName("박진우");
		
		
		
		
		
	}

}

