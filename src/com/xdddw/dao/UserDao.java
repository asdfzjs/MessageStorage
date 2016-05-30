package com.xdddw.dao;

import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.JSONException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.xdddw.util.DBUtil;
import com.xdddw.util.Util;

public class UserDao {

	public int InsertUser(String username, String password) throws Exception{
		DBUtil dbUtil = new DBUtil();
		int num =0;
		Connection con = (Connection) dbUtil.getConnection();
		ResultSet rs = null;
		String sql = "insert into  user (username,password) values (? ,?)";
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
		ps.setString(1,username);
		ps.setString(2, password);
		num = ps.executeUpdate();
		return num;
	}

	public int FindUser(String username, String password) throws Exception {
		DBUtil dbUtil = new DBUtil();
		Connection con = (Connection) dbUtil.getConnection();
		ResultSet rs = null;
		String sql = "select * from  user where username = ? and password = ?";
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
		ps.setString(1,username);
		ps.setString(2, password);
		ResultSet resultSet=ps.executeQuery();
		if(resultSet.next()){
			return 1;
		}
		return 0;
	}

	

}
