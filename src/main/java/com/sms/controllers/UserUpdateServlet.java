package com.sms.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.bussines.UserService;
import com.sms.dto.UserDTO;
import com.sms.dto.common.ResponseDTO;
import com.sms.interfaces.IUserService;

/**
 * Servlet implementation class UserUpdateServlet
 */
@WebServlet("/UserUpdateServlet")
public class UserUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	UserDTO userDto = new UserDTO();
	    userDto.setId(Integer.parseInt(request.getParameter("id")) );
		userDto.setFirstName(request.getParameter("firstName"));
		userDto.setLastName(request.getParameter("lastName"));
		userDto.setPhoneNumber(request.getParameter("phoneNumber"));
		userDto.setEmail(request.getParameter("email"));
		
		
		
		String dispachPage = null;
		
		try {
			
			IUserService userService = new UserService();
			ResponseDTO result = userService.updateUser(userDto);
			
			if(result.isSucces() == true) {
				RequestDispatcher disatcher = request.getRequestDispatcher("GetAllUsersServlet");
				disatcher.forward(request, response);
				
				
			}else {
				RequestDispatcher disatcher = request.getRequestDispatcher("GetAllUsersServlet");
				disatcher.forward(request, response);
				
			}
			
			
			
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
