package kr.or.ddit.study06.sec04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Lotto obj = new Lotto();
		obj.process();

	}

	public void process() {
//		int[] lotto = generateLotto();
//		System.out.println(array2String(lotto));
//		int[][] paper = lottoPaper();
//		for(int [] lotto : paper) {
//			System.out.println(array2String(lotto));
		
		System.out.println("금액 : ");
		int money = sc.nextInt();
		int[][][] bundle = lottoBundle(money);
		printBundle(bundle);
		}
//	https://smrdls-java.tistory.com/
	public void printBundle(int[][][] bundle) { // 출력같은건 void를 사용한다.
		for(int[][] paper : bundle) {
			System.out.println("=======================");
			for(int[] lotto: paper) {
				System.out.println(array2String(lotto));
			}
			System.out.println("=======================");
		}
	}
	
	
	
	public int[][][] lottoBundle(int money){
		int papers = money / 5000;
		if(money%5000 != 0) papers++;
		int[][][] bundle = new int[papers][5][6];
		for(int i = 0; i < bundle.length; i++) {
			bundle[i] = lottoPaper();
			
		}
		
		if(papers % 5000 != 0) {
			// 8000
			// 3000/1000 -> 3
			bundle[bundle.length-1] = lottoPaper(money%5000/1000);
		}
		
		return bundle;
	}
	
	
	public int[][] lottoPaper(int num){
		int[][] paper = new int[num][6];
		for (int k = 0; k < paper.length; k++) {
			paper[k] = generateLotto();
			
		}
		
		
		return paper;
	}
	
	
	public int[][] lottoPaper(){
//		int[][] paper = new int[5][6];
//		for (int i = 0; i < paper.length; i++) {
//			paper[i] = generateLotto();
//			
//		}
//		
		return lottoPaper(5);
	}
	
	
	
	
	
	public int[] generateLotto() {
		int[] lotto = new int[6];
		// 36 45 23 0 0 0
		// 36
		for(int i = 0; i<lotto.length; i++) {
			int ran = new Random().nextInt(45)+1;
			lotto[i] = ran;
			for(int j = 0; j< i; j++) {
				if(lotto[j] == ran) {
					i--;
					break;
				}
			}
			
		}
		Arrays.sort(lotto); // 안 만들고 이거 써도 됨
//		sort(lotto);
		
		return lotto;
	}
	
	public String array2String(int[] lotto) {
		// file 2 java, string 2 int 검색 잘 된다!
		String result = "♣";
		for(int i = 0; i < lotto.length; i++) {
			result += lotto[i];
			if(lotto.length-1 != i) result += ",";
			
			
		}
		result += "§";
		return result;
		// 고급개발자와 중급개발자 메소드 컨트롤로 구분함
	}
	
	
	public void sort(int[] lotto) {
		for(int i = 0; i<lotto.length-1; i++) {
			for(int j = 0; j<lotto.length-1; j++) {
				if(lotto[j] > lotto[j+1]) {
					int temp = lotto[j];
					lotto[j]  = lotto[j+1];
					lotto[j+1] = temp;
					// 원본이 수정되었으니 리턴할 필요가 없다..
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
