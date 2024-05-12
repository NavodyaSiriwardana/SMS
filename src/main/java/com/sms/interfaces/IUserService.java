package com.sms.interfaces;

import java.util.List;

import com.sms.dto.BasicUserDetailDTO;
import com.sms.dto.UserDTO;
import com.sms.dto.common.ResponseDTO;
import com.sms.model.User;

public interface IUserService {
	
	public User login(String emai, String password);
	
	public ResponseDTO createNewUser(UserDTO userDTO);
	
	public List<BasicUserDetailDTO> getUsers();
	
	public ResponseDTO deleteUser(int id);
	
	public ResponseDTO updateUser(UserDTO userDTO);
	

}
