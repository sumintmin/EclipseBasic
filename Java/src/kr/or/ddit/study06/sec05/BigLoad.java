package kr.or.ddit.study06.sec05;

public class BigLoad {
	
	private static BigLoad instance;

	BigLoad() {
		System.out.print("로딩중");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// thread.sleep 누르고 f2키 -> surround with try-catch 선택
			System.out.print(".");
		}
	}

	public static BigLoad getInstance() {
		if (instance == null) {
			instance = new BigLoad();
		}

		return instance;
	}

	

}
