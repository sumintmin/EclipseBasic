package kr.or.ddit.study07;

public class SuperObject {
	int field1; // 안붙이면 default 권한 상속 ㅇ
	
//	private int field1; // private x
//	protected int field1; // protected o
	
	public void method1() {
		System.out.println("부모 메소드");
	}
	
	SuperObject(int field1){
		this.field1 = field1;
	}

}
