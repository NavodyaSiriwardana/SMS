package com.sms.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.bussines.UserService;
import com.sms.dto.BasicUserDetailDTO;
import com.sms.dto.common.ResponseDTO;
import com.sms.interfaces.IUserService;

/**
 * Servlet implementation class GetAllUsersServlet
 */
@WebServlet("/GetAllUsersServlet")
public class GetAllUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllUsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		try {
			IUserService userService = new UserService();
			List<BasicUserDetailDTO> listOfUsers = userService.getUsers();
			
			request.setAttribute("listOfUsers", listOfUsers);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("userList.jsp");
			dispatcher.forward(request, response);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	

}
