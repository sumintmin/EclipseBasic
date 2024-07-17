package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class IfExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample obj = new IfExample();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method5_5();
//		method5_3();
//		method6();
//		method7();
//		method8();
		method9();
	}
	
	public void method9() {

		int hour = 0;
		int min = 0;
		int sec = 0;
		while(true) {
			
			sec ++;
			// f2 누르고 두번째꺼 하면 자동완성
			
			
			try {				
				Thread.sleep(10);
			}	catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			
			if (sec >= 60) {
				++min;
				sec = 0;
				if(min >= 60) {
					++hour;
					min = 0;
					// min-=60 이런 방법도 있다!
					// 중첩으로 안해도 처리된다!
					if (hour >= 24) {
						hour = 0;
					}
				}
			}
			System.out.println(hour + ":" + min +":" + sec);
		}
	}
	
	public void method8() {
		// 시 분을 입력 받고 30분 전에 시간을 출력하시오.
		System.out.println("시: ");
		int hour = sc.nextInt();
		System.out.println("분: ");
		int min = sc.nextInt();
		min -= 30;
		if (min <= 0) {
			min += 60;
			hour--;
		}

		System.out.println(hour + "시" + min  + "분");
	}
	
	
	
	
	public void method7() {
		// 시간과 분을 입력 받고 30분 뒤의 시간을 출력하시오
		System.out.println("시: ");
		int hour = sc.nextInt();
		System.out.println("분: ");
		int min = sc.nextInt();
		
		min += 30;
		if (min >= 60) {
			min -= 60;
			hour++;
		}
//		else {
//			min += 30;
//		}
		System.out.println(hour + "시" + min  + "분");
	}
	
	public void method6() {
		// 월을 입력 받아 계절을 출력하시오
		String spring = "봄", summer = "여름", autumn = "가을", winter = "겨울";
		System.out.println("월");
		int month = sc.nextInt();
		
		if (month >=3 && month <=5) {
			System.out.println(spring);
		}else if (month >= 6 && month <=8) {
			System.out.println(summer);
		}else if(month >= 9 && month <= 11) {
			System.out.println(autumn);
		}else if(month == 12 || month == 1 || month == 2){
			System.out.println(winter);
		}else {
			System.out.println("1~12중에서 입력하세요");
		}
	}
	
	public void method5_3() {
		if (s1 >=40 &&s2 >=40 &&s3 >=40 &&s4 >=40 &&s5 >=40 &&avg >= 60) {
			System.out.println("합격");			
		}else {
			System.out.println("불합격");
		}
		// 드모르간 법칙
		if (s1 >=40 ||s2 >=40 ||s3 >=40 ||s4 >=40 ||s5 >=40 &&avg < 60) {
			System.out.println("합격");			
		}else {
			System.out.println("불합격");
		}
	}
	
	public void method5_5(){
		
		System.out.print("소프트웨어 설계 : ");
		int s1 = sc.nextInt();
		System.out.print("소프트웨어 개발 : ");
		int s2 = sc.nextInt();
		System.out.print("정보시스템 구축관리 : ");
		int s3 = sc.nextInt();
		System.out.print("프로그래밍언어 활용 : ");
		int s4 = sc.nextInt();
		System.out.print("데이터베이스 구축 : ");
		int s5 = sc.nextInt();
		
		int avg = ( s1 + s2 + s3 + s4 + s5 ) / 5;
		int sad = 40;

		String result1 = "합격";
		String result2 = "불합격";
		String sub1 = "소프트웨어 설계", sub2 = "소프트웨어 개발",
				sub3 = "정보시스템 구축관리", sub4 = "프로그래밍언어 활용", sub5 = "데이터베이스 구축";
		int score[] = {s1,s2,s3,s4,s5};
		String subject[] = {sub1, sub2, sub3, sub4, sub5};
		if (avg >= 60) {
			for (int i = 0; i < score.length; i++) {
				if (score[i] >= sad) {
					System.out.println(subject[i] + result1);
				}else {
					System.out.println(subject[i] + result2);}	
			}
		
		}else {
			System.out.println("평균 60 미만으로 불합격");}
		}
	
	
	
	
	public void method5() {
		// 5과목 점수를 입력받으시오
		
		// 1과목이라도 40점보다 적다면 불합격
		// 평균이 60점 미만이라면 불합격
		
		System.out.print("소프트웨어 설계 : ");
		int s1 = sc.nextInt();
		System.out.print("소프트웨어 개발 : ");
		int s2 = sc.nextInt();
		System.out.print("정보시스템 구축관리 : ");
		int s3 = sc.nextInt();
		System.out.print("프로그래밍언어 활용 : ");
		int s4 = sc.nextInt();
		System.out.print("데이터베이스 구축 : ");
		int s5 = sc.nextInt();
		
		int avg = ( s1 + s2 + s3 + s4 + s5 ) / 5;
		int sad = 40;
		String result1 = "합격";
		String result2 = "불합격";
		String sub1 = "소프트웨어 설계", sub2 = "소프트웨어 개발",
				sub3 = "정보시스템 구축관리", sub4 = "프로그래밍언어 활용", sub5 = "데이터베이스 구축";
		
		
	}
	
	
	public void method4() {
		System.out.println("great~");
		System.out.println("method3은 if만 method4는 else if로 작성.");
	}
	
	public void method3() {
		// 점수를 입력 받고
		// 점수에 따른 학점을 출력하시오.
		// 90 이상 A
		// 80 이상 B
		// 70 이상 C
		// 60 이상 D
		// 	  미만 F
		System.out.println("점수: ");
		int score = sc.nextInt();
		
		int A = 90, B = 80, C = 70, D = 60;
		char a = 'A', b = 'B', c = 'C', d = 'D', f = 'F';
		if (score >= A) {
			System.out.println(a);
		}else if (score >= B) {
			System.out.println(b);
		}else if (score >= C) {
			System.out.println(c);
		}else if (score >= D) {
			System.out.println(d);
		}else {
			System.out.println(f);
		}
	}
	
	public void method2() {
		// 점수를 입력받고
		// 합격인지 출력하시오
		// 60점 기준
		
		System.out.println("점수 : ");
		int score = sc.nextInt();
		
		int standard = 60;
		if (score >= standard) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
	
	public void method1() {
		// if
		// 조건식
		if(false) {
			System.out.println("참일 경우 실행");
		}
		System.out.println("언제나 실행");
	}

}
