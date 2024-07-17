package kr.or.ddit.homework.home11;

public class Card {
	
	int num;
	String type;
	
	// alt shift s - constructor using field로 자동생성
	public Card(int num, String type) {
		this.num = num;
		this.type = type;
		
	}
	
	@Override // to ctrl space
	public String toString() {
		// A 23456789 jqk (11 -> j 12 -> q 13 -> k)
		
		String n = num + "";
		if(num == 1) n = "A";
		if(num == 11) n = "J";
		if(num == 12) n = "Q";
		if(num == 13) n = "k";
		
		String result = type + n;
		
		return result;
	}
	
	// a, 2, a, 3은 불편하니까 입력은 num으로 하고 출력할때만 a로 출력함
	// club 1 => club a 이런식으로 출력
	
	

}
