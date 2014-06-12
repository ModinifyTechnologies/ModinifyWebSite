package com.modinify.servlet;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.modinify.text.ParseText;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Locale locale = request.getLocale();
		String result[] = ParseText.parseTextToArray(request.getParameter("set"));
		
		if (result != null && result.length == 2){
			// setting manually bundle...
			locale = new Locale(result[0], result[1]);
		}
		
		ResourceBundle bundle = ResourceBundle.getBundle("com.modinify.messages.index", locale);
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/index.jsp");
		request.setAttribute( "Bundle", bundle);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
