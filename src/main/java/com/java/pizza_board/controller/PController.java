package com.java.pizza_board.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.pizza_board.command.ADContentCommand;
import com.java.pizza_board.command.PCommand;
import com.java.pizza_board.command.PContentCommand;
import com.java.pizza_board.dao.IDao;
import com.java.pizza_board.dto.ADDto;
import com.java.pizza_board.util.Constant;



@Controller
public class PController {
	PCommand command;
	public JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model) throws Exception{
		System.out.println("list()");
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("list", dao.list());
		
		return "list";
	}
	
	@RequestMapping("/us_list")
	public String us_list(HttpServletRequest request, Model model) throws Exception{
		System.out.println("us_list()");
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("us_list", dao.list());
		
		return "us_list";
	}
	
	@RequestMapping("user_p_detail")   
	public String user_p_detail(HttpServletRequest request,Model model) {
	
		String pId= request.getParameter("pId");
		
		IDao dao =sqlSession.getMapper(IDao.class);
		System.out.println(">>Pcontentcommand pId>>"+pId);
		ADDto dto = dao.user_p_detail(pId);
		System.out.println("ADDto>>>>>"+dto);
		model.addAttribute("user_p_datail", dto);	
			
		
//		System.out.println("userrrr");
//		model.addAttribute("request", request);
//		command=new PContentCommand();   //컨텐츠에 맞는 dao가 실행됨
//		command.execute(model);
		
			
		return "user_p_detail";
		
	
	}
	
	
	
	@RequestMapping("/side")
	public String side(HttpServletRequest request, Model model) throws Exception{
		System.out.println("side()");
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("side", dao.side());
		
		return "side";
	}
	
	@RequestMapping("/us_side")
	public String us_side(HttpServletRequest request, Model model) throws Exception{
		System.out.println("side()");
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("side", dao.side());
		
		return "us_side";
	}
	
}










