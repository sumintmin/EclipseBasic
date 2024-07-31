package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import service.MemberService;
import util.ScanUtil;
import view.View;

public class MainController {
	
	MemberService memService = MemberService.getInstance();
	
	
	
	public static void main(String[] args) {
		MainController obj = new MainController();
		obj.process();
	}
	
	public void process() {
		View view = View.MAIN;
		while(true) {
			switch (view) {
			case MAIN: {
				view = home(); // 빨간줄 f2 create
				break;}
			case LOGIN: {
				view = login(); // 빨간줄 f2 create
				break;}
				
			case JOIN: {
				view = join(); // 빨간줄 f2 create
				break;}
				
			default:
				break;
				
			
			}
		}
	}

	private View join() {
		System.out.println("=== 회원가입 ===");
		String id = ScanUtil.nextLine("ID: ");
		String pw = ScanUtil.nextLine("PW: ");
		String name = ScanUtil.nextLine("이름: ");
		List<Object> param = new ArrayList();
		param.add(id);
		param.add(pw);
		param.add(name);
		memService.memberJoin(param);
		return View.MAIN; // db에 저장됨
	}

	private View login() {
		System.out.println("=== 로그인 ===");
		String id = ScanUtil.nextLine("ID : ");
		String pw = ScanUtil.nextLine("PW : ");
		List<Object>param = new ArrayList();
		param.add(id);
		param.add(pw);
		Map<String, Object> member = memService.login(param);
		
		if(member == null) {
			System.out.println("유효한 아이디/비번이 아닙니다.");
			// 회원가입과 재로그인 둘 중 선택할 수 있게 수정하자
//			return View.LOGIN; // 재로그인으로 돌리기
			System.out.println("1. 재 로그인");
			System.out.println("2. 회원가입");
			int sel = ScanUtil.nextInt("선택 >> ");
			if(sel == 1) return View.LOGIN;
			if(sel == 2) return View.JOIN;
		}
		String name = (String)member.get("NAME");
		System.out.println(name+"님 환영합니다.");
		return View.MAIN;
	}

	private View home() {
		System.out.println("=== 흠 ===");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		int sel = ScanUtil.nextInt("선택 >> ");
		
		switch (sel) {
		case 1: return  View.LOGIN;
		case 2: return View.JOIN;
		default: return View.MAIN;
	}
}
}
