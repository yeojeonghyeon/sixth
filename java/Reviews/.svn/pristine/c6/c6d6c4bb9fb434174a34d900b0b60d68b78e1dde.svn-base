package com.scggi.reviews.model.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.scggi.reviews.model.dto.MemberDTO;

@Repository // 현재 클래스를 스프링에서 관리하는 DAO Bean으로 설정한다는 의미
public class MemberDAOImpl implements MemberDAO {

	@Inject
	SqlSession sqlSession;
	
	@Override
	public void insertMember(MemberDTO memberdto) {
		sqlSession.insert("member.insertmember", memberdto);
		
	}

}
