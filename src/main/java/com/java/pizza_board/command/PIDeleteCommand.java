package com.java.pizza_board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.pizza_board.dao.PIDao;

public class PIDeleteCommand implements PICommand {

	@Override
	public void execute(Model model) {
		
		Map<String, Object> map=model.asMap();
		HttpServletRequest request=(HttpServletRequest) map.get("request");
		
		String pId=request.getParameter("pId");
		
		PIDao dao= new PIDao();
		dao.bdelete(pId);
		
		

	}

}
