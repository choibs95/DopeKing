package com.java.pizza_board.controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.pizza_board.dao.IDao;
import com.java.pizza_board.dto.DkUserDto;
import com.java.pizza_board.util.Constant;

@Controller
public class dkUserController {
	@Autowired
	private SqlSession sqlSession;
	
	
	@RequestMapping("/join_form")
	public String join_view(Model model) {
		System.out.println("passing join_view()");

		return "join_form";
		
	}
	@RequestMapping("/us_introduce")
	public String us_indtroduce() {
		System.out.println("passing login_view()");
		return "us_introduce";
	}
		@RequestMapping("/introduce")
		public String indtroduce() {
			System.out.println("passing login_view()");
			return "introduce";
	}
	@RequestMapping("/ad_introduce")
	public String ad_indtroduce() {
		System.out.println("passing login_view()");
		return "ad_introduce";
	}
	
	
	@RequestMapping("/login_form")
	public String login_form() {
		System.out.println("passing login_view()");
		return "login_form";
	}
	
	@RequestMapping("/us_index")
	public String us_index() {
		System.out.println("userindex()");
		return "us_index";
	}
	
	@RequestMapping("/join")
	public String join(HttpServletRequest request,Model model) {
		System.out.println("passing join()");
		String userId = request.getParameter("jfId");
		String userPassword = request.getParameter("jfPassword");
		String userName = request.getParameter("jfName");
		String userBirthday = request.getParameter("jfBirthday");
		String userGender = request.getParameter("jfGender");
		String userPhone = request.getParameter("jfPhone");
		String userAddress=request.getParameter("jfAddress");
		String userEmail=request.getParameter("jfEmail");

		IDao dao=sqlSession.getMapper(IDao.class);
		dao.MemberJoin(userId,userPassword,userName,userBirthday,userGender,userPhone,userAddress,userEmail);
		return "index2";
	}

	@RequestMapping("/join_result")
	public String join_resert(HttpServletRequest request,Model model) {
		String jfId = request.getParameter("jfId");
		String jfPassword = request.getParameter("jfPassword");
		String jfName = request.getParameter("jfName");
		String jfBirthday = request.getParameter("jfBirthday");
		String jfGender = request.getParameter("jfGender");
		String jfPhone = request.getParameter("jfPhone");
		String city = request.getParameter("city");
		String region = request.getParameter("region");
		String jfEmail = request.getParameter("jfEmail");
		String jfAddress=city+" "+region;
		
		System.out.println("city : "+city);
		System.out.println("region : "+region);
		System.out.println("jfAddress : "+jfAddress);
		
		model.addAttribute("userId",jfId);
		model.addAttribute("userPassword",jfPassword);
		model.addAttribute("userName",jfName);
		model.addAttribute("userBirthday",jfBirthday);
		model.addAttribute("userGender",jfGender);
		model.addAttribute("userPhone",jfPhone);
		model.addAttribute("userAddress",jfAddress);
		model.addAttribute("userEmail",jfEmail);
		return"join_result";
	}
	@RequestMapping("/login_controller")
	public ModelAndView login_control(HttpServletRequest request,Model model,HttpSession session) {
		System.out.println("passing login_control()");
		String userId=request.getParameter("jfId");
		String userPassword=request.getParameter("jfPassword");
		System.out.println("mIdCon  :" +userId);
		System.out.println("mPasswordCon  :" +userPassword);
		IDao dao=sqlSession.getMapper(IDao.class);
		System.out.println("1111111");
		DkUserDto dto=dao.login(userId);
		System.out.println("dto Con: "+dto);
		System.out.println("DBmId : "+dto.getUserId());
		System.out.println("DBmPassword : "+dto.getUserPassword());
		
		ModelAndView mav = new ModelAndView();
        mav.setViewName("login_controller");
 
 
        if (dto != null) {
            session.setAttribute("dto", dto);
            session.setAttribute("userPassword",userPassword);
            session.setAttribute("userId",userId);
        }
        return mav;
    }
		
//		model.addAttribute("dto",dto);
//		model.addAttribute("jfPassword",jfPassword);
//		model.addAttribute("jfId",jfId);
//		return "login_controller";
//	}
	@RequestMapping("/login_view")
	public String login_view() {
		System.out.println("passing login_view()");
		return "login_view";
	}
	@RequestMapping("/master_page")
	public String master_page() {
		System.out.println("passing master_page()");
		return"master_page";
	}
	@RequestMapping("/id_check")
	public String id_check(HttpServletRequest request,Model model) {
		System.out.println("passing id_check()");
		String userId=request.getParameter("jfId");
		System.out.println("jfId>>"+userId);
		
		return "test_page";
	}
	@RequestMapping("/test_page")
	public String test_page(HttpServletRequest request,Model model) {
		System.out.println("passing test_page()");
//		db 연결
			IDao dao=sqlSession.getMapper(IDao.class);
			System.out.println("DBconn >>"+dao);
			ResultSet rs=null;
			ArrayList<DkUserDto> dtos=null;
			dtos=dao.idCheck();
			System.out.println("dtos >>"+dtos);
			
			
			
			model.addAttribute("dtos",dtos);
		return "test_page";
	}
	@RequestMapping("/logout_controller")
	public String logout_controller() {
		System.out.println("passing logout_controller()");
		return "logout_controller";
		
	}
	@RequestMapping("/member_content_view")
	public String member_content_view(HttpServletRequest request,Model model) {
		String userId=request.getParameter("userId");
		
		IDao dao=sqlSession.getMapper(IDao.class);
		DkUserDto dto=null;
		dto=dao.membercontentView(userId);
		
		System.out.println("dto : "+dto);
		
		model.addAttribute("dto",dto);
		
		return "member_content_view";
	}

	@RequestMapping("/member_view")
	public String member_view(HttpServletRequest request,Model model,HttpSession session) {
		System.out.println("passing member_view()");
		String userId=(String) session.getAttribute("userId");
		System.out.println("session jfId : "+userId);
		IDao dao=sqlSession.getMapper(IDao.class);
		DkUserDto dto=null;
		dto=dao.memberView(userId);
		
		System.out.println("dto : "+dto);
		
		model.addAttribute("dto",dto);
		
		return "member_view";
	}
	@RequestMapping("/totalMember_view")
	public String totalMember_view(HttpServletRequest request,Model model,HttpSession session) {
		System.out.println("passing totalMember_view()");
		IDao dao=sqlSession.getMapper(IDao.class);
		ArrayList<DkUserDto> dtos=null;
		dtos=dao.totalMemberView(); 
		
		
		
		
		model.addAttribute("dtos",dtos);
		
		return "totalMember_view";
	}
	@RequestMapping("/member_modify")
	public String member_modify(HttpServletRequest request,Model model) {
		System.out.println("passing member_modify()");
		String userId=request.getParameter("jfId");
		String userAddress=request.getParameter("jfAddress");
		String userPhone=request.getParameter("jfPhone");
		IDao dao=sqlSession.getMapper(IDao.class);
		DkUserDto dto=null;
		dto=dao.memberModify(userId,userAddress,userPhone);
		System.out.println("dto : "+dto);
		model.addAttribute(dto);
		
		return "login_view";
	}
}
