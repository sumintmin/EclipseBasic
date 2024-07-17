package kr.or.ddit.homework;

import java.util.Scanner;

public class Homework04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework04 obj = new Homework04();
		obj.process();
	}

	public void process() {
		
		// 0-> 가위 1-> 바위 2-> 보
		// 컴퓨터 : 가위,	 유저: 보
		// 결과 	: 졌다
		
		System.out.println("입력하시오. (0:가위, 1:바위, 2:보, 4:종료)");
		int user = sc.nextInt();
		
		while(user != 4) {
			int com = (int)(Math.random() * 3); // 랜덤 완성할 것
			if (com == 0) {				System.out.println("컴퓨터: 가위");
										switch (user) {	
										case 0:	System.out.println("유저: 가위\n비겼다"); break;
										case 1:	System.out.println("유저: 바위\n이겼다"); break;
										case 2:	System.out.println("유저: 보\n졌다"); break;
										default:break;}
							
			}else if (com == 1) {		System.out.println("컴퓨터: 바위");
										switch (user) {	
										case 0:	System.out.println("유저: 가위\n졌다"); break;
										case 1:	System.out.println("유저: 바위\n비겼다"); break;
										case 2:	System.out.println("유저: 보\n이겼다"); break;
										default:break;}
							
			}else if (com == 2) {		System.out.println("컴퓨터: 보");
										switch (user) {	
										case 0:	System.out.println("유저: 가위\n이겼다"); break;
										case 1:	System.out.println("유저: 바위\n졌다"); break;
										case 2:	System.out.println("유저: 보\n비겼다"); break;
										default:break;}
			}
			if (user > 4 || user == 3) { System.out.println("0(가위)1(바위)2(보)");}
			user = sc.nextInt();
		}
		
	}
}


