package com.scggi.reviews.model.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.scggi.reviews.model.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	SqlSession sqlSession;
	@Override
	public void create(BoardDTO boarddto) {
		// TODO Auto-generated method stub
		sqlSession.insert("board.insert", boarddto);
	}

	@Override
	public BoardDTO read(int B_NUMBER) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("board.boardView", B_NUMBER);
	}

	@Override
	public void update(BoardDTO boarddto) {
		// TODO Auto-generated method stub
		sqlSession.update("board.updateArticle", boarddto);
	}

	@Override
	public void delete(int B_NUMBER) {
		// TODO Auto-generated method stub
		sqlSession.delete("board.deleteArticle", B_NUMBER);
		
	}

	@Override
	public List<BoardDTO> listall() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("board.listAll");
	}

	@Override
	public void increaseViewcnt(int B_NUMBER, HttpSession session) {
		// TODO Auto-generated method stub
		sqlSession.update("board.increaseViewcnt", B_NUMBER);
		
	}

	@Override
	public int boardListGetCount() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("board.boardListGetCount");
		
	}

	@Override
	@SuppressWarnings("unckecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map, int start, int end) {
		// TODO Auto-generated method stub
		map.put("START", start);
		map.put("END", end);
		System.out.println(map);
		List<Map<String, Object>> list = sqlSession.selectList("board.selectBoardList", map);
		return list;
	}

}
