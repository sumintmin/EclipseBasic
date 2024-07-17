package kr.or.ddit.homework;

import java.util.Date;
// import 모든 자바 클래스 갖고올 수 없으니 필요한 클래스만 갖고 온다.

public class HomeWork01 {
	public static void main(String[] args) {
		
		// ctrl + shift + o
		Date date = new Date();
		
		long time_ = date.getTime();
		long time = time_/1000;
		
		//1970년도 1월 1일 00시부터 지난 시간
		System.out.println(time);
		// 1초 = 1000ms
		// 10초 = 10000
		
		//1970년도부터 지금까지 몇 년 지났는지 출력하기
		// 54년 200일 5시간 40분 40초 지났습니다. 출력
		
		
		int year_sec	= 31536000;
//		int month_sec	= 2592000;
		int day_sec		= 86400;
		int hour_sec	= 3600;
		int min_sec		= 60;
//		System.out.println(year_sec);
//		print(month_sec);
		
		int min_s = 
		
		System.out.println("year_s "+year_s);
		int year 	= (int)time/year_sec;
		int day		= (int)(time%year_sec) / day_sec;
		int hour	= (int)((time%year_sec) % day_sec) / hour_sec;
		int min		= (int)(((time%year_sec) % day_sec) % hour_sec) / min_sec;
		int sec		= (int)(((time%year_sec) % day_sec) % hour_sec) % min_sec;
		
		System.out.println(year + "년 " + day + "일 " +hour+ "시간  " +min+ "분 " + sec +"초 지났습니다.");
	
		
		
		
		
		
		
		
		
		
		
	}
}
