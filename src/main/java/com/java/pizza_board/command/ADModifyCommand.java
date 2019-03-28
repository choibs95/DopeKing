package com.java.pizza_board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.pizza_board.dao.ADDao;

public class ADModifyCommand implements ADCommand{

   @Override
   public void execute(Model model) {
      // TODO Auto-generated method stub
      Map<String, Object> map=model.asMap();
      HttpServletRequest request = (HttpServletRequest) map.get("request");
      System.out.println("신호신호신호");
      
      String fName=request.getParameter("fName");
      System.out.println("fName Commandcommand>>>>>>>>>>>>>>>>"+fName);
      
      
      //content_view에서 가져오는 정보들
      String pId = request.getParameter("pId");   
      String pName = request.getParameter("pName");
      String lprice = request.getParameter("lprice");
      String rprice = request.getParameter("rprice");
//      String picture_url = request.getParameter("picture_url");
      
      System.out.println("pId >>>> "+ pId);
      System.out.println("pId >>>> "+ pName);
      
      
      
      ADDao dao = new ADDao();
      dao.modify(pId,pName,lprice,rprice,fName);
      
   }

}