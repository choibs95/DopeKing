package com.java.pizza_board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.java.pizza_board.dto.PIDto;
import com.java.pizza_board.dto.UDto;

public class UDao {
	DataSource dataSource;
	
	public UDao() {
		/*template=Constant.template;
		System.out.println("template()"+template.getDataSource());*/
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/orcl");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<UDto> uboard() {
		ArrayList<UDto> dtos = new ArrayList<UDto>();
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			connection = dataSource.getConnection();
			String query = "select pId, pName, pTitle, pContent, pDate, pHit, pGroup, pStep, pIndent from pi_board order by pGroup desc, pStep asc";
			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				int pId = rs.getInt("pId");
				String pName = rs.getString("pName");
				String pTitle = rs.getString("pTitle");
				String pContent = rs.getString("pContent");
				Timestamp pDate = rs.getTimestamp("pDate");
				int pHit = rs.getInt("pHit");
				int pGroup = rs.getInt("pGroup");
				int pStep = rs.getInt("pStep");
				int pIndent = rs.getInt("pIndent");

				UDto dto = new UDto(pId, pName, pTitle, pContent, pDate, pHit, pGroup, pStep, pIndent);
				dtos.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {

			}
		}

		return dtos;

	}

	public UDto ucontentView(String strId) {
		UDto dto = null;
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		/*PIDto dto=null;
		String query = "select * from pi_board where pId=?";
		dto=template.queryForObject(query, new BeanPropertyRowMapper<PIDto>(PIDto.class));*/

		try {
			connection = dataSource.getConnection();
			String query = "select * from pi_board where pId=?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, Integer.parseInt(strId));
			rs = ps.executeQuery();

			if (rs.next()) {
				int pId = rs.getInt("pId");
				String pName = rs.getString("pName");
				String pTitle = rs.getString("pTitle");
				String pContent = rs.getString("pContent");
				Timestamp pDate = rs.getTimestamp("pDate");
				int pHit = rs.getInt("pHit");
				int pGroup = rs.getInt("pGroup");
				int pStep = rs.getInt("pStep");
				int pIndent = rs.getInt("pIndent");

				dto = new UDto(pId, pName, pTitle, pContent, pDate, pHit, pGroup, pStep, pIndent);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return dto;
	}

}
