package kr.or.ddit.study07.phone;

public class PhoneMain {
	
	public static void main(String[] args) {
		System.out.println("---전화기");
		HandPhone hp = new HandPhone();
		hp.call();
		hp.mobile();
		
		System.out.println("---갤럭시");
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.mobile();
		sp.camera();
		sp.touch();
		
		System.out.println("---아이폰");
		iPhone ip = new iPhone();
		ip.appStore();
		ip.call();
		ip.camera();
		ip.mobile();
		ip.touch();
		
	}

}
