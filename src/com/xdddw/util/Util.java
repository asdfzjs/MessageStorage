package com.xdddw.util;

import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.mysql.jdbc.ResultSetMetaData;

public class Util {
	//把ResultSet结果转换成json
	public static String resultSetToJson(ResultSet rs) throws SQLException,JSONException, UnsupportedEncodingException  
	{  
	   // json数组  
	   JSONArray array = new JSONArray();  
	   // 获取列数  
	   ResultSetMetaData metaData = (ResultSetMetaData) rs.getMetaData();  
	   int columnCount = metaData.getColumnCount();  
	   // 遍历ResultSet中的每条数据  
	    while (rs.next()) {  
	        JSONObject jsonObj = new JSONObject();  
	        // 遍历每一列  
	        for (int i = 1; i <= columnCount; i++) {  
	            String columnName =metaData.getColumnLabel(i);  
	            String value = rs.getString(columnName);    
	            jsonObj.put(columnName, value);  
	        }   
	        array.put(jsonObj);   
	    }  
	   return array.toString();  
	}  
}
