package com.dev.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.dev.vo.MemberVO;

public class MemberDAO {
	private static MemberDAO dao = new MemberDAO();

	Connection conn;
	PreparedStatement psmt;

	private MemberDAO() {
	}

	public MemberDAO getInstance() {
		return dao;
	}

	public Connection connect() {
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:comp/env/java/myoarcle");
			conn = ds.getConnection();

		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}
		return conn;

	}

	public void close() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 입력
	public void memberInsert(MemberVO member) {

	}
}
