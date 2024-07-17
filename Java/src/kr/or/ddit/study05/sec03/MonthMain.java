package kr.or.ddit.study05.sec03;

import java.util.Scanner;

public class MonthMain {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MonthMain obj = new MonthMain();
		obj.process();

	}

	public void process() {
		// 1~12월에 해당하는 enum을 만들고
		// 출력하시오
		// ex) month(Month.JAN)	 -> 1월;
		
		month(Month.JAN);
		
	}
	
	public void month(Month month) {
		System.out.println(month.num);
//		if(month == Month.JAN)System.out.println("1월");
//		if(month == Month.FEB)System.out.println("2월");
//		if(month == Month.MAR)System.out.println("3월");
//		if(month == Month.APR)System.out.println("4월");
//		if(month == Month.MAY)System.out.println("5월");
//		if(month == Month.JUN)System.out.println("6월");
//		if(month == Month.JUL)System.out.println("7월");
//		if(month == Month.AUG)System.out.println("8월");
//		if(month == Month.SEP)System.out.println("9월");
//		if(month == Month.OCT)System.out.println("10월");
//		if(month == Month.NOV)System.out.println("11월");
//		if(month == Month.DEC)System.out.println("12월");
	}
}
