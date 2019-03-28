package com.java.pizza_board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.java.pizza_board.dto.PIDto;

public class PIDao {

	DataSource dataSource;
	JdbcTemplate template=null;

	public PIDto bcontentView(String strId) {
		upHit(strId);

		PIDto dto = null;
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

				dto = new PIDto(pId, pName, pTitle, pContent, pDate, pHit, pGroup, pStep, pIndent);

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

	public void bwrite(final String pName,final String pTitle, final String pContent) {
		/*template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				String query="insert into pi_board(pId, pName, ptitle, pContent, pHit, pGroup, pStep, pIndent) values(pi_board_seq.nextval, ?,?,?,0,pi_board_seq.currval,0,0)";
				PreparedStatement ps = connection.prepareStatement(query);
				ps.setString(1, pName);
				ps.setString(2, pTitle);
				ps.setString(3, pContent);				
				return ps;
			}
		});*/
		
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = dataSource.getConnection();
			String query = "insert into pi_board(pId, pName, ptitle, pContent, pHit, pGroup, pStep, pIndent) values(pi_board_seq.nextval, ?,?,?,0,pi_board_seq.currval,0,0)";
			ps = connection.prepareStatement(query);
			ps.setString(1, pName);
			ps.setString(2, pTitle);
			ps.setString(3, pContent);

			int rn = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public PIDao() {
		/*template=Constant.template;
		System.out.println("template()"+template.getDataSource());*/
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/orcl");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<PIDto> board() {
		/*ArrayList<PIDto> dtos = null;
		String query = "select pId, pName, pTitle, pContent, pDate, pHit, pGroup, pStep, pIndent from pi_board order by pGroup desc, pStep asc";
		dtos=(ArrayList<PIDto>) template.query(query, new BeanPropertyRowMapper<PIDto>(PIDto.class));
*/
		ArrayList<PIDto> dtos = new ArrayList<PIDto>();
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

				PIDto dto = new PIDto(pId, pName, pTitle, pContent, pDate, pHit, pGroup, pStep, pIndent);
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

	public void bmodify(final String pId, final String pName, final String pTitle, final String pContent) {
		/*String query = "update pi_board set pName=?, pTitle=?, pContent=? where pId=?";
		template.update(query, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, pName);
				ps.setString(2, pTitle);
				ps.setString(3, pContent);
				ps.setInt(4, Integer.parseInt(pId));
				
			}
			
		});*/
		
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = dataSource.getConnection();
			String query = "update pi_board set pName=?, pTitle=?, pContent=? where pId=?";
			ps = connection.prepareStatement(query);

			ps.setString(1, pName);
			ps.setString(2, pTitle);
			ps.setString(3, pContent);
			ps.setInt(4, Integer.parseInt(pId));

			int rn = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void bdelete(String strId) {
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = dataSource.getConnection();
			String query = "delete from pi_Board where pId=?";
			ps = connection.prepareStatement(query);
			ps.setInt(1, Integer.parseInt(strId));
			int rn = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	

	private void upHit(String pId) {
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			connection = dataSource.getConnection();
			String query = "update pi_board set pHit = pHit + 1 where pId = ?";
			ps = connection.prepareStatement(query);
			ps.setString(1, pId);
			int rn = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
