package com.java.pizza_board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.java.pizza_board.dto.ADDto;

public class ADDao {  
	
	DataSource dataSource;
	
	//생성자
	public ADDao() {
		try {
			Context context=new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/orcl");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
	 
	public ADDto p_detail(String strID) {
		
		ADDto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;  //결과물
		
		try {
			
			connection = dataSource.getConnection();
			
			String query = "select * from pizza_board where pId=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(strID));
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				int pId = resultSet.getInt("pId");
				String pName = resultSet.getString("pName");
				int lprice = resultSet.getInt("lprice");
				int rprice = resultSet.getInt("rprice");
				int pQuantity = resultSet.getInt("pQuantity");
				int extPrice = resultSet.getInt("extPrice");
				String pContent = resultSet.getString("pContent");
				String picture_url = resultSet.getString("picture_url");
				
				dto = new ADDto(pId, pName, lprice, rprice, pQuantity, extPrice, pContent, picture_url);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet!=null) resultSet.close();
				if(preparedStatement!=null) preparedStatement.close();
				if(connection!=null) connection.close();
				
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dto;
	}
	
	public void modify(String pId,String pName,String lprice,String rprice,String picture_url) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			
			connection = dataSource.getConnection();
			String query = "update pizza_board set pName=?, lprice=?, rprice=?, picture_url=? where pId=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, pName);
			preparedStatement.setString(2, lprice);
			preparedStatement.setString(3, rprice);
			
			preparedStatement.setString(4, picture_url);
			preparedStatement.setInt(5, Integer.parseInt(pId));
			
			int rn = preparedStatement.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement !=null) preparedStatement.close();
				if(connection!=null) connection.close();
				
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
System.out.println("ddd");
	}
	
	public void delete(String strID) { 
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			
			connection = dataSource.getConnection();
			String query = "delete from pizza_board where pId=?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, Integer.parseInt(strID));
			int rn = preparedStatement.executeUpdate();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement!=null) preparedStatement.close();
				if(connection!=null) connection.close();
				
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	public void write(String pName,String lprice,String rprice,String pContent,String picture_url) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			
			connection = dataSource.getConnection();
			String query="insert into pizza_board (pId,pName,lprice,rprice,pQuantity,extPrice,pContent,picture_url) values (pizza_board_seq.nextval,?,?,?,0,0,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, pName);
			preparedStatement.setString(2, lprice);
			preparedStatement.setString(3, rprice);
			preparedStatement.setString(4, pContent);
			preparedStatement.setString(5, picture_url);
			
			int rn = preparedStatement.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(preparedStatement!=null) preparedStatement.close();
				if(connection!=null) connection.close();
			}catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	
	
	
	public ArrayList<ADDto> p_board() {
		
		ArrayList<ADDto> dtos=new ArrayList<ADDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query="select pId,pName,Lprice,Rprice,pQuantity,extPrice,pContent,picture_url from pizza_board";
			preparedStatement = connection.prepareStatement(query);
			resultSet =preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				int pId = resultSet.getInt("pId");
				String pName = resultSet.getString("pName");
				int lprice = resultSet.getInt("lprice");
				int rprice = resultSet.getInt("rprice");
				int pQuantity = resultSet.getInt("pQuantity");
				int extPrice = resultSet.getInt("extPrice");
				String pContent = resultSet.getString("pContent");
				String picture_url = resultSet.getString("picture_url");
				
				ADDto dto = new ADDto(pId, pName, lprice, rprice, pQuantity, extPrice, pContent, picture_url);
				dtos.add(dto);
			}
			System.out.println("p_board()");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet!=null) resultSet.close();
				if(preparedStatement!=null) preparedStatement.close();
				if(connection!=null) connection.close();
			}catch (Exception e2) {
				
			}
		}
		
		return dtos;
		
		
	}



	
}






























