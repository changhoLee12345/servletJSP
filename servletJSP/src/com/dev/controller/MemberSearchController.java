package com.dev.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.service.MemberService;
import com.dev.vo.MemberVO;

public class MemberSearchController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		String id = request.getParameter("id");
		String job = request.getParameter("job");
		String path = null;

		if (job.equals("search")) {
			path = "memberView/memberSearch.jsp";
		}

		if (id.isEmpty()) {
			request.setAttribute("error", "id를 입력하세요");
			HttpUtil.forward(request, response, path);
			return;
		}

		MemberService service = MemberService.getInstance();
		MemberVO member = service.memberSearch(id);

		if (member == null) {
			request.setAttribute("result", "검색된 정보가 없습니다");
		}
		request.setAttribute("member", member);
		if (job.equals("search")) {
			path = "resultView/memberSearchOutput.jsp";
		}
		HttpUtil.forward(request, response, path);

	}

}
