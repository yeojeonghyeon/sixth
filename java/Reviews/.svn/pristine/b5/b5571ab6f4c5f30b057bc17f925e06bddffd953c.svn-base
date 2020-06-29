package com.scggi.reviews.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.scggi.reviews.boardpage.BoardPaging;
import com.scggi.reviews.model.dto.BoardDTO;
import com.scggi.reviews.model.dto.MemberDTO;
import com.scggi.reviews.service.BoardService;
import com.scggi.reviews.service.MemberService;



@Controller
public class HomeController {
	
	@Inject
	MemberService memberservice;
	@Inject
	BoardService boardservice;
	
	
	// 홈화면
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home( Model model) {
		return "Home";
	}
	@RequestMapping("main")
	public String main() {
		return "Home";
	}
	// 로그인 화면
	@RequestMapping("login.do")
	public String login() {
		return "loginForm";
	}
	// 회원가입 페이지 이동
	@RequestMapping("join.do")
	public String join() {
		return "loginInfo/joinForm";
	}
	// 회원가입 완료
	@RequestMapping("memberJoin.do")
	public String login(MemberDTO memberdto) {
		memberservice.insertMember(memberdto);
		return "loginForm";
	}
	// 글쓰기 화면
	@RequestMapping("Board.do")
	public String Board() {
		return "board/boardWriter";
	}
	// 글쓰기 완료
	@RequestMapping("insertBoard.do")
	public String insertBoard(BoardDTO boarddto) {
		boardservice.create(boarddto);
		return "Home";
	}
	// 글 목록
	@RequestMapping("BoardList.do")
	public ModelAndView list(HttpServletRequest request, Map<String, Object> commandMap, @RequestParam(value="curPage", defaultValue="1")int curPage) {
		// 전체 게시글 레코드의 갯수
		int count = boardservice.boardListGetCount();
		BoardPaging paging = new BoardPaging(count, curPage);
		// 현재 페이지 번호
		int start = paging.getPageBegin();
		// 현재 페이지 끝 번호
		int end = paging.getPageEnd();
		List<Map<String, Object>> list = boardservice.selectBoardList(commandMap, start, end);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		map.put("count", count);
		map.put("paging", paging);
		
		ModelAndView mav = new ModelAndView("board/boardList");
		mav.addObject("map", map);
		return mav;
	}
	
	//글 상세내용 조회 및 조회수 증가
	@RequestMapping("BoardView.do")
	public ModelAndView View(@RequestParam int B_NUMBER, HttpSession session) {
		boardservice.increaseViewcnt(B_NUMBER, session);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/boardView");
		mav.addObject("boarddto", boardservice.read(B_NUMBER));
		return mav;
	}
	
	// 글 삭제
	@RequestMapping("BoardDelete.do")
	public String delete(@RequestParam int B_NUMBER) {
		boardservice.delete(B_NUMBER);
		return "redirect:BoardList.do";
	}
	
	// 글 수정
	@RequestMapping("BoardUpdate.do")
	public String update(@ModelAttribute BoardDTO boarddto) {
		boardservice.update(boarddto);
		return "redirect:BoardList.do";
	}
	

	
}
