package com.newlecture;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class NoticeReg extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// UTF-8로 보냈어!!
		response.setCharacterEncoding("UTF-8");
		// UTF-8로 읽어!!
		response.setContentType("text/html; charset=UTF-8");
		// UTF-8로 받아!!
		
		PrintWriter out = response.getWriter();
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");

		out.println(title);
		out.println(content);
	}


}
