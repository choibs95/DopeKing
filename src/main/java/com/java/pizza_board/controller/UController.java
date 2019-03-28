package com.java.pizza_board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.pizza_board.command.UCommand;
import com.java.pizza_board.command.UContentCommand;
import com.java.pizza_board.command.UListCommand;

@Controller
public class UController {
	UCommand command;
	
	@RequestMapping("/uboard")
	public String board(Model model) {
		System.out.println("uboard()");
		
		command=new UListCommand();
		command.execute(model);
		return "uboard";
	}
	@RequestMapping("/ucontent_view")
	public String content_view(HttpServletRequest request,Model model) {
		System.out.println("ucontent_view");
		
		model.addAttribute("request",request);
		command=new UContentCommand();
		command.execute(model);
		return "ucontent_view";
	}

}
