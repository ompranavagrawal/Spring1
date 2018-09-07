package com.cg.mobiles.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.cg.mobiles.exception.MobileException;

public class DBConnection {
	private static Connection conn;
	public static Connection getConnection() throws MobileException{
		if(conn==null){
			try {
				InitialContext ic = new InitialContext();
				DataSource ds = (DataSource)ic.lookup("java:/jdbc/jeeDS");
				conn = ds.getConnection();
			} catch (NamingException e) {
				throw new MobileException("Datasource not found"
						+e.getMessage());
			} catch (SQLException e) {
				throw new MobileException("Problem in obtaining connection"
						+e.getMessage());			
			}
		}
		return conn;
	}
}
