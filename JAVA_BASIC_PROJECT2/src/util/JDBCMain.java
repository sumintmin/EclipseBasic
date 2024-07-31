package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCMain {
	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance();
		
		
		//
//		String sql = "SELECT *\r\n"
//				+ "FROM MEMBER\r\n"
//				+ "WHERE ID = 'a001'\r\n"
//				+ "AND PW = 'java'";
//		
//		
//		Map<String, Object> map = jdbc.selectOne(sql);
//		System.out.println(map);
		
		
//		String sql = "SELECT *\r\n"
//					+ "FROM MEMBER\r\n"
//					+ "WHERE ID = ?\r\n"
//					+ "AND PW = ?";
//		// 동적으로 갖고올 때는 물음표를 사용한다.
//		List<Object> param = new ArrayList();
//		String id = ScanUtil.nextLine("아이디 : ");
//		String pw = ScanUtil.nextLine("패스워드 : ");
//		param.add(id);
//		param.add(pw);
//
//
//		Map<String, Object> map = jdbc.selectOne(sql, param);
//		System.out.println(map);
		
		// Y로 된 친구 갖고오지 않기
//		String sql = "SELECT * \r\n"
//					+ "FROM MEMBER\r\n"
//					+ "WHERE DELYN = 'N'";
//			
//	
//	
//		List<Map<String, Object>> list = jdbc.selectList(sql);
//		// for each 문을 활용해서 갖고오기
//		// list에 담긴다
//		for (Map<String, Object> map : list) {
////			System.err.println(map);
//			System.out.println(map);
//		}
		
		
//		// update문
		String sql = "UPDATE MEMBER\r\n"
				+ "SET DELYN = 'Y'\r\n"
				+ "WHERE ID = 'b001'";
			
	
	
		List<Map<String, Object>> list = jdbc.selectList(sql);
		// for each 문을 활용해서 갖고오기
		// list에 담긴다
		for (Map<String, Object> map : list) {
			System.out.println(map);
		}
	}
}
