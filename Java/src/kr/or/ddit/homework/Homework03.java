package kr.or.ddit.homework;

import java.util.Scanner;

public class Homework03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework03 obj = new Homework03();
		obj.process();

	}

	public void process() {
		method1();
//		method2();
	}
	
	public void method2() {
		// 윤년 구하기
		// 4년마다 윤년 1992년 1996년
		// 100년마다 윤년이 아님 1900년도 1800년도
		// 400년마다는 윤년 2000년 1600년 1200년
		
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
// [[ 깔끔하게 코드 작성하기 ]] 요새는 속도가 빠르기 때문에 보기 좋게 작성하는게 더 중요함!
//		boolean fourhund = year%400 == 0;
//		boolean hund = year%100!=0;
//		boolean four = year%4 == 0;
//		if (fourhund || (four && !hund)) {
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) {
			//((year % 400 || (year%4==0 && year % 100 != 0)){
			System.out.println("윤년입니다.");
		}
		else {
			System.out.println("평년입니다.");
		}
		
	}
	
	public void method1() {
		// 1~50 사이 숫자를 맞추는 게임을 완성하시오 
		
//		double r = Math.random();
//		System.out.println(r);
		
		int ran = (int)(Math.random() * 50) + 1;
//		System.out.println(ran);
				
		int cnt = 0;
		
		System.out.println("숫자를 입력하세요 ");
		int ans = sc.nextInt();
		
		while(true) {
			
			
			if(ans > ran) {
				System.out.println("더 작은 수를 입력하세요:");
				ans = sc.nextInt();
				cnt++;
			}
			if(ans < ran) {
				System.out.println("더 큰 수를 입력하세요: ");
				ans = sc.nextInt();
				cnt++;
			}
			if(ans == ran) {
				System.out.println("정답입니다.");
				cnt++;
				break;
			}
		}
		
		System.out.println(cnt + "번 만에 맞추셨습니다.");
		
	}
}
