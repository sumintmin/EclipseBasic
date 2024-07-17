package kr.or.ddit.study06.sec03;

public class Student {
	
	String nation;
	String roomNo;
	String name;
	int age;
	
	public Student(String name, int age) {
//		nation = "한국"; // 얘네는 왜 this 안써 파라미터가 아니라서?
//		roomNo = "401호";
//		this.name = name;
//		this.age = age;
		// 한국을 고치려고 하면 연관된걸 다 바꿔야되니까 바꿔주자
		this("401호", name, age); // 기본값은 401호
		// 이 this 는 아래 생성자를 호출함
	}
	
	// 다른 호실 입력받기
	public Student(String roomNo, String name, int age) {
//		nation = "한국"; // 얘네는 왜 this 안써 파라미터가 아니라서?
//		this.roomNo = roomNo;
//		this.name = name;
//		this.age = age;
		// 이친구도 밑에친구 부를수가 있음
		this("대한민국", roomNo, name, age);
		// 하나만 바꿨는데 아래꺼도 같이 바겼어용 같이 적용된다
		// 한국 -> 대한민국
		// 이렇게 하면 코드가 줄어들어요 많이
		
	}
	
	
	// 실제로 입력되는 건 이쪽 (아래 코드)
	public Student(String nation, String roomNo, String name, int age) {
		this.nation = nation;
		this.roomNo = roomNo;
		this.name = name;
		this.age = age;
	}
// 오버로딩을 지원하는 이유는 이런 특이 케이스를 입력하기 위해 지원한다.
	// 필드값과 파라미터 변수가 같으면 헷갈리니까 this를 쓴다.
	
}
