package com.xdddw.util;

import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.mysql.jdbc.ResultSetMetaData;

public class Util {
	//��ResultSet���ת����json
	public static String resultSetToJson(ResultSet rs) throws SQLException,JSONException, UnsupportedEncodingException  
	{  
	   // json����  
	   JSONArray array = new JSONArray();  
	   // ��ȡ����  
	   ResultSetMetaData metaData = (ResultSetMetaData) rs.getMetaData();  
	   int columnCount = metaData.getColumnCount();  
	   // ����ResultSet�е�ÿ������  
	    while (rs.next()) {  
	        JSONObject jsonObj = new JSONObject();  
	        // ����ÿһ��  
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
