package kr.or.ddit.homework;

import java.util.Calendar;

import kr.or.ddit.util.ScanUtil;

public class homework166666666 {

	public static void main(String[] args) {
		homework166666666 obj = new homework166666666();
		obj.process();

	}

	public void process() {
		
		
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day_of_max = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		cal.set(Calendar.DATE, 1);
		
		while(true) {
			
			System.out.printf("\t\t%d년 %d월 \n",year, month);
			System.out.println("====================================================");
			System.out.println("sun\tmon\ttue\twed\tthu\tfri\tsat");
			System.out.println("====================================================");
			
			for(int i = 1; i<= day_of_max; i++) {
				int week = cal.get(Calendar.DAY_OF_WEEK);
				if( i==1){
					for(int j = 0; j <6-(7-week) ; j++) {
						System.out.print("\t");}
				}
				System.out.print( i + "\t");
				if(week == 7) System.out.println();
				cal.add(Calendar.DATE, 1);
			}System.out.println();
			String sel = ScanUtil.nextLine("<: 이전달  다음달 : >");
			if(sel.equals("<")) {
				month -=1;
			}
			if(sel.equals("<")) {
				month +=1;
			}
		}
	}
}


////////////////////////////////
//달력 만들기
		// 	 1 2 3 4 5 6
		// 7 8 9 ...
		
		// 		31
		// < 이전달 다음달 >
		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.DATE, 1);
		int c_year = 0;
		int c_month = 0;
		
//		if(sel.equals(">")) {
//			c_month++;
//		}
//		if(sel.equals("<")) {
//			c_month--;
//		}
		cal.add(Calendar.YEAR, c_year);
		cal.add(Calendar.MONTH, c_month);
		int year = Calendar.YEAR;
		for(int i = 0; i < cal.get(Calendar.YEAR); i++) {
			System.out.println(i);
		}
//		System.out.println(year);
		
		System.out.println(Calendar.DATE);
		int month = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println(month); // 7월은 31일 까지 있다.
		int currentmonth = (cal.get(Calendar.MONTH) + 1);
		System.out.println();
		cal.add(Calendar.MONTH, 1);
		int currentyear = (cal.get(Calendar.YEAR) + 1);
//		System.out.println((cal.get(Calendar.MONTH) + 1 + "월"));// 월이 0부터 나오기 때문에 6을 출력한다(현재 7월)
			
		
		
		String sel = ScanUtil.nextLine("이번달 달력을 보시겠습니까? (y/n)");
		sel = sel.toUpperCase();
		while(true) {
			
			
			
			System.out.printf("\t\t%d년 %d월 \n",currentyear, currentmonth);
			System.out.println("====================================================");
			System.out.println("sun\tmon\ttue\twed\tthu\tfri\tsat");
			System.out.println("=================================================");
			for(int i = 1; i<= month; i++) {
				int week = cal.get(Calendar.DAY_OF_WEEK);
				System.out.print( i + "\t");
				if(week == 7) System.out.println();
				cal.add(Calendar.DATE, 1);
				}
			
			
			System.out.println();
			sel = ScanUtil.nextLine("< : 이전달 >: 다음달");
			if(sel.equals("<")) {
				currentmonth -=1;
				
			}
			
//			
			
		}
		
		
		
	}
}
//
//class CalendarMaking{
//	public void printCalendar(String sel) {
//		
//	}
//	
//	public months(){
//		int month;
//	}
//}


