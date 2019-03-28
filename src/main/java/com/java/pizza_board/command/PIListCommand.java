package com.java.pizza_board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.java.pizza_board.dao.PIDao;
import com.java.pizza_board.dto.PIDto;

public class PIListCommand implements PICommand {

	@Override
	public void execute(Model model) {
		PIDao dao=new PIDao();
		ArrayList<PIDto>dtos=dao.board();
		
		model.addAttribute("board",dtos);
		

	}

}
