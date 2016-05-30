package com.xdddw.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.mysql.jdbc.ResultSetMetaData;
import com.xdddw.dao.IndexDao;
import com.xdddw.util.Util;

/**
 * Servlet implementation class IndexServlet
 */
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IndexServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	// {
	// pageSize:10, // 页码
	// currentPage:1, // 当前页
	// totalCount:100, // 总记录数
	// totalPages:10, // 总页数
	// data:[ // 当前页查询的记录
	// {id:1,name:'新生帝',age:22},
	// {id:2,name:'流浪男',age:28}
	// ]
	// }
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, String[]> params = request.getParameterMap();
		String pagesize = null;
		String currentPage = null;
		for (String key : params.keySet()) {
			String[] values = params.get(key);
			if (key.equals("pageSize")) {
				pagesize = values[0];
			} else {
				currentPage = values[0];
			}
		}
		// 返回表中的数据
		response.setContentType("text/html");
		response.setHeader("Cache-Control", "no-cache");
		response.setCharacterEncoding("utf-8");
		IndexDao indexDao = new IndexDao();

		int totalCount = 0;
		int totalPages = 0;
		if (pagesize != null) {
			// 计算一下总页数和总记录数
			try {
				totalCount = indexDao.GetCounts();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			totalPages = (totalCount - 1)/Integer.parseInt(pagesize) + 1;
		}
		try {
			// Util.resultSetToJson(rs);
			ResultSet rs = indexDao.GetArticleList(pagesize, currentPage);
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
					String columnName = metaData.getColumnLabel(i);
					String value = rs.getString(columnName).replaceAll("\r|\n", "");
					jsonObj.put(columnName, value);
				}
				jsonObj.put("totalCount", totalCount);
				 jsonObj.put("totalPages", totalPages);
				 jsonObj.put("pageSize", pagesize);
				 jsonObj.put("currentPage", currentPage);
				array.put(jsonObj);
			}
			PrintWriter out = response.getWriter();
			out.write(array.toString());
			System.out.println(array);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
