package com.scggi.reviews.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.scggi.reviews.model.dao.BoardDAO;
import com.scggi.reviews.model.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	BoardDAO boarddao;
	
	@Override
	public void create(BoardDTO boarddto) {
		// TODO Auto-generated method stub
		String title = boarddto.getB_TITLE();
		String content = boarddto.getB_CONTENT();
		String writer = boarddto.getB_WRITER();
		
//		title = title.replace("<", "&lt;");
//		title = title.replace(">", "&gt;");
//		writer = writer.replace("<", "&lt;");
//		writer = writer.replace(">", "&gt;");
//		title = title.replace(" ", "&nbsp;&nbsp;");
//		writer = writer.replace(" ", "&nbsp;&nbsp;");
//		content = content.replace("\n", "<br>");
		boarddto.setB_TITLE(title);
		boarddto.setB_CONTENT(content);
		boarddto.setB_WRITER(writer);
		boarddao.create(boarddto);
		
	}

	@Override
	public BoardDTO read(int B_NUMBER) {
		// TODO Auto-generated method stub
		return boarddao.read(B_NUMBER);
	}

	@Override
	public void update(BoardDTO boarddto) {
		// TODO Auto-generated method stub
		boarddao.update(boarddto);
	}

	@Override
	public void delete(int B_NUMBER) {
		// TODO Auto-generated method stub
		boarddao.delete(B_NUMBER);
	}

	@Override
	public List<BoardDTO> listall() {
		// TODO Auto-generated method stub
		return boarddao.listall();
	}

	@Override
	public void increaseViewcnt(int B_NUMBER, HttpSession session) {
		// TODO Auto-generated method stub
		boarddao.increaseViewcnt(B_NUMBER, session);
	}

	@Override
	public int boardListGetCount() {
		// TODO Auto-generated method stub
		return boarddao.boardListGetCount();
	}

	@Override
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map, int start, int end) {
		// TODO Auto-generated method stub
		return boarddao.selectBoardList(map, start, end);
	}

}
