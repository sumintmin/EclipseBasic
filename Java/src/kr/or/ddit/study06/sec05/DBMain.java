package kr.or.ddit.study06.sec05;

import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.Statement;

import kr.or.ddit.study06.sec06.Member;

public class DBMain {
	
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public static void main(String[] args) {
		DBMain db = new DBMain();
		db.selectAll();
	}
	
	public void selectAll() {
		try {
			
			conn = DBConn.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM MEMBER";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				// next 함수는 resultset에 저장된 select 문 실행 결과를
				// 행단위로 1행씩 넘겨서 만약에 다음 행이 있으면 true,
				// 다음 행이 없으면 false를 반환하는 함수다.
				// while(rs.next())를 하게 되면 한 루프가 돌아갈 때 마다
				// 1행씩 넘겨주다가 없으면 while이 끝난다.
				Member mem = new Member();
				// mem대신 vo 많이 씀
				// 다른 파일에서 만든 그 멤버를 불러와야한다.
				// vo와 dto
				// logic이 들어가냐 안들어가냐((if age<0)같은거) 의 차이
				String mid = rs.getString("mem_id");
				String mname = rs.getString("mem_name");
				String mlike = rs.getString("mem_like");
				String mjob = rs.getString("mem_job");
			
				mem.setMem_id(mid);
				mem.setMem_name(mname);
				mem.setMem_like(mlike);
				mem.setMem_job(mjob);
//				System.out.println(mem);
				
//				String addr = rs.getString("addr");
				
//				System.out.println(mid + "\t" + mname + "\t" + addr);
				System.out.println(mid + "\t" + mname  + mjob);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
