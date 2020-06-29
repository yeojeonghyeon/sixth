package com.scggi.reviews.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.scggi.reviews.model.dao.MemberDAO;
import com.scggi.reviews.model.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	MemberDAO memberdao;
	
	@Override
	public void insertMember(MemberDTO memberdto) {
		memberdao.insertMember(memberdto);
	}
}
