package com.sms.bussines;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sms.data.DbContext;
import com.sms.dto.BasicUserDetailDTO;
import com.sms.dto.UserDTO;
import com.sms.dto.common.ResponseDTO;
import com.sms.interfaces.IUserService;
import com.sms.model.User;

public class UserService  implements IUserService{
	
	private static Connection _dbConnection = null;
	private static Statement _statement = null;
	private static ResultSet _resultSet = null;
	private static PreparedStatement _preparedStatement = null;

	@Override
	public User login(String emai, String password) {

		User user = new User();
		
		try {
			_dbConnection = DbContext.getConnection();
			
			String query = "SELECT id, firstName, roleId FROM user  WHERE email=? AND password=?";
			
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

	@Override
	public ResponseDTO createNewUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
	   ResponseDTO response = new ResponseDTO();
		
	   try {
		   _dbConnection = DbContext.getConnection();
		   String query = "INSERT INTO user VALUES(0,?,?,?,?,?,'1',?)";
		   _preparedStatement =_dbConnection.prepareStatement(query);
		   
		   _preparedStatement.setString(1, userDTO.getFirstName());
		   _preparedStatement.setString(2, userDTO.getLastName());
		   _preparedStatement.setString(3, userDTO.getEmail());
		   _preparedStatement.setString(4, userDTO.getPhoneNumber());
		   _preparedStatement.setString(5, userDTO.getPassword());
		   _preparedStatement.setInt(6, userDTO.getRoleId());
		   
		   
		   int resultSet = _preparedStatement.executeUpdate();
		   
		   if(resultSet > 0) {
			   response.setMassage("User has been saved successfully.");
			   response.setSucces(true);
		   }else {
			   response.setMassage("User has been saved Faild");
			   response.setSucces(false);
		   }
		   
		   _dbConnection.close();
		   
	} catch (Exception ex) {
		ex.printStackTrace();
		response.setMassage("Error has been ocurred please try again.");
		response.setSucces(false);
	}
	   return response;
	}

	@Override
	public List<BasicUserDetailDTO> getUsers() {
		
		List<BasicUserDetailDTO> listOfUsers = new ArrayList<>();
		   try {
		   _dbConnection = DbContext.getConnection();
		   _statement = _dbConnection.createStatement();
		   String query = "SELECT id, firstName, lastName, email, phoneNumber, roleId FROM user WHERE isactive=1";
			_resultSet =  _statement.executeQuery(query);
			
			while(_resultSet.next()) {
				BasicUserDetailDTO basicUserDetails = new BasicUserDetailDTO();
				
				basicUserDetails.setId(_resultSet.getInt("id"));
				basicUserDetails.setFirstName(_resultSet.getString("firstName"));
				basicUserDetails.setLastName(_resultSet.getString("lastName"));
				basicUserDetails.setPhoneNumber(_resultSet.getString("phoneNumber"));
				basicUserDetails.setEmail(_resultSet.getString("email"));
				basicUserDetails.setRoleId( _resultSet.getInt("roleId"));
				mapRoleName(basicUserDetails, _resultSet.getInt("roleId"));
				
				listOfUsers.add(basicUserDetails);
 				
			}
		} catch (SQLException ex) {
		
			ex.printStackTrace();
		}
		   
		
		return listOfUsers;
	}
	
	@Override
	public ResponseDTO deleteUser(int id) {
         ResponseDTO response = new ResponseDTO();
         
         try {
        	 _dbConnection = DbContext.getConnection();
  		   String query = "DELETE FROM user WHERE id = ? ";
  		   _preparedStatement =_dbConnection.prepareStatement(query);
  		   
  		 _preparedStatement.setInt(1, id);
  		 
  		int resultSet = _preparedStatement.executeUpdate();
  		
  	   
		if(resultSet > 0) {
			   response.setMassage("User has been Deleted successfully.");
			   response.setSucces(true);
		   }else {
			   response.setMassage("User Delete Faild");
			   response.setSucces(false);
		   }
		   
		   _dbConnection.close();
		   
  		 
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setMassage("Error has been ocurred please try again.");
			response.setSucces(false);
		}
         
         return response;
	}
	
	private void mapRoleName(BasicUserDetailDTO basicUserDetails, int roleId) {
		switch (roleId) {
		case 1: {
			
			basicUserDetails.setRoleName("Admin");
			break;
		}
		case 2 :{
			basicUserDetails.setRoleName("Principle");
			break;
		}
		
		case 3 :{
			basicUserDetails.setRoleName("Teacher");
			break;
		}
		case 4 :{
			basicUserDetails.setRoleName("Officer");
			break;
		}
		case 5 :{
			basicUserDetails.setRoleName("Student");
			break;
		}
		default:
			
		}
	}

	@Override
	public ResponseDTO updateUser(UserDTO userDTO) {
		
		 ResponseDTO response = new ResponseDTO();
		    try {
		        _dbConnection = DbContext.getConnection();
		        String query = "UPDATE user SET firstName=?, lastName=?, email=?, phoneNumber=? WHERE id=?";
		        _preparedStatement = _dbConnection.prepareStatement(query);

		        _preparedStatement.setString(1, userDTO.getFirstName());
		        _preparedStatement.setString(2, userDTO.getLastName());
		        _preparedStatement.setString(3, userDTO.getEmail());
		        _preparedStatement.setString(4, userDTO.getPhoneNumber());
		        _preparedStatement.setInt(5, userDTO.getId());

		        int resultSet = _preparedStatement.executeUpdate();

		        if (resultSet > 0) {
		            response.setMassage("User has been updated successfully.");
		            response.setSucces(true);
		        } else {
		            response.setMassage("User update failed.");
		            response.setSucces(false);
		        }

		        _dbConnection.close();
		    } catch (Exception ex) {
		        ex.printStackTrace();
		        response.setMassage("Error occurred while updating user.");
		        response.setSucces(false);
		    }
		return response;
	}
	
	

	

}
