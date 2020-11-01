package com.DynamicDate;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServelet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Date d = new Date();
		String currentDate = d.toString();
		String response = "<html>\r\n" + "<title>Dynamic Web Resource</title>\r\n" + "<body>\r\n"
				+ "<h1>The current Date &Time==>\r\n" + "</br>\r\n" + "<font color=\"red\">currentDate</font>\r\n"
				+ "</h1>\r\n" + "</body>\r\n" + "</html>";
		resp.setContentType("text/html");
		resp.setHeader("refresh", "5");
		PrintWriter out = resp.getWriter();
		out.print(response);

	}
}
