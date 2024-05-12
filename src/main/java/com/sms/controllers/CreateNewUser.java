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
import com.sms.model.User;

/**
 * Servlet implementation class CreateNewUser
 */
@WebServlet("/CreateNewUser")
public class CreateNewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateNewUser() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
				UserDTO userDto = new UserDTO();
				
				userDto.setFirstName(request.getParameter("firstName"));
				userDto.setLastName(request.getParameter("lastName"));
				userDto.setPhoneNumber(request.getParameter("phoneNumber"));
				userDto.setEmail(request.getParameter("email"));
				userDto.setRoleId(Integer.parseInt(request.getParameter("role")));
				userDto.setPassword(request.getParameter("password"));
				
				String dispachPage = null;
				
				try {
					
					IUserService userService = new UserService();
					ResponseDTO result = userService.createNewUser(userDto);
					
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


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		UserDTO userDto = new UserDTO();
		
		userDto.setFirstName(request.getParameter("firstName"));
		userDto.setLastName(request.getParameter("lastName"));
		userDto.setPhoneNumber(request.getParameter("phoneNumber"));
		userDto.setEmail(request.getParameter("email"));
		userDto.setRoleId(Integer.parseInt(request.getParameter("role")));
		userDto.setPassword(request.getParameter("password"));
		
		String dispachPage = null;
		
		try {
			
			IUserService userService = new UserService();
			ResponseDTO result = userService.createNewUser(userDto);
			
			if(result.isSucces() == true) {
				RequestDispatcher disatcher = request.getRequestDispatcher("userDetails.jsp");
				disatcher.forward(request, response);
				
				
			}else {
				RequestDispatcher disatcher = request.getRequestDispatcher("userDetails.jsp");
				disatcher.forward(request, response);
				
			}
			
			
			
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
	}

}
