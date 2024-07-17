package kr.or.ddit.homework;

import java.util.Scanner;

public class Homework05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework05 obj = new Homework05();
		obj.process();
	}

	public void process() {
		//method1();
		//method2();
		//method3();
		//method4();
		//method5();
		//method6();
		method7();
	}
	
	public void method1() {
		/*	*
		 *  **
		 *  ***
		 *  ****
		 * ex) row=4 일 때 위와 같이 출력
		 */
		System.out.print("row입력: ");
		int row=sc.nextInt();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method2() {
		/*	    *
		 *     **
		 *    ***
		 *   ****
		 * ex) row=4 일 때 위와 같이 출력
		 */
		
		System.out.print("row입력: ");
		int row=sc.nextInt();
		
		for(int i=0;i<row;i++)
		{
			for(int space=0;space<row-1-i;space++)
			{
				System.out.print(" ");
			}
			for(int star=0;star<i+1;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void method3() {
		/*	 ****   
		 *   *** 
		 *   **
		 *   *
		 * ex) row=4 일 때 위와 같이 출력
		 */
		

		System.out.print("row입력: ");
		int row=sc.nextInt();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=row-i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void method4() {
		/* ****   
		 *  *** 
		 *   **
		 *    *
		 * ex) row=4 일 때 위와 같이 출력
		 */
		

		System.out.print("row입력: ");
		int row=sc.nextInt();
		
		for(int i=0;i<row;i++)
		{
			for(int space=0;space<i;space++)
			{
				System.out.print(" ");
			}
			for(int star=0;star<row-i;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method5() {
		/*    *   
		 *   *** 
		 *  *****
		 * *******
		 * ex) row=4 일 때 위와 같이 출력
		 */

		System.out.print("row입력: ");
		int row=sc.nextInt();
		
		for(int i=0;i<row;i++)
		{
			for(int space=row-i;space>=0;space--)
			{
				System.out.print(" ");
			}
			for(int star=0;star<i*2+1;star++)
			{
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method6() {
		/* *******    
		 *  ***** 
		 *   ***
		 *    *
		 * ex) row=4 일 때 위와 같이 출력
		 */
		

		System.out.print("row입력: ");
		int row=sc.nextInt();
		
		for(int i=0;i<row;i++)
		{
			for(int space=0;space<row-i;space++)
			{
				System.out.print(" ");
			}
			for(int star=0;star<i*2+1;star++)
			{
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method7() {
		/* 홀수만  
		 *  *   * 
		 *   * *
		 *    *
		 *   * *
		 *  *   *
		 * 
		 */

		int n=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==i || j==n-i-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
]\

}
