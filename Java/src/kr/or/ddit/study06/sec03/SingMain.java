package kr.or.ddit.study06.sec03;

public class SingMain {
	public static void main(String[] args) {
		Sing s1 = new Sing("아딱질", "아픈건딱질색이니까", "idle");
		System.out.println(s1.title + " " + s1.lyrics + " " + s1.singer);
		
		Sing s2 = new Sing("supernova", "susususupernova" , "aespa");
		System.out.println(s2.title + " " + s2.lyrics + " " + s2.singer);
		
		Sing s3 = new Sing("생성자가 뭐야", "이게 뭐야", "몰라");
		System.out.println(s3.title + " "+ s3.lyrics+ " " + s3.singer);
	
	}

}
