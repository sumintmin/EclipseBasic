package kr.or.ddit.study06.sec03;

public class TvMain {
	public static void main(String[] args) {
		// 생성자를 만들어서 기본생성자가 안만들어진다.!!
		// Tv tv = new Tv();
		
		
		// 요로케 값을 넣어주면 된다.
		Tv tv = new Tv("벽걸이티비", "삼성", 100);
		// name, company, size와 연결된다!
//		Tv t = new Tv("삼성", 100); 개수 안맞으면 에러남
//		tv.name = "벽걸이티비"; 이거보다 훨씬 간편함
		
		System.out.println(tv.name + " " + tv.company + " " + tv.size);
	}
}
