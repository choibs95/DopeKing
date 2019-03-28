package com.java.pizza_board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.java.pizza_board.dao.ADDao;
import com.java.pizza_board.dto.ADDto;

public class ADListCommand implements ADCommand{ //dto객체를 화면에 뿌려주는 동작

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		
		ADDao dao=new ADDao();
		ArrayList<ADDto> dtos = dao.p_board();   //dtos로 받아서 model에 넣음
		
		model.addAttribute("p_board", dtos);
		
	}

}
