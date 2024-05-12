package com.sms.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.bussines.UserService;
import com.sms.interfaces.IUserService;
import com.sms.model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    } 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		response.setContentType("text/html");
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		String dispachPage = null;
		
		try {
			
			IUserService userService = new UserService();
			User user = userService.login(email, password);
			
			if(user != null) {
				if(user.getRoleId() == 1) {
					dispachPage = "admin.jsp";
				}
			}
			
			HttpSession sesstion = request.getSession();
			sesstion.setAttribute("user", user);
			
			RequestDispatcher disatcher = request.getRequestDispatcher(dispachPage);
			disatcher.forward(request, response);
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
