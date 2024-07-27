package kr.or.ddit.homework.home15;
//RoundRobn, LeastJob, PriorityAllocation 클래스 만들고
// Scheduler 클래스 상속받을 것

//RoundRobn
// getNextCall()
// -> 상담 전화를 대기열에서 차례대로 가져옴
// sendCallToAgent()
// -> 차례대로 상담원에게 상담전화를 분배
public class RoundRobn extends Scheduler{
	public void getNextCall() {
		System.out.println("상담전화를 대기열에서 차례대로 가져옵니다.");
	}
	
	public void sendCallToAgent() {
		System.out.println("차례대로 상담원에게 상담전화를 분배합니다.");
	}

}
