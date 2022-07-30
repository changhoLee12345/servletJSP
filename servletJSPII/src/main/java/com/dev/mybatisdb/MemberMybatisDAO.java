package com.dev.mybatisdb;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.dev.vo.MemberVO;

public class MemberMybatisDAO {
	private static MemberMybatisDAO instance = new MemberMybatisDAO();

	private MemberMybatisDAO() {
	}

	public static MemberMybatisDAO getInstance() {
		return instance;
	}

	SqlSessionFactory sessionFactory = SqlMapSessionFactory.getSqlSessionFactory();

	// 멤버리스트.
	public List<MemberVO> memberList() {
		SqlSession session = sessionFactory.openSession();
		List<MemberVO> list = session.selectList("com.dev.mybatisdb.memberMapper.getMemberList");
		session.close();
		return list;
	}

	// 단건조회.
	public MemberVO searchMember(String id) {
		SqlSession session = sessionFactory.openSession();
		MemberVO vo = session.selectOne("com.dev.mybatisdb.memberMapper.getMember", id);
		session.close();
		return vo;
	}

	// 한건입력.
	public void addMember(MemberVO vo) {

	}
	// wwwwwwww
}
