package kr.or.ddit.study08.board;

public interface IBoard{
	
	// CRUD
	// public void insertBoard(int no, String title, String content, String writer);
	public void insertBoard(BoardVo board);
	
	// Read
	public BoardVo getBoard(int boardNo);
	
	// Update
	// public void updateBoardTitle(int no, String title);
	// public void updateBoardContent(int no, String content);
	public void updateBoard(BoardVo board);
	
	// Delete
	public void deleteBoard(int boardNo);
	
	
	
}