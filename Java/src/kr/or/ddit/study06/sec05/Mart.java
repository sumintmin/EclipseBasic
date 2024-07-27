package kr.or.ddit.study06.sec05;

public class Mart {
	static int count = 0;
	
	public static void main(String[] args) {
		Mart mart = new Mart();
		System.out.println("고객 1");
		mart.sell();
		System.out.println("고객 2");
		Mart mart2 = new Mart();
		mart2.sell();
		System.out.println("고객 3");
		Mart mart3 = new Mart();
		mart3.sell(); // 해도 static이라 적용됨
		System.out.println("고객 4");
		Mart mart4 = new Mart();
		mart4.sell(); // 고객4에는 적용이 안돼? count 해서 3번까지만 서비스를 증정하기로 했으니까..
	}
	
	public void sell() {
		System.out.println("상품을 판매합니다.");
		if(count++<3) {
			System.out.println("서비스를 증정합니다.");
		}
	}
	
}
