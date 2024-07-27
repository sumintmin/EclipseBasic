package kr.or.ddit.study06.sec06;

public class Point {
	private int x; // 입력을 막을것임
	private int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	// setx 없는 이유는 입력을 원치 않기 때문이다.
	// x y 수정하고 싶지 않기 때문이다.
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	

	

}
