package kr.or.ddit.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework13 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework13 obj = new Homework13();
		obj.process();
	}

	public void process() {
		int money=10000;
		while(money>0)
		{
			System.out.println("보유 금액: "+money);
			System.out.println("구매할 로또 금액 : ");
			int pay=sc.nextInt();
			
			if(pay==0)	break;
			if(pay>money)
			{
				System.out.println("구매하실 금액이 모자릅니다.");
				continue;
			}
			money-=pay;		
			
			//당첨 번호 한줄 생성할 것
			Lotto l = new Lotto();
			int[] lotto=l.generateLotto();
			System.out.println("당첨번호: "+l.array2String(lotto));
			
			//로또 번들에서 당첨번호랑 같은 값이 있다면 상금 3만원
			int[][][] bundle = l.lottoBundle(pay);
			l.printBundle(bundle);
			if(l.check(lotto, bundle)==0) System.out.println("낙첨됐습니다.");;
			
		
		}
	}


	
}
class Lotto{
	
	public int check(int[] lotto,int[][][] bundle) {
		
		for(int[][] papers:bundle)
		{
			for(int[] lottos:papers)
			{
				if(Arrays.equals(lotto, lottos))
				{
					System.out.println("==================");
					System.out.println("당첨! 상금 3만원");
					return 1;
				}
			}
		}
		return 0;
	}
	
	public void printBundle(int [][][] bundle) {
		for(int[][]paper: bundle)
		{
			System.out.println("======================");
			for(int [] lotto:paper)
			{
				System.out.println(array2String(lotto));
			}
		}
		//System.out.println("======================");
	}
	
	
	//금액에 따른 로또 장 수
	public int[][][] lottoBundle(int pay){
		int papers= pay/5000;
		if (pay%5000 !=0) papers++;
		
		int[][][] bundle = new int [papers][5][6];
		
		for(int i=0;i<bundle.length;i++)
		{
			bundle[i] = lottoPaper();
		}
		
		if(pay%5000!=0)
		{
			bundle[bundle.length-1] = lottoPaper(pay%5000/1000);
		}
		
		return bundle;
		
	}
	
	public int[][] lottoPaper(int num){
		int[][] paper = new int[num][6];
		
		for(int k=0;k<paper.length;k++)
		{
			paper[k]=generateLotto();

		}
		return paper;
		
	}
	
	
	public int[] generateLotto() {
		int [] lotto = new int[6];
		
		for(int i=0; i<lotto.length;i++)
		{
			int ran= new Random().nextInt(8)+1;			
			lotto[i]= ran;
			for(int j=0;j<i;j++) // 아직 안뽑은 숫자 비교 안하니까 i까지
			{
				if(lotto[j]==ran) 
				{
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto); //메소드 사용해도 되고, 밑에처럼 내가 직접 만들어서 해도 되고
		//sort(lotto);
		
		return lotto;
	}
	
	
	
	// 얕은 복사이기 때문에 원본값도 같이 변경돼서 굳이 return안해도 됨
	public void sort(int[] lotto) {
		for(int i=0; i<lotto.length-1;i++)
		{
			for(int j=0; j<lotto.length-1;j++)
			{
				if(lotto[j]>lotto[j+1])
				{
					int temp=lotto[j];
					lotto[j]=lotto[j+1];
					lotto[j+1]=temp;
				}
			}
		}
	}
	
	
	public String array2String(int[] lotto) {
		String result = "[";
		for(int i=0;i<lotto.length;i++)
		{
			result+=lotto[i];
			if(lotto.length-1!=i) result+=",";
		}
		result+="]";
		return result;

	}
	
	
	
	public int[][] lottoPaper(){
		return lottoPaper(5);
		
	}
}




