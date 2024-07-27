package kr.or.ddit.study06.sec06;

public class Sing {
	// 가수, 가사, 연도
	private String singer;
	private String lyrics;
	private int year;
	// SingMain에서 2개 생성하고 출력해보기
	
	// toString 사용하지 말고 getter 이용해볼것
	
//	public Sing(String singer, String lyrics, int year) {
//		this.singer = singer;
//		this.lyrics = lyrics;
//		this.year = year;
//	}
	
	
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	public String getSinger() {
		return singer;
	}
	public String getLyrics() {
		return lyrics;
	}
	public int getYear() {
		return year;
	}
	
	
	

}
