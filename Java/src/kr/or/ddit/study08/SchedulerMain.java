package kr.or.ddit.study08;

import kr.or.ddit.util.ScanUtil;

public class SchedulerMain {

	public static void main(String[] args) {
		System.out.println("전화 상담의 분배 방식 선택");
		System.out.println("R : RoundRobn");
		System.out.println("L : LeastJob");
		System.out.println("P : PriorityAllocation");
		String sel = ScanUtil.nextLine("선택 : ");
		
		
		Scheduler scheduler = null;
		if(sel.equalsIgnoreCase("R")) scheduler = new RoundRobn();
		if(sel.equalsIgnoreCase("L")) scheduler = new LeastJob();
		if(sel.equalsIgnoreCase("U")) scheduler = new PriorityAllocation();
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
	}
}
