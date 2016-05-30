package com.xdddw.dao;

import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.JSONException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.xdddw.util.DBUtil;
import com.xdddw.util.Util;

public class IndexDao {

	public ResultSet GetArticleList(String pagesize, String currentPage) throws Exception {
		DBUtil dbUtil = new DBUtil();
		Connection con = (Connection) dbUtil.getConnection();
		ResultSet rs = null;
		int a = Integer.parseInt(pagesize);
		int b = Integer.parseInt(currentPage);
		String sql = "select id,content,title,addTime,image from content limit "+(b-1)*a+","+a;
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
		rs = ps.executeQuery();
		return rs;
	}

	public int GetCounts() throws Exception {
		DBUtil dbUtil = new DBUtil();
		Connection con = (Connection) dbUtil.getConnection();
		ResultSet rs = null;
		String sql = "select count(1) from content";
		PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
		rs =  ps.executeQuery();
		int sum = 0;
		while(rs.next()){
			sum = rs.getInt(1);
		}
		return sum;
	}

}
