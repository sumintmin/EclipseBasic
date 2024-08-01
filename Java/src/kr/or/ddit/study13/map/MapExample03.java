package kr.or.ddit.study13.map;

import java.util.ArrayList;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MapExample03 {
	public static void main(String[] args) {
		MapExample03 obj = new MapExample03();
		obj.process();
	}
	
	public void process() {
		List<Map<String, Object>> list = insertData();
//		printData(list);
		parkTime(list);
	}
	
	// 주차요금 계산하기
	
	public void parkTime(List<Map<String, Object>> list ) {
		Set carSet = new HashSet();
		// carSet 차량번호 담기
		for (Map<String, Object> map : list) {
			String carNum = (String) map.get("차량번호");
			carSet.add(carNum);
		}
		
		Iterator<String> it = carSet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("차량번호 : " + key);
			int sum = parkTimeDetail(list, key);
			System.out.println("주차시간 : " + sum);
			// 시간이 이쪽으로 갖고와지면 되겠죠
			
			int money = getMoney(sum);
			System.out.println(money);
			List<Map<String, Object>> parkList = parkList(list, key);
			
			// 출력
			int money = getMoney(sum);
			List<Map<>>
			// 주차 시간
			System.out.println("총 주차시간 : " + sum);
			// 주차 요금
			System.out.println("주차 요금" + money);
			// 상세 주차 내역
			System.out.println(time + "\t" + carNum + "\t" + inout);
			
		}
	}
	
	public List<Map<String, Object>> parkList(List<Map<String, Object>> list, String carNum_){
		
		
		
		return null;
	}
	
	public int getMoney(int time) {
		// 여기부터 과제
		// 기본 시간	기본요금	단위시간	단위요금
		// 180분		5000원	10분		600원
		// 200분 -> 5000원 + 600 * 2  -> 6200원
		int money = 0;
		
		if(time % 180 == 0) {
			money = time/180 * 5000;
		}else {
			money = time/180 * 5000 + (time%180) /10 * 600;
		}
		
		ArrayList<Integer> arrNum = new ArrayList<>();
		while(time > 0) {
			arrNum.add(time %10);
			time /= 10;
		}
		if(arrNum.get(0) > 0) {
			money += 600;
		}
		
		return money;
	}
	
	
	/*
	 * 200분 -> 5000 + 600 *2 -> 6200원
	 * 201분 -> 
	 * if(time <= 180) return 5000;
	 * return 5000 + (time-180)/10*600;
	 * 
	 * 
	 * public List<Map<String, Object>> parkList(List<Map<String, Object>> list, String carNum_){
	 * 
	 * 		for(Map<String, Object> map : list){
	 * 			String time = (String)map.get("시각");
	 * 			String carNum = (String)map.get("차량 번호");
	 * 			String inout = (String)map.get("내역");
	 * if(!carNum.equals(carNum_)) continue;
	 * result.add(map);
	 * 
	 * }
	 * return result;
	 * 
	 * 
	 */
	
	public int getTime(String time) {
		// 05:34 -> 05, 34로 분리 -> 05*60 + 34;
		// split을 활용한다..
		String[] tokens = time.split(":");
		int hour = Integer.parseInt(tokens[0]); // valueof또는 parseint
		int min = Integer.parseInt(tokens[1]);
		
		return hour * 60 + min;
	}
	
	
//	public void parkTimeDetail(List<Map<String, Object>> list, String carNum_) {
	public int parkTimeDetail(List<Map<String, Object>> list, String carNum_) {
		// carNum 같은 값만 출력해보기
		int in = 0;
		int sum = 0;
		for(Map<String, Object > map : list) {
			String time = (String)map.get("시각");
			String carNum = (String)map.get("차량번호");
			String inout = (String)map.get("내역");
			if(!carNum.equals(carNum_)) continue;
			System.out.println(time+"\t"+carNum+"\t"+inout);
			int min = getTime(time);
			if(inout.equals("입차")) {
				in = min;
			}
			if(inout.equals("출차")) {
				int parkTime = min - in;
				sum += parkTime;
//				System.out.println(parkTime);
			}
		}
		return sum;
	}
	
	public void printData(List<Map<String, Object>> list) {
		System.out.println("시각\t차량번호\t내역");
		for(Map<String, Object>map : list) {
			String time = (String)map.get("시각");
			String carNum = (String)map.get("차량번호");
			String inout = (String)map.get("내역");
			System.out.println(time+"\t" + carNum+"\t" + inout);
		}
		
	}
	
	public List<Map<String, Object>> insertData(){
		List<Map<String, Object>> list = new ArrayList();
		// 시각		차량번호		내역
		
		//05:34		1234		입차
		//06:02		5678		입차
		//07:23		1234		출차
		//07:48		0000		입차
		//11:50		5678		출차
		
		//12:50		1234		입차
		//12:54		5678		입차
		//15:16		0000		출차
		//16:42		1234		출차
		//17:52		5678		출차
	
		// 차량번호를 int로 입력하면 0000이 0이 됨
		
		Map<String, Object> map1 = new HashMap();
		map1.put("시각", "05:34");
		map1.put("차량번호","1234" );
		map1.put("내역", "입차");
		Map<String,Object> map2 = new HashMap();
		map2.put("시각","06:02" );
		map2.put("차량번호", "5678");
		map2.put("내역","입차" );
		Map<String, Object> map3 = new HashMap();
		map3.put("시각", "07:23");
		map3.put("차량번호", "1234");
		map3.put("내역", "출차");
		Map<String, Object> map4 = new HashMap();
		map4.put("시각", "07:48");
		map4.put("차량번호", "0000");
		map4.put("내역", "입차");
		Map<String,Object> map5 = new HashMap();
		map5.put("시각", "11:50");
		map5.put("차량번호", "5678");
		map5.put("내역","출차" );
		Map<String, Object> map6 = new HashMap();
		map6.put("시각", "12:50");
		map6.put("차량번호", "1234");
		map6.put("내역", "입차");
		Map<String,Object> map7 = new HashMap();
		map7.put("시각", "12:54");
		map7.put("차량번호", "5678");
		map7.put("내역", "입차");
		Map<String,Object> map8 = new HashMap();
		map8.put("시각", "15:16");
		map8.put("차량번호", "0000");
		map8.put("내역", "출차");
		Map<String,Object> map9 = new HashMap();
		map9.put("시각", "16:42");
		map9.put("차량번호", "1234");
		map9.put("내역", "출차");
		Map<String,Object> map10 = new HashMap();
		map10.put("시각","17:52" );
		map10.put("차량번호", "5678");
		map10.put("내역", "출차");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		list.add(map6);
		list.add(map7);
		list.add(map8);
		list.add(map9);
		list.add(map10);
		
		return list;
	}
	
	// 컬럼, 받아올 데이터
	// 리스트, 맵, 스트링 오브젝트
	// 리스트에서 값 꺼내기 - get(인덱스), 숫자
	// 맵은 get으로 꺼낼 때 key가 필요하다
	// put, get, list는 add랑 get
	// 입력받고 이런건 html에서 만든다.
	// 일반적으로는 데이터를 어떻게 갖고와서 받아올건지가 중요하다

}
