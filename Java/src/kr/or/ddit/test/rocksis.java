package kr.or.ddit.test;

import java.util.Scanner;

public class rocksis {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		rocksis obj = new rocksis();
		obj.process();
	}

	public void process() {
		method1();
	}
	public void method1() {
		//가위바위보
		//0->가위  1->바위 2->보
		// 컴퓨터는 랜덤 하게 0~2 범위 값 가져올 것
		// 사용자는 입력
		//int ran = (int)(Math.random()*50)+1;
		System.out.print("가위 바위 보! : ");
		int com = (int)(Math.random()*3); //랜덤 완성할것
		int user = sc.nextInt();
		System.out.println(" 컴퓨터 : " +com);
		System.out.println(" 유저 : "+user);
		//컴퓨터 : 가위,  유저: 보
		//결과 : 졌다.
		if(0<1 && 1<2 && 0>2) {
			System.out.println("졌다");
		}
		else if(com == user) {
			System.out.println("비겼다");
		}
		else  {
			System.out.println("이겼다!");
		}
	}
}

