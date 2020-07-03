package com.naver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

public class MovieTestDAO {
private final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
	
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USERNAME = "CA2";
	private final String PASSWORD = "ca2";
	
	public  MovieTestDAO() {  
		try {
			Class.forName(DRIVERNAME);
			System.out.println("driver loading success");
		} catch (ClassNotFoundException e) {
			System.out.println("driver loading fail");
			e.printStackTrace();
		}
	}
	
	// 예매 내역 삭제 
	public void delete(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from movieTest where id = ? ";
		
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null)  pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	// 예매 내역 수정
	public void update(MovieTestDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update tbl_member set name = ?, title = ? , theater = ?, day = ?, howMany = ?, cost = ?, seatNumber = ? where id = ?";
		
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getDay());
			pstmt.setInt(4, dto.getHowMany());
			pstmt.setInt(5, dto.getCost());
			pstmt.setString(6, dto.getSeatNumber());
			pstmt.setString(1, dto.getId());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null)  pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	// 예매 내역 조회 
	public List<MovieTestDTO> selectAll() {
		List<MovieTestDTO> list = new ArrayList<MovieTestDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from movieTest";
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String title = rs.getString(3);
				String theater = rs.getString(4);
				String day = rs.getString(5);
				int howMany = rs.getInt(6);
				int cost = rs.getInt(7);
				String seatNumber = rs.getString(8);
				
				MovieTestDTO dto = new MovieTestDTO(id, name, title, theater, day, howMany, cost, seatNumber);
				list.add(dto);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null)  pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	
	
	// 예매정보 입력
	public void insert(MovieTestDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into movieTest (id,name,title,theater,day,howMany,cost,seatNumber) values (?,?,?,?,?,?,?,?)";
		
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getTitle());
			pstmt.setString(4, dto.getTheater());
			pstmt.setString(5, dto.getDay());
			pstmt.setInt(6, dto.getHowMany());
			pstmt.setInt(7, dto.getCost());
			pstmt.setString(8, dto.getSeatNumber());
			
			pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null)  pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	
}
