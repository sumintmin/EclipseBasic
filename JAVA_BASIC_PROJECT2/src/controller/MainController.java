package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import service.BoardService;
import util.ScanUtil;
import view.View;

public class MainController {
	
	BoardService boardService = BoardService.getInstance();
	Map<String, Object> paramMap = new HashMap();
	// alt shift r 
	public static void main(String[] args) {
		MainController obj = new MainController();
		obj.process();
	}
	
	public void process() {
		View view = View.HOME;
		while(true) {
			switch (view) {
			
			case HOME: 
				view = home(); // 빨간줄 f2 create
				break;
			
			case BOARD_LIST:
				view = boardList();
				break;
			
			case BOARD_INSERT:
				view = boardInsert();
				break;
			case BOARD_DETAIL: // boardView라고도 함
				view = boardDetail();
				break;
			case BOARD_UPDATE: // boardView라고도 함
				view = boardUpdate();
				break;
				
			case BOARD_DELETE: // boardView라고도 함
				view = boardDelete();
				break;
				
			default:
				break;
			}
		}
	}
	
	private View boardDelete() {
		System.out.println("=== 게시판 삭제 ===");
		String yn = ScanUtil.nextLine("삭제 하시겠습니까? (y/n)");
		if(yn.equals("n"))return View.BOARD_DETAIL;
		int boardNo = (int) paramMap.get("boardNo");
		List<Object> param = new ArrayList();
		param.add(boardNo);
	
		boardService.boardDelete(param);
		
		return View.BOARD_LIST;
	}
	
	private View boardUpdate() {
		System.out.println("=== 게시판 수정 ===");
		String title = ScanUtil.nextLine("제목 : ");
		String content = ScanUtil.nextLine("내용 : ");
		int boardNo = (int) paramMap.get("boardNo");
		
		List<Object> param = new ArrayList();
		param.add(title);
		param.add(content);
		param.add(boardNo);
		
		boardService.boardUpdate(param);
		return View.BOARD_DETAIL;
	}

	private View boardDetail() {
		int codeNo  = (int) paramMap.get("CODE_NO");
		int boardNo = (int) paramMap.get("boardNo");
		List<Object> param = new ArrayList();
		param.add(codeNo);
		param.add(boardNo);
		Map<String, Object> board = boardService.boardDetail(param);
		System.out.println(board);
		System.out.println("1. 수정");
		System.out.println("2. 삭제");
		System.out.println("<이전글 다음글>");
		String sel= ScanUtil.nextLine("선택 >>");
		switch(sel) {
		case "1": return View.BOARD_UPDATE;
		case "2": return View.BOARD_DELETE;
		case "<":
//				if(board.get("PREV")!=null) {
//					board.get("PREV");
//				}
				return View.BOARD_DETAIL;
		case ">": return View.BOARD_DETAIL;
		default: return View.BOARD_DETAIL;
		}
//		return null;
		
	}
	private View boardInsert() {
		System.out.println("====게시판 등록 ====");
		
		String title = ScanUtil.nextLine("제목 : ");
		String content = ScanUtil.nextLine("내용");
		
		List<Object> param = new ArrayList();
		param.add(title);
		param.add(content);
		param.add(2);
		param.add(paramMap.get("CODE_NO"));
		boardService.boardInsert(param);
		
		return View.BOARD_LIST;
	}

	private View boardList() {
		System.out.println("=== 게시판 리스트 ===");
		int codeNo = (int) paramMap.get("CODE_NO");
//		int codeNo = paramMap.get("CODE_NO");
		// f2누르고 int로 캐스팅
		
		List<Object> param = new ArrayList();
		param.add(codeNo);
		List<Map<String, Object>> list = boardService.boardList(param);
		for(Map<String, Object> map : list) {
			System.out.println(map);
		}
		
		System.out.println("1. 게시판 등록");
		System.out.println("2. 상세 조회");
		System.out.println("3. 홈");
		int sel = ScanUtil.nextInt("선택>>");
		switch(sel) {
			case 1: return View.BOARD_INSERT;
			case 2: int boardNo = ScanUtil.nextInt("게시판 번호 : ");
					paramMap.put("boardNo", boardNo);
					return View.BOARD_DETAIL;
			case 3: return View.HOME;
			default: return View.BOARD_LIST;
		}
		
		
//		return null;
	}

	// 하드코딩 지양


	private View home() {
		System.out.println("=== 홈 ===");
		
		List<Map<String, Object>> list = boardService.codeList();
		for(Map<String, Object> map : list) {
			System.out.println(map.get("CODE_NO")+"."+map.get("CODE_NAME"));
		}
		int sel = ScanUtil.nextInt("선택 >>");
		paramMap.put("CODE_NO", sel);
		
		return View.BOARD_LIST;
	}

//	private View join() {
//		System.out.println("=== 회원가입 ===");
//		String id = ScanUtil.nextLine("ID: ");
//		String pw = ScanUtil.nextLine("PW: ");
//		String name = ScanUtil.nextLine("이름: ");
//		List<Object> param = new ArrayList();
//		param.add(id);
//		param.add(pw);
//		param.add(name);
//		memService.memberJoin(param);
//		return View.MAIN; // db에 저장됨
//	}
}
