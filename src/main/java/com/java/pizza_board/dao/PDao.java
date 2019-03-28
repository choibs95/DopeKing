package com.java.pizza_board.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.java.pizza_board.dto.ADDto;
import com.java.pizza_board.dto.CartDto;
import com.java.pizza_board.dto.DkUserDto;
import com.java.pizza_board.dto.PDto;
import com.java.pizza_board.dto.SDto;
import com.java.pizza_board.util.Constant;

public class PDao implements IDao{

	DataSource dataSource;
	JdbcTemplate template = null; // 추가된 내용



	/*public PDto contentView(String strId) {
		
		String sql = "select * from pizza_board where pId="+strId;
		PDto dto = template.queryForObject(sql, new BeanPropertyRowMapper<PDto>(PDto.class));
		return dto;
	}*/

	

	public PDao() {
		template = Constant.template;
	}
	
	public ArrayList<PDto> list() {
		ArrayList<PDto> dtos = null;

		return dtos;
	}
	public ArrayList<SDto> side() {
		ArrayList<SDto> sdtos = null;

		return sdtos;
	}
	

	

	

	@Override
	public int selectBoard2Count() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public PDto detailPDto(String pId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void MemberJoin(String userId, String userPassword, String userName, 
			String userBirthday, String userGender, String userphone,String userAddress,String userEmail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DkUserDto login(String jfId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DkUserDto> idCheck() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DkUserDto memberView(String jfId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DkUserDto> totalMemberView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DkUserDto memberModify(String jfNo, String jfAddress, String jfPhone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DkUserDto membercontentView(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ADDto user_p_detail(String pId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PDto> us_list() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public ArrayList<CartDto> totalcartview() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void CartAdd(String picture_url, String cName, String sPrice, String cPrice, String cQuantity) {
		// TODO Auto-generated method stub
	}

	@Override
	public void CartDelete() {
		// TODO Auto-generated method stub
		
	}



	
}