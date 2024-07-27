package kr.or.ddit.study07.star;

public class Juggling extends Unit{
	@Override
	public void move() {
		System.out.println("지상 이동");
	}
	
	public void attack() {
		System.out.println("초당 2번 공격");
	}

}
