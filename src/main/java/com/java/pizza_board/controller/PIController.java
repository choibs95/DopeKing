package com.java.pizza_board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.pizza_board.command.PICommand;
import com.java.pizza_board.command.PIContentCommand;
import com.java.pizza_board.command.PIDeleteCommand;
import com.java.pizza_board.command.PIListCommand;
import com.java.pizza_board.command.PIModifyCommand;
import com.java.pizza_board.command.PIWriteCommand;

@Controller
public class PIController {
	
	PICommand command;
	
	@RequestMapping("/adboard")
	public String board(Model model) {
		System.out.println("adboard()");
		
		command=new PIListCommand();
		command.execute(model);
		return "adboard";
	}
	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view()");
		
		return "write_view";
	}
	@RequestMapping("/bwrite")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("bwrite()");
		
		model.addAttribute("request",request);
		command=new PIWriteCommand();
		command.execute(model);
		
		return "redirect:adboard";
	}
	@RequestMapping("/bcontent_view")
	public String content_view(HttpServletRequest request,Model model) {
		System.out.println("bcontent_view");
		
		model.addAttribute("request",request);
		command=new PIContentCommand();
		command.execute(model);
		return "bcontent_view";
	}
	@RequestMapping(method= RequestMethod.POST,value="/bmodify")
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("bmodify()");
		
		model.addAttribute("request",request);
		command=new PIModifyCommand();
		command.execute(model);
		return "redirect:adboard";
	}
	
	@RequestMapping("/bdelete")
	public String delete(HttpServletRequest request,Model model) {
		System.out.println("bdelete()");
		
		model.addAttribute("request",request);
		command=new PIDeleteCommand();
		command.execute(model);
		return "redirect:adboard";
	}

}
