package com.java.pizza_board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.pizza_board.dao.ADDao;
import com.java.pizza_board.dto.ADDto;

//피자리스트에서 상품클릭시 상세페이지로 들어가는 동작
public class ADContentCommand implements ADCommand{

	@Override
	public void execute(Model model) {
		
		Map<String, Object> map=model.asMap();
		HttpServletRequest request=(HttpServletRequest) map.get("request");   //리스트에서 가져온 화면
		String pId=request.getParameter("pId");  //id로 내용을 가져와라
		
		ADDao dao = new ADDao();
		System.out.println(">>pId>>"+pId);
		ADDto dto = dao.p_detail(pId);
		
		model.addAttribute("p_detail", dto);
		
	}

}
