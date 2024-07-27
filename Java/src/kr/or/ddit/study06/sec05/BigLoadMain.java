package kr.or.ddit.study06.sec05;

import java.util.Date;

public class BigLoadMain {
	public static void main(String[] args) {
		Date d1 = new Date();
		BigLoad.getInstance();
		BigLoad.getInstance();
		BigLoad.getInstance();
		BigLoad.getInstance();
		BigLoad.getInstance(); // 객체 1회 출력
//		new BigLoad();
//		new BigLoad();
//		new BigLoad();
//		new BigLoad();
//		new BigLoad(); // 객체 5회 출력
		Date d2 = new Date();
		
		// 네이버에 검색을 한다 생각해보자!
		// web -> java로  검색 -> database (오래걸림 -> 갖고와서 java에 갖고있기 // 객체 2개 만드니까 10초걸림 // 미리 로딩 계속 해놓고 있다가 보여줌)
		// 계속 들고있으니까 즉각반응 가능 new 계속하면 너무 오래걸려 -> singleton으로 로딩은 단 한번만
		// 메모리 속도와 하드디스크 속도의 차이 -> 메모리계층구조 나무위키 (disk>memory>cache>registers)
		// db는 하드디스크에 저장함 -> 영구보관하기 위한공간 , 느림 
		// 클러스터링으로 빠르게 검색 메모리 레벨로 올려서 바로 처리 ( select 쿼리가 3일 걸린대)....
		
		// 접속 10개해도 1개만 접속하게끔 만드는 구조 웹->자바->디비가 클릭 10번인데 1회만 이동하게 됨
		
		System.out.println(d2.getTime() - d1.getTime());
	}
}
