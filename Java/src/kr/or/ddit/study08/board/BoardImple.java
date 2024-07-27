package kr.or.ddit.study08.board;

public class BoardImple implements IBoard {

	@Override
	public void insertBoard(BoardVo board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardVo getBoard(int boardNo) {
		BoardVo board = new BoardVo();
		board.setNo(1);
		board.setContent("hello world");
		board.setReg_date("2024.07.24");
		board.setWriter("글쓴이");
		board.setTitle("삼성전자, 4세대 ...");
		
		return board;
	}

	@Override
	public void updateBoard(BoardVo board) {
		
	}

	@Override
	public void deleteBoard(int boardNo) {
		
	}
	
}
