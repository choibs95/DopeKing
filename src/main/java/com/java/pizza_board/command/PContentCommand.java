package com.java.pizza_board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.pizza_board.dao.ADDao;
import com.java.pizza_board.dao.IDao;
import com.java.pizza_board.dao.PDao;
import com.java.pizza_board.dto.ADDto;
import com.java.pizza_board.dto.PDto;

public class PContentCommand implements PCommand{

	@Override
	public void execute(Model model) {

//		Map<String, Object> map=model.asMap();
//		HttpServletRequest request=(HttpServletRequest) map.get("request");   //리스트에서 가져온 화면
//		String pId=request.getParameter("pId");  //id로 내용을 가져와라
//		
//		IDao dao =new IDao();
//		System.out.println(">>Pcontentcommand pId>>"+pId);
//		ADDto dto = dao.user_p_detail(pId);
//		
//		model.addAttribute("user_p_detail", dto);
//		
	}

}
