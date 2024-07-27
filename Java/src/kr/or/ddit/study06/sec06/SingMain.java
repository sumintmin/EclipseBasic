package kr.or.ddit.study06.sec06;

public class SingMain {

	public static void main(String[] args) {
//		Sing s = new Sing("아이들", "아픈건딱질색이니까~", 2024);
//		System.out.println(s.getSinger());
//		System.out.println(s.getLyrics());
//		System.out.println(s.getYear());
//		
//		Sing s2 = new Sing("나연", "ABCD", 2024);
//		System.out.println(s2.getSinger());
//		System.out.println(s2.getLyrics());
//		System.out.println(s2.getYear());
		
		Sing s1 = new Sing();
		s1.setSinger("가수");
		s1.setLyrics("가사");
		s1.setYear(2024);
		System.out.println(s1.getSinger() + ", " + s1.getLyrics() + ", " + s1.getYear());
		
		
	}
}
