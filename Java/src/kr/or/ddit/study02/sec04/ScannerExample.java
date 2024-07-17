package kr.or.ddit.study02.sec04;

import java.util.Scanner;
// 단축키 ctrl + shift + o

public class ScannerExample {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ScannerExample obj = new ScannerExample();
		obj.process();
		
	}
	
	public void process() {
		System.out.println("문자를 입력하세요");
		String str = sc.next();
		System.out.println("입력 받은 문자열은: " + str);
	}
}
