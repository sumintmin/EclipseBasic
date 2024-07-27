package kr.or.ddit.homework.home15;
//RoundRobn, LeastJob, PriorityAllocation 클래스 만들고
// Scheduler 클래스 상속받을 것
public class PriorityAllocation extends Scheduler {
	
	// PriorityAllocation
	// getNextCall()
	// ->우선순위가 높은 상담전화를 대기열에서 가져옴
	// sendCallToAgent()
	// -> 업무 스킬이 가장 우수한 상담원에게 상담전화를 분배
	
	public void getNextCall() {
		System.out.println("우선순위가 높은 상담전화를 대기열에서 가져옵니다.");
	}
	
	public void sendCallToAgent() {
		System.out.println("업무 스킬이 가장 우수한 상담원에게 상담전화를 분배합니다.");
	}

}
