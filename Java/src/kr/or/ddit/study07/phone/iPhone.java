package kr.or.ddit.study07.phone;

public class iPhone extends SmartPhone{
	
	public void appStore() {
//		super.mobile();
		System.out.println("앱스토어");
		
	}
	
	@Override // cam 하고 ctrl shift 자동완성
	public void camera() {
//		super.camera(); // 원래 카메라가 마음에 안들어서 재구현
		
		System.out.println("1000만 화소 카메라");
	}
	
	

}
