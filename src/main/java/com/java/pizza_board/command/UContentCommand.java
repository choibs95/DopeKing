package com.java.pizza_board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.pizza_board.dao.UDao;
import com.java.pizza_board.dto.UDto;

public class UContentCommand implements UCommand {

	@Override
	public void execute(Model model) {
		Map<String, Object> map=model.asMap();
		HttpServletRequest request=(HttpServletRequest) map.get("request");
		String pId=request.getParameter("pId");
		
		UDao dao=new UDao();
		UDto dto=dao.ucontentView(pId);
		
		model.addAttribute("ucontent_view",dto);

	}

}
