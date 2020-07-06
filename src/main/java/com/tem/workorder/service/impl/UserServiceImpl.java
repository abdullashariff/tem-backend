package com.tem.workorder.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tem.workorder.dto.UserDTO;
import com.tem.workorder.entity.User;
import com.tem.workorder.repository.UserRepository;
import com.tem.workorder.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository 	userRepository; 
	
	@Override
	public UserDTO findUser(UserDTO userDto) {
		
		if(null == userDto.getUserId() || null == userDto.getPassword()) {
			return new UserDTO();	
		}
		
		List<User> users =  userRepository.findByUserIdAndPassword(userDto.getUserId(), userDto.getPassword());
		
		UserDTO user = new UserDTO();
		
		if(null != users && 0 != users.size()) {
			BeanUtils.copyProperties(users.get(0), user);
		}
		return user;
	}
}
