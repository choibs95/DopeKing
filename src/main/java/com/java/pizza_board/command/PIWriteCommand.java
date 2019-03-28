package com.java.pizza_board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.pizza_board.dao.PIDao;

public class PIWriteCommand implements PICommand {

	@Override
	public void execute(Model model) {
		
		Map<String, Object> map=model.asMap();
		HttpServletRequest request=(HttpServletRequest) map.get("request");
		
		String pName=request.getParameter("pName");
		String pTitle=request.getParameter("pTitle");
		String pContent=request.getParameter("pContent");
		
		PIDao dao=new PIDao();
		dao.bwrite(pName,pTitle,pContent);
		

	}

}
