package kr.or.ddit.study05.sec03;

import java.util.Scanner;
// document 주석 클래스에 대한 설명
/**
 * @since 24.07.17 
 * @version 1.00 -> 1.01 -> 1.02 => 2.00 버전이 크게 변함
 * @author PC-09 
 *
 */
public class WeekMain {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WeekMain obj = new WeekMain();
		obj.process();

	}

	public void process() {
		week("sunday");
		week(Week.SAT); // 주어진거만 선택하므로실수할 이유가 없다
		// 정확한 값을 입력하도록 실수를 최소화하는 구조
	}
	
	
	public void week(Week week) {
		if(week == Week.SUN)System.out.println("일요일"); 
		if(week == Week.MON)System.out.println("월요일"); 
		if(week == Week.TUE)System.out.println("화요일"); 
		if(week == Week.WED)System.out.println("수요일"); 
		if(week == Week.THU)System.out.println("목요일"); 
		if(week == Week.FRI)System.out.println("금요일"); 
		if(week == Week.SAT)System.out.println("토요일"); 
	}
	
	/**
	 * @param num 1 일요일 ~ 7 토요일
	 */
	public void week(int num) { // method에 갖다대고 alt shift j -> 주석이 나온다.. /* */ 범위주석 
//																			/**로 시작하는 요 주석은 document주석
//		week ctrl space시 주석이 설명란에 나옴
		// 1 월요일 6일때는 토요일 출력
		if (num == 1) System.out.println("일요일");
		if (num == 2) System.out.println("월요일");
		if (num == 3) System.out.println("화요일");
		if (num == 4) System.out.println("수요일");
		if (num == 5) System.out.println("목요일");
		if (num == 6) System.out.println("금요일");
		if (num == 7) System.out.println("토요일");
		
	}
	
	public void week(String day) {
		//1
		if (day.equals("sun")) System.out.println("일요일");
		if (day.equals("mon")) System.out.println("일요일");
		if (day.equals("tue")) System.out.println("일요일");
		if (day.equals("wed")) System.out.println("일요일");
		if (day.equals("thu")) System.out.println("일요일");
		if (day.equals("fri")) System.out.println("일요일");
		if (day.equals("sat")) System.out.println("일요일");
		}
	
//	 enum은 개발자에게 이렇게 써라를 유도할 때 쓴다.

	
	
}
