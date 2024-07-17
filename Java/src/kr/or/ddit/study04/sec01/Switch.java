package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class Switch {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Switch obj = new Switch();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
		method4();
		
	}
	
	public void method4() {
		System.out.println("점수 : ");
		int score = sc.nextInt();
		switch (score/10) {
		case 10: 	
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			switch (score % 10) {
			case 1: case 2: case 3:
				System.out.println("-");
				break;
			case 4: case 5: case 6:
				System.out.println("0");
				break;
			case 7: case 8: case 9:
				System.out.println("+");
				break;

			default:
				break;
			}
			break;
			
		default:
			break;
		}
	}
	// if문 400개 보다는 switch문 2000개 만드는 게 낫다.
	// case 1이 중복되면 안됨, 속도도 빠르고 찾기도 쉬움.
	
	
	
	public void method3() {
		// 봄 여름 가을 겨울을 출력하세요
		System.out.print("월: ");
		int month = sc.nextInt();
		switch (month) {
		case 1: {	System.out.println("겨울");	break;	}
		case 2: {	System.out.println("겨울");	break;	}
		case 3: {	System.out.println("봄");	break;	}
		case 4: {	System.out.println("봄");	break;	}
		case 5: {	System.out.println("봄");	break;	}
		case 6: {	System.out.println("여름");	break;	}
		case 7: {	System.out.println("여름");	break;	}
		case 8: {	System.out.println("여름");	break;	}
		case 9: {	System.out.println("가을");	break;	}
		case 10: {	System.out.println("가을");	break;	}
		case 11: {	System.out.println("가을");	break;	}
		case 12: {	System.out.println("겨울");	break;	}
		default:	System.out.println("1~12 입력해라");}	}
	
	// 의도적으로 break 하지 않는 방법
//		switch (month) {
//			case 12: case 1: case 2:
//			System.out.println("겨울");
//			break;
//			case 3: case 4: case 5: System.out.println("겨울");break;
//			case 6: case 7: case 8: System.out.println("겨울");break;
//			case 9: case 10: case 11: System.out.println("겨울");break;
//			default: System.out.println("1~12만 가능합니ㅏㄷ.");		}
	public void method2() {
		// grade 값에 따라
		// 1 -> 일반회원
		// 2 -> 우수회원
		// 3 -> VIP
		int grade =3;
		
		switch (grade) {	case 1: {System.out.println("일반회원");	break;}
							case 2:{System.out.println("우수회원");	break;}
							case 3:{System.out.println("VIP");		break;}
							default:{System.out.println("회원");		break;}
						}
	}
		
	public void method1() {
		System.out.println("입력: ");
		int num = sc.nextInt();
		
		while (num != 100) {
			switch (num) {
			case 1: {System.out.println("case1"); num = sc.nextInt();break;}
			case 2:{System.out.println("case2"); num = sc.nextInt();break;}
			default: System.out.println("나머지 경우"); num = sc.nextInt();break;}
						}
		}
	
	
}
