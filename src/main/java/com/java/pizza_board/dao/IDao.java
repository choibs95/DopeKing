package com.java.pizza_board.dao;

import java.util.ArrayList;

import com.java.pizza_board.dto.ADDto;
import com.java.pizza_board.dto.CartDto;
import com.java.pizza_board.dto.DkUserDto;
import com.java.pizza_board.dto.PDto;
import com.java.pizza_board.dto.SDto;

public interface IDao {
	
	public ArrayList<PDto> list();
	public ArrayList<PDto> us_list();
	public ArrayList<SDto> side();
	public int selectBoard2Count();
	PDto detailPDto(String pId);
	
	public void MemberJoin(String userId, String userPassword, String userName, 
			String userBirthday, String userGender, String userphone,String userAddress,String userEmail);
	
	public DkUserDto login(String userId);

	public ArrayList<DkUserDto> idCheck();

	public DkUserDto memberView(String userId);

	public ArrayList<DkUserDto> totalMemberView();

	public DkUserDto memberModify(String userId, String userAddress, String userPhone);
	public DkUserDto membercontentView(String userId);
	public ADDto user_p_detail(String pId);
	public ArrayList<CartDto> totalcartview();
	public void CartAdd(String picture_url, String cName, String sPrice, String cPrice, String cQuantity);
	public void CartDelete();
}










