package com.xdddw.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Test {//	{
//	   pageSize:10,  // ҳ��
//	   currentPage:1,  // ��ǰҳ
//	   totalCount:100,  // �ܼ�¼��
//	   totalPages:10,   // ��ҳ��
//	   data:[           // ��ǰҳ��ѯ�ļ�¼
//	           {id:1,name:'������',age:22},
//	           {id:2,name:'������',age:28}
//	   ]
//	}
	
	public static void main(String[] args) throws JSONException {
		JSONArray array = new JSONArray();
		JSONObject jsonObj1 = new JSONObject();
		jsonObj1.put("data", "[{id:1,name:'������',age:22},{id:2,name:'������',age:28}]");
		jsonObj1.put("totalCount", "111");
		System.out.println(jsonObj1);
	}

}
