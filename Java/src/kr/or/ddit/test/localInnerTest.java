package kr.or.ddit.test;

class localInner {
	private int data = 30; // 인스턴스 변수
	
	void display() {
		final String msg = "현재의 데이터 값은 ";
		
		class Local{
			void printMsg() {
				System.out.println(msg + data);
			}
		}
		Local obj = new Local();
		obj.printMsg();
	}
}

public class localInnerTest{
	public static void main(String[] args) {
		localInner obj = new localInner();
		obj.display();
	}
}
