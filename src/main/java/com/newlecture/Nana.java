package com.newlecture;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Nana
 */

//url mapping !!
@WebServlet("/hello")
public class Nana extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// UTF-8로 보냈어!!
		response.setCharacterEncoding("UTF-8");
		// UTF-8로 읽어!!
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

//		for (int i = 0; i < 5; i++) {
//			out.print((i + 1) + ": 안녕 Servlet!! <br/>");
//		}
//		// request 객체에서 받은 파라미터 "cnt"를 읽어서 정수형으로 변환
//		int cnt = Integer.parseInt(request.getParameter("cnt"));
//		// 변환해준 cnt만큼 출력
//		for (int i = 0; i < cnt; i++) {
//			out.print((i + 1) + ": 안녕 Servlet Parameter!! <br/>");
//		}
////				/hello?cnt=5      cnt = "5"
////				/hello?cnt=       cnt = ""
////				/hello?           cnt = null
////				/hello			  cnt = null
		//뒤에 파라미터 값이 어떤값이 올지 모를때 처리방법.
		String temp = request.getParameter("cnt");
		//기본값 설정.
		int cnt = 5;
		//입력받은 cnt 의 값이 null 이거나 ""(공백) 이 아니라면.
		if(temp != null && !temp.equals("")) {
			cnt = Integer.parseInt(temp);
		}
		
		for(int i=0;i<cnt;i++) {
			out.print((i+1)+": 안녕 Servlet!! <br/>");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
