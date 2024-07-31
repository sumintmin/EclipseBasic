package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class MemberDao {
	private static MemberDao instance;

	private MemberDao() {

	}

	public static MemberDao getInstance() {
		if (instance == null) {
			instance = new MemberDao();
		}

		return instance;
	}
	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	public void memberJoin(List<Object> param) {
		String sql = "INSERT INTO MEMBER(MEM_NO, ID, PW, NAME, REG_DATE)\r\n"
					+ "VALUES ((SELECT NVL(MAX(MEM_NO), 0) + 1\r\n"
					+ "FROM MEMBER), ? , ? , ? , SYSDATE)";
//		+ "FROM MEMBER), 'ID', 'PW', 'NAME', SYSDATE)"; 물음표로 처리해준다. 작은따옴표, 세미콜론 주의 
		jdbc.update(sql, param);
	}
	
	public Map<String, Object> login(List<Object> param) {
		String sql = "SELECT *\r\n"
				+ "FROM MEMBER\r\n"
				+ "WHERE ID = ?\r\n"
				+ "AND PW = ?\r\n"
				+ "AND DELYN = 'N'";
		return jdbc.selectOne(sql, param);
		// 이 구조에 html만 추가해서 연결하면 된다!
	}
	
}
