package com.java.pizza_board.command;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.pizza_board.dao.ADDao;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class ADWriteCommand implements ADCommand{

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String attachPath = "resources\\upload\\"; //파일 업로드 경로
		
		String path = request.getSession().getServletContext().getRealPath(attachPath);
		System.out.println("주소 : " + path);
		MultipartRequest req = null;
		try {
			req = new MultipartRequest(request, path, 10 * 1024 * 1024, "UTF-8", new DefaultFileRenamePolicy());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		String pName = request.getParameter("pName");
//		String lprice = request.getParameter("lprice");
//		String rprice = request.getParameter("rprice");
//		String pContent = request.getParameter("pContent");
//		String picture_url = request.getParameter("picture_url");
		
		String pName = req.getParameter("pName");
		String lprice = req.getParameter("lprice");
		String rprice = req.getParameter("rprice");
		String pContent = req.getParameter("pContent");
		//String picture_url = req.getParameter("wFile");
		String picture_url =req.getFilesystemName("wFile");
		
		System.out.println(">>>lprice >>"+lprice);
		System.out.println(">>>rprice >>"+rprice);
		System.out.println(">>>picture_url >>"+picture_url);
		
		
		
		ADDao dao = new ADDao();
		dao.write(pName,lprice,rprice,pContent,picture_url);
		
	}

	
	

}
