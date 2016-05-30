package com.xdddw.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import com.xdddw.dao.UserDao;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int num = 0;
		System.out.println("login function !!!!!!!!!!!!!!");
		UserDao userdao = new UserDao();
		try {
			 num = userdao.FindUser(username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(num ==1){
			JSONObject jsonObj1 = new JSONObject();
			try {
				jsonObj1.put("res", "true");
				PrintWriter out = response.getWriter();
				out.write(jsonObj1.toString());
				out.flush();
				out.close();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
