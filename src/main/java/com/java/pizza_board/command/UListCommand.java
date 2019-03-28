package com.java.pizza_board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.java.pizza_board.dao.UDao;
import com.java.pizza_board.dto.UDto;

public class UListCommand implements UCommand {

	@Override
	public void execute(Model model) {
		UDao dao=new UDao();
		ArrayList<UDto>dtos=dao.uboard();
		
		model.addAttribute("uboard",dtos);

	}

}
