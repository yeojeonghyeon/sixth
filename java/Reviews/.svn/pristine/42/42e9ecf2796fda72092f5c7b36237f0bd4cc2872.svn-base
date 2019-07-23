package com.scggi.reviews.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.scggi.reviews.model.dto.BoardDTO;

public interface BoardService {
	public void create(BoardDTO boarddto);
	public BoardDTO read(int B_NUMBER);
	public void update(BoardDTO boarddto);
	public void delete(int B_NUMBER);
	public List<BoardDTO> listall();
	public void increaseViewcnt(int B_NUMBER, HttpSession session);
	public int boardListGetCount();
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map, int start, int end);
	
}
