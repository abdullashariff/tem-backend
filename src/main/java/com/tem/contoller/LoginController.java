package com.tem.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tem.workorder.dto.UserDTO;
import com.tem.workorder.service.UserService;

@RestController
public class LoginController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json")
	UserDTO getLocations(@RequestBody UserDTO userDTO) {
		return userService.findUser(userDTO);
	}
}
