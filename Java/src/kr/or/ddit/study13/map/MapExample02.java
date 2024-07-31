package kr.or.ddit.study13.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapExample02 {
	
	
	public static void main(String[] args) {
		MapExample02 me = new MapExample02();
		me.process();
	}
	
	public void process() {
		List<Map<String, Object>> list = insertData();
		printData(list);
		int max = maxSalary(list);
		System.out.println("월급 최대 값은 : "+ max);
		int min = minSalary(list);
		System.out.println("월급 최소 값은 : " + min);
		selectOne(list, 7521);
		selectDept(list, 30);
		sumDeptSal(list);
	}
	
	public void sumDeptSal(List<Map<String, Object>> list) {
		// 부서별 월급 총합을 구하고 출력하시오.
		Map<Integer, Integer> sumMap = new HashMap();
//		sum.put(30, 250);
//		sum.get(30);
//		if(sumMap.containsKey(30)){// 키가 있나요? 하고 물어보는 것. 
//			// 있으면
//			int s = sumMap.get(30);
//			s + = 350;
//			sumMap.put(30, s);
//		
//		sumMap.put(30, 300); // 기존의 250이 없어짐
//		}
		
		for(Map<String, Object> map : list) {
			int sal = (int) map.get("SAL");
			int deptno = (int) map.get("DEPTNO");
			
			if(sumMap.containsKey(deptno)) {
				sal += sumMap.get(deptno);
			}
			
			sumMap.put(deptno, sal);
		}
		
		
		Iterator<Integer> it = sumMap.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next();
			int value = sumMap.get(key);
			System.out.println(key + "\t" + value);
		}
		
		
		
//		int sum = 0;
//		for(Map<String, Object> map : list) {
//			int 	empno = (int) map.get("EMPNO");
//			String 	ename = (String) map.get("ENAME");
//			String 	job = (String) map.get("JOB");
//			int		sal = (int) map.get("SAL");
//			int 	deptno = (int) map.get("DEPTNO");
//			for(int i = 0; i < deptno; i++) {
//				sum += deptno(i);
//			}
//		}System.out.println(sum);
//		
	}
	
	
	public void selectDept(List<Map<String, Object>> list, int dept) {
		System.out.println("부서 : " + dept);
		for(Map<String, Object>map : list) {
			int 	empno = (int) map.get("EMPNO");
			String 	ename = (String) map.get("ENAME");
			String 	job = (String) map.get("JOB");
			int		sal = (int) map.get("SAL");
			int 	deptno_ = (int) map.get("DEPTNO");
			if(dept != deptno_) continue;
			System.out.println(empno + "\t"+ ename + "\t" + job + "\t" + sal + "\t" + dept + "\t");
			
		}
	}
	
	public void selectOne(List<Map<String, Object>> list, int empno) {
		// 한 사람의 정보 모두 출력하기
		
//		for(Map<String, Object> map: list) {
//			int emp = (int)map.get("EMPNO");
//			if( emp == empno)
//				System.out.println(map);
//		}
		System.out.println("사원 번호 : " + empno);
		for(Map<String, Object> map : list) {
			int 	empno_ = (int) map.get("EMPNO");
			String 	ename = (String) map.get("ENAME");
			String 	job = (String) map.get("JOB");
			int		sal = (int) map.get("SAL");
			int 	deptno = (int) map.get("DEPTNO");
			if(empno != empno_) continue;
			System.out.println(empno + "\t"+ ename + "\t" + job + "\t" + sal + "\t" + deptno + "\t");
			
		}

		
	}
	
	
	public int minSalary(List<Map<String, Object>> list) {
		// 현재 값을 비교해서 더 큰 값일 때 저장
		int min = Integer.MAX_VALUE;
		for(Map<String, Object> map : list) {
			int sal = (int) map.get("SAL");
			if(min > sal) min = sal;
		}
		return min;
	}
	
	public int maxSalary(List<Map<String, Object>>list) {
		// 현재 값 비교해서 더 큰 값일 때 저장
		int max = 0;
		for(Map<String, Object> map : list) {
			int sal = (int) map.get("SAL");
			if(max < sal) max = sal;
		}
		return max;
	}
	
	
	public void printData(List<Map<String, Object>> list) {
		// 출력해보기
		// 배열 출력하기 위해 반복문
		for(int i = 0; i < list.size(); i++) {
			Map<String, Object> emp = list.get(i);
			int 	empno = (int) emp.get("EMPNO");
			String 	ename = (String) emp.get("ENAME");
			String 	job = (String) emp.get("JOB");
			int		sal = (int) emp.get("SAL");
			int 	deptno = (int) emp.get("DEPTNO");
			System.out.println(empno + "\t" + ename + "\t" + job + "\t" + sal + "\t" + deptno);
			
		}
	}
	
	public List<Map<String, Object>> insertData(){
		// 디비 데이터 가져온 형식과 동일
		List<Map<String, Object>> list = new ArrayList();
		// list에 map을 담겠다.
		
		// Map<String, Object>
		// Key	 -> String 값 컬럼
		// value -> Object 값 컬럼 실제 값
		
		// empno는 키값 ename, job이 다 키에 들어있다. 꺼낼때 키로 꺼낸다..
//		EMPNO	ENAME	 JOB		SAL	  DEPTNO
//		7369	장길동	프로그래머		600		50
//		7499	고영우	시장조사		550		20
//		7521	구기현	영업사원		250		30
//		7566	김동혁	관리자		375		40
//		7654	김민욱	영업사원		350		30
		
		// 키값은 컬럼 이름
		// DB의 실제 값
		Map<String, Object> emp1 = new HashMap();
		emp1.put("EMPNO", 7369);
		emp1.put("ENAME", "장길동");
		emp1.put("JOB", "프로그래머");
		emp1.put("SAL", 600);
		emp1.put("DEPTNO", 50);
		Map<String, Object> emp2 = new HashMap();
		emp2.put("EMPNO", 7499);
		emp2.put("ENAME", "고영우");
		emp2.put("JOB", "시장조사");
		emp2.put("SAL", 550);
		emp2.put("DEPTNO", 20);
		Map<String, Object> emp3 = new HashMap();
		emp3.put("EMPNO", 7521);
		emp3.put("ENAME", "구기현");
		emp3.put("JOB", "영업사원");
		emp3.put("SAL", 250);
		emp3.put("DEPTNO", 30);
		Map<String, Object> emp4 = new HashMap();
		emp4.put("EMPNO", 7566);
		emp4.put("ENAME", "김동혁");
		emp4.put("JOB", "관리자");
		emp4.put("SAL", 375);
		emp4.put("DEPTNO", 40);
		Map<String, Object> emp5 = new HashMap();
		emp5.put("EMPNO", 7654);
		emp5.put("ENAME", "김민욱");
		emp5.put("JOB", "영업사원");
		emp5.put("SAL", 350);
		emp5.put("DEPTNO", 30);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		return list;
	}
}
