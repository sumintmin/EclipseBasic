package kr.or.ddit.homework;

import java.util.Scanner;

public class Homework03___ {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework03___ obj = new Homework03___();
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
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) {
			System.out.println("윤년입니다.");
		}
		else {
			System.out.println("평년입니다.");
		}
		
	}
	
	public void method1() {
		// 1~50 사이 숫자를 맞추는 게임을 완성하시오
		// 0~0.9999 까지 0~1사이, 1미포함 랜덤 변수
		// 곱하기 50을 하면 0부터 49.999999
		
		// 5~10 하려면 *6을 해야한다. 그래야 숫자 6개 0~5, +5하면 숫자 범위가 5~10
		// 31~50 개수가 20개니까 *20 + 30 : 31~50까지 
		
		
		// 난수 생성
		double r = Math.random();
		System.out.println(r);
		
		// 랜덤숫자 생성
		int ran = (int)(Math.random() * 50) + 1;
		System.out.println(ran);
		
		
		int cnt = 0;
		
		while(true) {
			
			System.out.println("숫자를 입력하세요 ");
			int ans = sc.nextInt();
			// 시행 될 때마다 cnt 값을 1 증가
			
			if(ans > ran) {
				cnt++;
				System.out.println("더 작은 수를 입력하세요:");
				
			}
			if(ans < ran) {
				cnt++;
				System.out.println("더 큰 수를 입력하세요: ");
				
			}
			if(ans == ran) {
				cnt++;
				System.out.println("정답입니다.");
				break;
			}
		}
		
		System.out.println(cnt + "번 만에 맞추셨습니다.");
		
		
	}
}
