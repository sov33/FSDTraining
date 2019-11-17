package com.ibm.fsd.capsule.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.fsd.capsule.backend.entity.User;
import com.ibm.fsd.capsule.backend.repository.UserRepository;

@RestController
public class LoginController {

	@Autowired
	UserRepository userRepository;

	public String login(String username, String password) {
		List<User> userList = userRepository.findByUserNameAndSort(username);
		if (userList.size() != 1) {
			return "NG";
		}
		User user = userList.get(0);
		if (user.getPassword() != null && user.getPassword().equals(password)) {
			return "OK";
		}
		return "NG";
	}
}
