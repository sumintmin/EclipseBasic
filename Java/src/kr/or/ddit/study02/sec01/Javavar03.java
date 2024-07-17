package kr.or.ddit.study02.sec01;

public class Javavar03 {
	public static void main(String[] args) {
		// 첫 번째 글자는 문자이거나 '$', '_'이어야 하고
		// 숫자로 시작할 수 없다.
		
		int $price = 10;
		// .으로 시작 불가
//		int .price = 10;
		// 숫자로 시작 불가
//		int 1a;

		int 한글; // 다 사용 가능하다
		//한글은 인코딩이 깨질 수 있으니 웬만하면 영어로 만드시오
		
		//영어 대소문자를 구분합니다.
		int a = 10;
		int a = 11;
		int A = 12;
		System.out.println("a: " + a);
		System.out.println("A: " + A);

		// 변수는 여러 단어 조합 시 뒤에 붙는 단어는 대문자로 시작할 것
		// (관례 카멜 표기법이라고 함)
		// max + speed
		int maxSpeed;
		// db는 MAX_SPEED
		//first + name
		int firstName;
		
		//문자 길이 제한 x
		int ajskldljdsofijiowejfiojsdlfjadslkjfsdlkjfslkjfwoeijroewijfoijkdjslf;
		double skldjfadlkjfskljfkjshflkjshdfkjhiuewhiuhfkjchwiuhnejkfnclkjdnskjacnnfkhfweiurhwieuhdsjkahfslkjhjdnx;
		
		// 예약어 사용 x
//		int int;
//		int class; 정 만들고 싶다, 그러면 _class 사용
		
		
	}
}
