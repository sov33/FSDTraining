package com.ibm.fsd.capsule.backend.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.fsd.capsule.backend.entity.User;

@SpringBootTest
public class TestUserRepository {

	@Autowired
	UserRepository userRepository;
	
	@Test
	@Transactional
	public void testFindOne() throws Exception{
		Optional<User> user = userRepository.findById(1L);
		System.out.println(user);
		assertNotNull(user);
	}
	
	@Test
	@Transactional
	public void testFindByUserNameAndSort() throws Exception{
		List<User> user = userRepository.findByUserNameAndSort("mulder");

		assertNotNull(user);
		assertEquals(user.size(), 1);
		System.out.println(user.size());
	}
}
