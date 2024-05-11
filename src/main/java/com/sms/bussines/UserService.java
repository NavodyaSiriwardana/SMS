package com.sms.bussines;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.sms.data.DbContext;
import com.sms.interfaces.IUserService;
import com.sms.model.User;

public class UserService  implements IUserService{
	
	private static Connection _dbConnection = null;
	private static Statement _myStatement = null;
	private static ResultSet _resultSet = null;
	private static PreparedStatement _preparedStatement = null;

	@Override
	public User login(String emai, String password) {

		User user = new User();
		
		try {
			_dbConnection = DbContext.getConnection();
			
			String query = "SELECT * user WHERE email = ? AND password = ?";
			
			_preparedStatement = _dbConnection.prepareStatement(query);
			_preparedStatement.setString(1, emai);
			_preparedStatement.setString(2, password);
			
			_resultSet = _preparedStatement.executeQuery();
			
			if(_resultSet.next()) {
				user.setId(_resultSet.getInt("id"));
				user.setFirstName(_resultSet.getString("firstName"));
				user.setRoleId(_resultSet.getInt("roleid"));

			}
			
			_dbConnection.close();
			
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		return user;
	}

}
