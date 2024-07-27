package kr.or.ddit.homework;

import java.util.Calendar;

import kr.or.ddit.util.ScanUtil;

public class Homework16_1 {
	public static void main(String[] args) {
		Homework16_1 obj = new Homework16_1();
		obj.process();
	}
	
	public void process() {
		// 달력 만들기
		// 	 1 2 3 4 5 6
		// 7 8 9 ...
		
		// 		31
		// < 이전달 다음달 >

		CalendarMaking ca = new CalendarMaking();
		String sel = ScanUtil.nextLine("이번달 달력을 보시겠습니까? (y/n)");
		sel = sel.toUpperCase();
		while(true) {
			
			ca.printCalendar(sel);
		}
		
		
		
	}
}

class CalendarMaking{
	
	Calendar cal = Calendar.getInstance();
	cal.set(Calendar.DATE, 1);
	
	int currentmonth = (cal.get(Calendar.MONTH) + 1);
	int currentyear = (cal.get(Calendar.YEAR) + 1);
		
	
	int month = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	
	
	
	public void printCalendar(String sel) {
		

		System.out.printf("\t\t%d년 %d월 \n",currentyear, currentmonth);
		System.out.println("=================================================Ꙭ̮");
		System.out.println("sun\tmon\ttue\twed\tthu\tfri\tsat");
		System.out.println("ʕتʔ=================================================");
		for(int i = 1; i<= month; i++) {
			int week = cal.get(Calendar.DAY_OF_WEEK);
			if(i == 1 && week!= 1) System.out.print("\t");
			System.out.print(i + "\t");
			if(week == 7) System.out.println();
			cal.add(Calendar.DATE, 1);
			}
		
		System.out.println();
		sel = ScanUtil.nextLine("< : 이전달 >: 다음달");
		if(sel.equals("<")) {
			currentmonth -=1;
			
		}

	}
	
	public months(){
		int month;
	}
}












////////////////////////////////////////////////////////////////


//int c_month = 0;
//c_month += 1;
//cal.add(Calendar.MONTH, c_month);

//cal.add(Calendar.MONTH, 2);
int year = cal.get(Calendar.YEAR);
int month = cal.get(Calendar.MONTH)+1;
int date = cal.get(Calendar.DATE);
int day_of = cal.get(Calendar.DAY_OF_MONTH);
int day_of_max = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
System.out.println(year + "년 " + month + "월 " +date +"일" );
System.out.println("day_of_month와 date는 동일하다: "+ day_of);
System.out.println("day_of_week는 일마다 요일을 0~7로 표현:(목) " + day_of_week);
System.out.println(month + "월은 " + day_of_max + "일까지 있다.");

//cal.set(Calendar.DATE, 1);
//System.out.println(cal.(Calendar.DATE, 1));



/*	
//cal.add 함수를 사용하여 월별 +- 계산
// +- 계산을 위한 변수 선언 ( 0은 현재 값)
//int c_month = 2;
//c_month += 1;
//cal.add(Calendar.MONTH, c_month);
cal.add(Calendar.MONTH, 2);

// <나 >를 입력하면 c_month를 ++ -- 한다.
cal.add(Calendar.DATE, 1);
System.out.println("1차 출력 month " + Calendar.MONTH);
System.out.println("2차 출력 date " + Calendar.DATE);

int month = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
System.out.println("3차 출력 dayof" + month);

//System.out.println("\t\t%d년 %d월\n", currentyear, currentmonth);

System.out.println("sun\tmon\ttue\twed\tthu\tfri\tsat");
for (int i = 1; i <= month; i++) {
	int week = cal.get(Calendar.DAY_OF_WEEK);
	System.out.print(i + "\t");
	if(week == 7) System.out.println();
//	cal.add(Calendar.DATE, 1);
}

*/	

