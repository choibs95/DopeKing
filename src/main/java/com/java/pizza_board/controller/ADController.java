package com.java.pizza_board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.pizza_board.command.ADCommand;
import com.java.pizza_board.command.ADContentCommand;
import com.java.pizza_board.command.ADDeleteCommand;
import com.java.pizza_board.command.ADListCommand;
import com.java.pizza_board.command.ADModifyCommand;
import com.java.pizza_board.command.ADWriteCommand;
import com.java.pizza_board.dao.IDao;
import com.java.pizza_board.dto.CartDto;
import com.java.pizza_board.dto.DkUserDto;

@Controller
public class ADController {
	@Autowired
	private SqlSession sqlSession;

	ADCommand command;
	
	@RequestMapping("/p_board")
	public String p_board(Model model) {
		System.out.println("p_board()");   //리스트메소드가 시작되었다 명시
		
		command = new ADListCommand();
		command.execute(model);
		
		return "p_board";
	}
	//작성하는 화면
	@RequestMapping("/p_write")
	public String p_write(Model model) {
		System.out.println("p_write()"); 
		
		
		return "p_write";   //상세페이지로넘겨준다
	}
//폼에있는 데이터를 받아준다(write작성데이터)	
	@RequestMapping("/write")  
	public String write(HttpServletRequest request, Model model) {
		System.out.println("write()");
		
		model.addAttribute("request", request);
		command=new ADWriteCommand();
		command.execute(model);
		
		return "redirect:p_board";   
	} 
//컨텐츠를 보여주는 화면
	@RequestMapping("p_detail")   
	public String content_view(HttpServletRequest request,Model model) {
		System.out.println("p_detail()");
		
		model.addAttribute("request", request);
		command=new ADContentCommand();   //컨텐츠에 맞는 dao가 실행됨
		command.execute(model);
		
		return "p_detail";
	}
//수정
	@RequestMapping(method=RequestMethod.POST, value="/modify") 
	public String modify(HttpServletRequest request,Model model) {
		System.out.println("modify()");
		
		model.addAttribute("request", request);
		command=new ADModifyCommand();
		command.execute(model);
		
		return "redirect:p_board";
		
	}
//삭제
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request,Model model) {
		System.out.println("delete");
		
		model.addAttribute("request", request);
		command=new ADDeleteCommand();
		command.execute(model);
		
		return "redirect:p_board";
		
	}
	//장바구니
	@RequestMapping("/cart")
	public String cart(HttpServletRequest request,Model model) {
		System.out.println("passing cart()");
		String picture_url = request.getParameter("picture_url");
		String cName = request.getParameter("cName");
		String sPrice = request.getParameter("sPrice");
		String cPrice = request.getParameter("cPrice");
		String cQuantity = request.getParameter("cQuantity");
	
		
		
		System.out.println("p    :"+picture_url+"   n  : " +cName+"s: "+sPrice+" p "+cPrice+" q " +cQuantity);
	
		IDao dao=sqlSession.getMapper(IDao.class);
		
		dao.CartAdd(picture_url,cName,sPrice,cPrice,cQuantity);
		
		ArrayList<CartDto> dto= null;
		dto=dao.totalcartview();
		
		System.out.println("dao.totalcartview()"+dao.totalcartview());
		
		model.addAttribute("dtos",dto);
		
		return "cart";
	}
	@RequestMapping("/cart_view")
	public String cart_view(HttpServletRequest request,Model model) {
		
		IDao dao=sqlSession.getMapper(IDao.class);
		ArrayList<CartDto> dto= null;
		dto=dao.totalcartview();
		model.addAttribute("dtos",dto);
		return "cart_view";
	
	}
	@RequestMapping("/cart_delete")
	public String cart_delete(HttpServletRequest request,Model model) {
		IDao dao=sqlSession.getMapper(IDao.class);
		dao.CartDelete();
		
		return "cart_view";
		
	}
	
}
	















