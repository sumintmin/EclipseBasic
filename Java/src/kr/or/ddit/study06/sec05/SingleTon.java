package kr.or.ddit.study06.sec05;

import kr.or.ddit.study06.sec03.Sing;

public class SingleTon {

//	private static SingleTon instance;
//	private SingleTon() {
//		// 이게 없으면 기본생성자가 자동 생성됨
//		// 그래서 클래스 밖에서 만들지 마세요 라고 걸은것
//		// 외부에서 생성 못함
//		// 내부에서만 생성 가능함
//		
//		//메소드 영역에 싱글톤이 들어감
//		// instance가 들어감 = null임
//		// 참이니까 객체를 만든다. new singleton
//		// 객체를 인스턴스에 담았다. instance = new singleton
//		// 리턴 instance이므로 주소값ㅇ르 받아서 객체 생성한것처럼 할 수 있지만 주소값은 getinstance가 반환함
//		// null일때 객체생성만들어라.. 주소값을 그냥 준다?
//		// 3 4 5호 ㅣ호출해도 객체를 리턴을 해준다? 그게 singleton이다.
//	}
//	
//	public static SingleTon getInstance() {
//		if(instance == null) {
//			instance = new SingleTon();
//		}
//		
//		return instance;
//	}
	
	// jar 파일: 남의 프로젝트 파일
	// 프로젝트 만들고 export하면 생성됨
	
	private static SingleTon instance;
	
	private SingleTon() {
		
	}
	
	public static SingleTon getInstance() {
		if(instance == null) {
			instance = new SingleTon();
		}
		
		return instance;
	}
	
	
}
