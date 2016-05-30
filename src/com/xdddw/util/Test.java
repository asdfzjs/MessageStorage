package com.xdddw.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Test {//	{
//	   pageSize:10,  // 页码
//	   currentPage:1,  // 当前页
//	   totalCount:100,  // 总记录数
//	   totalPages:10,   // 总页数
//	   data:[           // 当前页查询的记录
//	           {id:1,name:'新生帝',age:22},
//	           {id:2,name:'流浪男',age:28}
//	   ]
//	}
	
	public static void main(String[] args) throws JSONException {
		JSONArray array = new JSONArray();
		JSONObject jsonObj1 = new JSONObject();
		jsonObj1.put("data", "[{id:1,name:'新生帝',age:22},{id:2,name:'流浪男',age:28}]");
		jsonObj1.put("totalCount", "111");
		System.out.println(jsonObj1);
	}

}
