package kr.or.ddit.study05.sec03;

import java.util.Scanner;

public class Cal {
	// ENUM 계산기 (검색)
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Cal obj = new Cal();
		obj.process();

	}

	public void process() {
		double result = cal(3,4,Operator.ADD);
		System.out.println(result);
		
	}
	
	public double cal(int a, int b, Operator oper) {
		if	   (oper == Operator.ADD) return add(a,b);
		else if(oper == Operator.SUB) return sub(a,b);
		else if(oper == Operator.MUL) return mul(a,b);
		else if(oper == Operator.DIV) return div(a,b);
		else if(oper == Operator.PER) return per(a,b);
//		else	System.out.println("지원하지 않는 연산자입니다.");
		// operator에 정해진 값만 들어오므로 else 같은 과정이 필요없음.. 
		// %하고싶으면 oper에 추가하면됨
		return 0;
	}
	
	
	public double per(int a, int b) {
		return a%b;
	}
	
	public double add(int a, int b) {
		return a + b;
	}
	
	public double sub(int a, int b) {
		return a - b;
	}
	
	public double mul(int a, int b) {
		return a * b;
	}
	
	public double div(int a, int b) {
		return a / b;
	}
	
	
}
