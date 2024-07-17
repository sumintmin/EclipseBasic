package kr.or.ddit.homework;

import java.util.Scanner;

public class Homework09 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework09 obj = new Homework09();
		obj.process();

	}

	public void process() {
		Student[] stuList = new Student[5];
		
		Student s1 = new Student();
		s1.name = "miyeon";
		s1.kor = 98;
		s1.eng = 32;
		s1.math = 34;
		
		Student s2 = new Student();
		s2.name = "minni";
		s2.kor = 78;
		s2.eng = 56;
		s2.math = 67;
		
		Student s3 = new Student();
		s3.name = "soyeon";
		s3.kor = 89;
		s3.eng = 42;
		s3.math = 56;
		
		Student s4 = new Student();
		s4.name = "woogi";
		s4.kor = 34;
		s4.eng = 67;
		s4.math = 44;
		
		Student s5 = new Student();
		s5.name = "shuhwa";
		s5.kor = 12;
		s5.eng = 76;
		s5.math = 43;
		
		stuList[0] = s1;
		stuList[1] = s2;
		stuList[2] = s3;
		stuList[3] = s4;
		stuList[4] = s5;
		
		// 총점, 평균
		for(int i =0; i < stuList.length; i++) {
			Student stu = stuList[i];
			stu.sum = stu.kor + stu.eng + stu.math;
			// double avg10 = stu.sum*10/3;
//			stu.avg - avg10/10; 소수점 첫째자리까지 출력
			stu.avg = (stu.sum/3.0) * 10 + 0.5;
			stu.avg = (int)stu.avg;
			stu.avg = stu.avg / 10;
			
		}
		
		// 랭킹
		for (int i = 0; i < stuList.length; i++) {
			for (int j = 0; j < stuList.length; j++) {
				if (stuList[i].sum < stuList[j].sum) {
					stuList[i].rank++;
				}
			}
		}
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("===================================================");
		for(int i = 0; i<stuList.length; i++) {
			System.out.println(stuList[i]);
		}
		System.out.println("==================================================");
		
		System.out.println("정렬 후");
		
		for (int i = 0; i < stuList.length-1; i++) {
			for (int j = 0; j < stuList.length-1; j++) {
				if (stuList[j].rank > stuList[j+1].rank) {
					Student temp = new Student();
					temp = stuList[j];
					stuList[j] = stuList[j+1];
					stuList[j+1] = temp;
				}
			}
		}
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("===================================================");
		for(int i = 0; i<stuList.length; i++) {
			System.out.println(stuList[i]);
		}
		System.out.println("==================================================");
	}
}


class Student{
	String name; // null이 들어있음
	int kor; // 0이 들어있음
	int eng;
	int math;
	int sum;
	double avg;
	int rank = 1;
	
	@Override
	public String toString() {

		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg + "\t" + rank;
	}
	
	
}