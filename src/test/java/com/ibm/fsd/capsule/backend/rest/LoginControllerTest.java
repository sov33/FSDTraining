package com.ibm.fsd.capsule.backend.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class LoginControllerTest {

	@Autowired
	LoginController loginController;
	
	@Test
	@Transactional
	public void testLoginSuccess() {
		String result = loginController.login("mulder", "123456");
		assertEquals(result, "OK");
	}
}
