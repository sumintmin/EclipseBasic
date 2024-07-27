package kr.or.ddit.study06.sec04;

import java.util.Date;
import java.util.Scanner;

public class Recrusive {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Recrusive obj = new Recrusive();
		obj.process();

	}

	public void process() {
//		method1(5);
//		int add = add(5);
//		System.out.println(add);
		
//		long gop = gop(25);
//		System.out.println(gop);
		
		
		
		// 벤치마크테스트 ( 속도테스트)
		Date d1 = new Date(); // ctrl shift o
		
		long febo = febo(50);
		System.out.println(febo);
		
		Date d2 = new Date(); 
		long time = d2.getTime() - d1.getTime();
		System.out.println(time+"ms");
		
	}
	
	
	
	
	
	
	// 피보나치 수열
	// 1	2	3	4	5	6	7	8	9	10 (idx)
	// 1	1	2	3	5	8	13	21	34	55
	
	// febo(5) -> febo(4) + febo(3)
	// febo(4) -> febo(3) + febo(2),  febo(3) -> febo(2) + febo(1)
	// febo(3) -> febo(2) + febo(1),  febo(2) -> 1,
	// 			  febo(2) -> 1, febo(1) -> 1
	
	
	long[] feboList = new long[500];
	
	
	public long febo(int num) {
		if(num == 1 || num == 2) return 1;
		if(feboList[num]!=0) return feboList[num];
		else {
			long result = febo(num-1) + febo(num-2);
			feboList[num] = result;
			return result;
		}
	}
	
	// 성능 개선이 필요한 코드 // 프로그래머스 2단계 정도 난이도이다.패턴은 굉장히 많이 사용하니 기억해두자
//	public long febo(int num) {
//		if(num == 1 || num == 2) return 1;
//		return febo(num-1) + febo(num - 2);
//		
//	}
	
	
	// gop(5) -> 5 * gop(4) -> 5 * 4 * 3 * 2 * 1
	// gop(4) -> 4 * gop(3) -> 4 * 3 * 2 * 1
	// gop(3) -> 3 * gop(2) -> 3 * 2 * 1
	// gop(2) -> 2 * gop(1) -> 2 * 1 
	// gop(1) -> 1 
	
	public long gop(int num) {

		if(num == 1) return 1;
		return num*gop(num-1);
	}
	
	
	
	
	
	// add(5) -> add(4) + 5 -> 1 + 2 + 3 + 4 + 5
	// add(4) -> add(3) + 4 -> 1 + 2 + 3 + 4
	// add(3) -> add(2) + 3 -> 1 + 2 + 3
	// add(2) -> 1 + 2
	// add(1) -> return 1
	
	// num 5~1 더하기
	public int add(int num) {
		if(num == 1) return 1;
		return num + add(num-1);
	}
	
	public void method1(int num) {
		// 재귀함수: 메소드가 메소드를 호출하는데 자기자신 메소드를 호출함
		// int값 5가 들어가서 5를 출력했다. 넘이 1일때는 리턴(종료)한다.
		// 종료 안되고 method 넘이 5-1이니까 4가 들어간다. 그럼 4가 출력되고 4-1은 3이 출력되고 쭉 가다 1이 출력하고 리턴이 된다.
		// 종료 조건과 반복할 수 있게 짜준다.
		System.out.println(num);
//		if(num == 1) return;
		// 리턴을 안하면 stackoverflow 에러가 발생됨
		method1(num-1);
	}

}
