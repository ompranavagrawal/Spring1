package com.cg.mobiles.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.mobiles.dto.Mobile;
import com.cg.mobiles.exception.MobileException;

public class MobileDaoImpl implements MobileDao {
	Connection conn;
	private int fetchMobileid() throws MobileException{
		int mid = 0;
		String sql = "SELECT seq_mobileid.nextval FROM DUAL";
		conn = DBConnection.getConnection();
		try {
			Statement st = conn.createStatement();
			ResultSet rst = st.executeQuery(sql);
			rst.next();
			mid = rst.getInt(1);
		} catch (SQLException e) {
			throw new MobileException("Problem in generating mobile id"
					+e.getMessage());
		}
		return mid;
	}

	@Override
	public int insertMobile(Mobile mobile) throws MobileException {
		mobile.setMobileid(fetchMobileid());
		String sql = "INSERT INTO mobiles VALUES(?,?,?,?)";
		conn = DBConnection.getConnection();
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, mobile.getMobileid());
			pst.setString(2, mobile.getMname());
			pst.setDouble(3, mobile.getPrice());
			pst.setInt(4, mobile.getQuantity());
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new MobileException("Problem in inserting mobile details "
					+e.getMessage());
		}
		return mobile.getMobileid();
	}
	@Override
	public Mobile fetchMobile(int mid) throws MobileException {
		Mobile mobile = null;
		String sql = "SELECT mobileid,name,price,quantity FROM mobiles WHERE mobileid=?";
		conn = DBConnection.getConnection();
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, mid);
			ResultSet rst = pst.executeQuery();
			if(rst.next()){
				mobile = new Mobile();
				mobile.setMobileid(rst.getInt("mobileid"));
				mobile.setMname(rst.getString("name"));
				mobile.setPrice(rst.getDouble("price"));
				mobile.setQuantity(rst.getInt("quantity"));
			}else{
				throw new MobileException("Mobile not found..");
			}
		} catch (SQLException e) {
			throw new MobileException("Problem in fetching mobile"+e.getMessage());
		}
		return mobile;
	}
	@Override
	public List<Mobile> getAllMobiles() throws MobileException {
		List<Mobile> mlist = new ArrayList<>();
		String sql = "SELECT mobileid,name,price,quantity FROM mobiles";
		conn = DBConnection.getConnection();
		try {
			Statement st = conn.createStatement();
			ResultSet rst = st.executeQuery(sql);
			while(rst.next()){
				Mobile m = new Mobile();
				m.setMobileid(rst.getInt("mobileid"));
				m.setMname(rst.getString("name"));
				m.setPrice(rst.getDouble("price"));
				m.setQuantity(rst.getInt("quantity"));
				mlist.add(m);
			}
		} catch (SQLException e) {
			throw new MobileException("Problem in fetching all mobiles "+e.getMessage());
		}
		return mlist;
	}
}
