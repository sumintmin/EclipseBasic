package kr.or.ddit.study13.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	// key값은 
	// value값은
	
	/*
	 * HashMap
	 * 	key와 value로 이루어짐
	 * 	key값은 중복을 허용하지 않고 순서가 보장되지 않음
	 * 
	 * Map 타입의 대표 컬렉션
	 * 
	 * 주요 메소드
	 * .put(key, value)	:	데이터 입력 key 값은 중복 허용x 
	 * 								value 값은 중복 허용
	 * .get(key)		:	value 값을 key 값을 통해 꺼내올 수 있음
	 * .keySet()		:	key로 이루어진 hastSet 값을 가져옴
	 * 
	 */
	public static void main(String[] args) {
		
		// 키가 컬럼이 되고 밸류가 디비 데이터가 된다..
		// mem_id 멤버 아이디가 나온다.
		// 속도이슈보다는 디비랑 매핑된 단어 가져올 때 사용된다.
		Map<String, Integer> map = new HashMap();
		map.put("홍길동", 95);
		map.put("이순신", 75);
		map.put("정몽주", 100);
		map.put("정몽주", 60); // 덮어씌워짐 100 -> 60
		map.put("이성계", 80);
		// db를 이걸로 만들면 한시간을 1초안에 만들게 해줌
		// 자바의 핵심기능, hashmap
		// c -> 자바로 넘어온 이유는 해시맵 때문이다..
		int hongScore = map.get("홍길동");
		System.out.println(hongScore);
		// 정몽주 점수 출력
		int jeongScore = map.get("정몽주");
		System.out.println(jeongScore);
		// key set을 이터레이터로 꺼내보자
		
		Set keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println(key + ", " + value);
			// 맨 처음 넣은 것은 홍길동이지만 출력은 홍길동이 먼저가 아니죠~
		}
		
	}
	
	

}
