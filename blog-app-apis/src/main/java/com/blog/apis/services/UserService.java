package com.blog.apis.services;

import java.util.List;

//import com.blog.apis.entites.User;
import com.blog.apis.payloads.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userID);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);

}
