package com.sms.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.bussines.UserService;
import com.sms.dto.common.ResponseDTO;
import com.sms.interfaces.IUserService;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		try {
			IUserService userService = new UserService();
			ResponseDTO result = userService.deleteUser(id);
			
			if(result.isSucces() == true) {
				RequestDispatcher disatcher = request.getRequestDispatcher("GetAllUsersServlet");
				disatcher.forward(request, response);
				
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	

}
