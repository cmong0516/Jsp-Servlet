package com.newlecture;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class Calc extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// UTF-8로 보냈어!!
		response.setCharacterEncoding("UTF-8");
		// UTF-8로 읽어!!
		response.setContentType("text/html; charset=UTF-8");
		String x_ = request.getParameter("number");
		String y_ = request.getParameter("number2");
		String op = request.getParameter("button");

		int x = 0;
		int y = 0;

		if (!x_.equals(""))
			x = Integer.parseInt(x_);
		if (!y_.equals(""))
			y = Integer.parseInt(y_);

		int result = x + y;

		response.getWriter().printf("result is %d , %s\n", result, op);
	}

}
