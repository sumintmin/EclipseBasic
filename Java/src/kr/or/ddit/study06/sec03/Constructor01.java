package kr.or.ddit.study06.sec03;

public class Constructor01 {
	String field1;
	int field2;
	
	// 기본 생성자
	// 기본 생성자는 생성자가 없다면 자동으로 만들어지지만
	//          다른 생성자가 있다면 만들어지지 자동으로 만들어지지 않음
	public Constructor01() {
		
	}
	
	
	//						파라미터, 매개변수
	public Constructor01(String field1, int field2) {
//		public Constructor01(String a, int field2) {
		this.field1 = field1;
//		field1 = a; // 나중에 보면 헷갈리기 때문에 this를 씀
		this.field2 = field2;
	}// ctrl키를 누르고 각 field1를 누르면 각각 어딜 가리키는지 알 수 있음;
	// this.field1은 위에 field1은 바로위에
	
	
}
