package com.dev.service;

import com.dev.dao.MemberDAO;
import com.dev.vo.MemberVO;

public class MemberService {
	private static MemberService service = new MemberService();

	private MemberService() {

	}

	public MemberService getInstance() {
		return service;
	}

	public void memberInsert(MemberVO member) {
		MemberDAO dao = new MemberDAO();
		dao.memberInsert(member);
	}
}
