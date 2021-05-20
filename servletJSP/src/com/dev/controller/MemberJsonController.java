package com.dev.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.dev.service.MemberService;
import com.dev.vo.MemberVO;

public class MemberJsonController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		MemberService service = MemberService.getInstance();
		List<MemberVO> list = service.memberList();

		JSONArray ary = new JSONArray();
		JSONObject obj = new JSONObject();

		System.out.println(JSONArray.toJSONString(list));
	}

}
