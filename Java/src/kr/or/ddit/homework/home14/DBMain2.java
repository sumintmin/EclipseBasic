package kr.or.ddit.homework.home14;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import kr.or.ddit.util.ScanUtil;

public class DBMain2 {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public static void main(String[] args) {
		DBMain2 db = new DBMain2();
		db.selectAll();
	}
	
	public Member[] selectAll() {
		Member[] memberList = null;
		
		try {
			
			conn = DBConn.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM MEMBER";
			sql += " WHERE ";
			
			
			// 취미랑 직업 중에서 선택 , 취미 -> 바둑 출력
			// 직업 선택 -> 주부 출력

			
			System.out.println("1. 취미");
			System.out.println("2. 직업");
			int sel = ScanUitl.nextInt("선택");
			String search = "";
			if(sel == 1) {
				search = ScanUtil.nextLine("검색");
				
				}
			if(sel == 2) {
				search = ScanUtil.nextLine("검색");
				
			}
			while(rs.next()) {
				String id = rs.getNString("mem_id");
				
				if(sel == 1) {
					if(!like.equals(search)) continue;
				}
				if(sel == 2) {
					if(!job.equals(search)) continue;
				}
				System.out.println(id + "\t" + name + "\t" + like + "\t " + job);
			}
					
			int sel = ScanUtil.nextInt("1. 취미 2. 직업");
			if(sel == 1) {
				String search = ScanUtil.nextLine("검색");
				sql += " mem_like = \'" + search + "\'";
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					String mid = rs.getString("mem_id");
					String mname = rs.getString("mem_name");
					String mlike = rs.getString("mem_like");
					System.out.println(mid + "\t" + mname + "\t" + mlike);
				}
				
				
				
			}
			if(sel == 2) {
				String search = ScanUtil.nextLine("검색");
				sql += " mem_job = \'" + search + "\'";
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					String mid = rs.getString("mem_id");
					String mname = rs.getString("mem_name");
					String mjob = rs.getString("mem_job");
					System.out.println(mid + "\t" + mname + "\t" + mjob);
				}
			
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return memberList;
	
	}
	
	
}
